package davetcode.lxi.models;

public class Cpu {
  private short Opcode;

  private String Id;

  private CpuState State;

  public Cpu(short opcode, String id, CpuState state) {
    setOpcode(opcode);
    setId(id);
    setState(state);
  }

  public CpuState getState() {
    return State;
  }

  public void setState(CpuState state) {
    this.State = state;
  }

  public String getId() {
    return Id;
  }

  public void setId(String id) {
    this.Id = id;
  }

  public short getOpcode() {
    return Opcode;
  }

  public void setOpcode(short opcode) {
    this.Opcode = opcode;
  }
}
