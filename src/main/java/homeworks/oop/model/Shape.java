package homeworks.oop.model;

public class Shape {
    private final double opacity;

    public static abstract class Builder<T extends Builder<T>> {
        private double opacity;

        protected abstract T self();

        public T opacity(double opacity) {
            this.opacity = opacity;
            return self();
        }

        public Shape build() {
            return new Shape(this);
        }
    }

    private static class Builder2 extends Builder<Builder2> {
        @Override
        protected Builder2 self() {
            return this;
        }
    }

    public static Builder<?> builder() {
        return new Builder2();
    }

    protected Shape(Builder<?> builder) {
        this.opacity = builder.opacity;
    }
}


class Rectangle extends Shape {
    private final double height;

    public static abstract class Builder<T extends Builder<T>> extends Shape.Builder<T> {
        private double height;

        public T height(double height) {
            this.height = height;
            return self();
        }

        public Rectangle build() {
            return new Rectangle(this);
        }
    }

    private static class Builder2 extends Builder<Builder2> {
        @Override
        protected Builder2 self() {
            return this;
        }
    }

    public static Builder<?> builder() {
        return new Builder2();
    }

    protected Rectangle(Builder<?> builder) {
        super(builder);
        this.height = builder.height;
    }
}
