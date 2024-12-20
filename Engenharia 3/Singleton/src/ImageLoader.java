public class ImageLoader {
    private static ImageLoader instance;

    private ImageLoader() {}

    public static ImageLoader getInstance() {
        if (instance == null) {
            instance = new ImageLoader();
        }
        return instance;
    }

    public FakeImage loadImage(String color) {
        return new FakeImage(color);
    }

    @Override
    public String toString() {
        return "ImageLoader Instance: " + this.hashCode();
    }
}