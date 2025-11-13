import java.util.Objects;

public class PillCounterDecorator implements PillCounter {
  private int pillCount = 0;
  private final PillCounter delegate;

  public PillCounterDecorator(PillCounter base) {
    Objects.requireNonNull(base, "base cannot be null");
    this.delegate = base;
  }

  @Override
  public void addPill(int count) {
    delegate.addPill(count);
    pillCount++;
  }

  @Override
  public void removePill() {
    delegate.removePill();
  }

  @Override
  public void reset() {
    delegate.reset();
  }

  @Override
  public int getPillCount() {
    return pillCount;
  }

}

