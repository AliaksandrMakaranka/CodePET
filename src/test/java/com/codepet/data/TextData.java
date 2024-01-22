package com.codepet.data;

public class TextData {
    private static final String MIN_TEXT_VALUE = "0123456789";
    private static final String MAX_TEXT_VALUE = "HvjRZ4nNUGtA6cLtYbFjN6kvxs86r6U1Y9LFaIlTKd3dFZpG8DLz0m27RwGTGmj1SM9d2" +
                                                 "FToKjwxXbH6K0ld4P3kSWzsoYi6qjJ88N1f7BxuX7cZ1YpQVhFzOT9lZnOxX4elh44pZxw" +
                                                 "6RpctaaLr7lA5GPG50rVpE6Sj9G3GxtHTb9GyjZgr5z8Sb9ZtH7kDc1o5y1ZzJ86AmYj6h" +
                                                 "20gyx1gVY1N1bD5zN6FdGYAsC1YARfMJZOJwWLRrB8z3XgGQrYFP3tWcFQ5N5B4BtC9J1f" +
                                                 "GR0mWZR4Jbl0JN1SfbrZK3mCVg1fXG1hf1GtI5wYOFyXtR8KgY6T0RgXgB3H2VQf4Js9hzZ" +
                                                 "6v7w4AeF1AmM1eDJ4jP4SwX6MGGfDZpC2RZV4e3bXgAzWjYF1G3K1vEoKxS91DZUv6HFW2Hq" +
                                                 "2J8EgVgXVfG2HlVYh7H3XcA9H1gWxkIvN4gMKJUj4o1E2j1FI3GJxh4l2eVbAz1JUZjvzF0" +
                                                 "gDKj0QvKC2SF3JR7w7G8QGj0Zg6G6xg8ZP2WZgZ3W9l1eCZpWvS9iQdYBvRzI3XgFgZQ4V" +
                                                 "3N1JZsG8WjUxhUzZ0g1S3cFI3BdFCaHxh4L0O6ZP4IyFgPd5D0dFGgK6SvYFxuFX2gRFiF" +
                                                 "9kWRjY5B7oC4Y1f7v9cMvZJY3TJW2D2S3gQ8XgD1R2vZLs2Nz9M7X8A3g2S1W0A2hA2W9P" +
                                                 "f9pT2zZb3YvH2d3G4vL3Kc6NvL9o0H1W8vYR9E6V3V2p3I2";


    private static final String OVER_MAX_TEXT_VALUE = MAX_TEXT_VALUE + "1";
    private static final String OVER_MIN_TEXT_VALUE = "123456789";
    private static final String EMPTY_TEXT = "";

    public static String getMinTextValue() {
        return MIN_TEXT_VALUE;
    }

    public static String getMaxTextValue() {
        return MAX_TEXT_VALUE;
    }

    public static String getOverMinTextValue() {
        return OVER_MIN_TEXT_VALUE;
    }

    public static String getOverMaxTextValue() {
        return OVER_MAX_TEXT_VALUE;
    }

    public static String getEmptyText() {
        return EMPTY_TEXT;
    }
}
