package davetcode.lxi.models;

public class Cpu {
  private short Opcode;

  private CpuState State;

  public Cpu(short opcode, CpuState state) {
    setOpcode(opcode);
    setState(state);
  }

  public CpuState getState() {
    return State;
  }

  public void setState(CpuState state) {
    this.State = state;
  }

  public short getOpcode() {
    return Opcode;
  }

  public void setOpcode(short opcode) {
    this.Opcode = opcode;
  }
}
