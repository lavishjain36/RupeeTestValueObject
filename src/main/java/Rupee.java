import java.util.Objects;

public class Rupee {
    private final int amount;

    public Rupee(int amount) {
        this.amount=amount;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rupee)) return false;
        Rupee rupee = (Rupee) o;
        return amount == rupee.amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
