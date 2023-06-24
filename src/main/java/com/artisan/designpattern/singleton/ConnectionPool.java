package com.artisan.designpattern.singleton;

public class ConnectionPool {
    private static ConnectionPool pool;

    private ConnectionPool() {
        // Prevent form the reflection api.
        if (pool != null) {
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
    }

    public static ConnectionPool getPool() {
        // Double check locking pattern
        if (pool == null) { // Check for the first time
            synchronized (ConnectionPool.class) { // Check for the second time.
                if (pool == null) pool = new ConnectionPool();
            }
        }
        return pool;
    }

    // This method is called immediately after an object of this class is deserialized.protected
    Object readResolve() {
        return getPool();
    }
}