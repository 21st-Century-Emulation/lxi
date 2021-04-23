package davetcode.lxi.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;

import davetcode.lxi.models.Cpu;

@RestController
@RequestMapping(path = "/api/v1")
public class ExecuteController {
  
  @PostMapping(path = "/execute", consumes = "application/json", produces = "application/json")
  public Cpu Execute(@RequestBody Cpu cpu, @RequestParam("operand1") int lowByte, @RequestParam("operand2") int highByte) {
    switch (cpu.getOpcode())
    {
      case 0x01:
        cpu.getState().setB(highByte);
        cpu.getState().setC(lowByte);
        break;
      case 0x11:
        cpu.getState().setD(highByte);
        cpu.getState().setE(lowByte);
        break;
      case 0x21:
        cpu.getState().setH(highByte);
        cpu.getState().setL(lowByte);
        break;
      case 0x31:
        cpu.getState().setStackPointer((highByte << 8) | lowByte);
        break;
    }

    cpu.getState().setCycles(cpu.getState().getCycles() + 10);

    return cpu;
  }
}
