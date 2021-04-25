package davetcode.lxi.models;

public class CpuState {
  private int A;
  private int B;
  private int C;
  private int D;
  private int E;
  private int H;
  private int L;
  private int StackPointer;
  private int ProgramCounter;
  private long Cycles;
  private CpuFlags Flags;
  private boolean InterruptsEnabled;
  
  public CpuState(int a, int b, int c, int d, int e, int h, int l, int stackPointer, int programCounter,
      long cycles, CpuFlags flags, boolean interruptsEnabled) {
    setA(a);
    setB(b);
    setC(c);
    setD(d);
    setE(e);
    setH(h);
    setL(l);
    setStackPointer(stackPointer);
    setProgramCounter(programCounter);
    setCycles(cycles);
    setFlags(flags);
    setInterruptsEnabled(interruptsEnabled);
  }

  public CpuFlags getFlags() {
    return Flags;
  }

  public void setFlags(CpuFlags flags) {
    this.Flags = flags;
  }

  public long getCycles() {
    return Cycles;
  }

  public void setCycles(long cycles) {
    this.Cycles = cycles;
  }

  public int getProgramCounter() {
    return ProgramCounter;
  }

  public void setProgramCounter(int programCounter) {
    this.ProgramCounter = programCounter;
  }

  public int getStackPointer() {
    return StackPointer;
  }

  public void setStackPointer(int stackPointer) {
    this.StackPointer = stackPointer;
  }

  public int getL() {
    return L;
  }

  public void setL(int l) {
    this.L = l;
  }

  public int getH() {
    return H;
  }

  public void setH(int h) {
    this.H = h;
  }

  public int getE() {
    return E;
  }

  public void setE(int e) {
    this.E = e;
  }

  public int getD() {
    return D;
  }

  public void setD(int d) {
    this.D = d;
  }

  public int getC() {
    return C;
  }

  public void setC(int c) {
    this.C = c;
  }

  public int getB() {
    return B;
  }

  public void setB(int b) {
    this.B = b;
  }

  public int getA() {
    return A;
  }

  public void setA(int a) {
    this.A = a;
  }

  public void setInterruptsEnabled(boolean interruptsEnabled) {
    this.InterruptsEnabled = interruptsEnabled;
  }

  public boolean isInterruptsEnabled() {
    return InterruptsEnabled;
  }
}
