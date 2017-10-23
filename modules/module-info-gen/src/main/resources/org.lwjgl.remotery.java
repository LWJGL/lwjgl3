module org.lwjgl.remotery {
    requires transitive org.lwjgl;
    requires transitive org.lwjgl.remotery.natives;

    exports org.lwjgl.util.remotery;
}