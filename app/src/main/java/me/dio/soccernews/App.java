package me.dio.soccernews;

import android.app.Application;

/**
 * FIXME We centralize an instance of the context in our {@link App} (even though it is an "anti-pattern") to get the most out of our
 * ViewModels and data access layer. However, despite our layers becoming more cohesive, the ideal would be to use a
 * dependency injection (like Dagger or Hilt).
 *
 * @see <a href="https://stackoverflow.com/a/14057777/3072570">Android Singleton with Global Context</a>
 */
public class App extends Application {

    private static App instance;

    public static App getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }
}