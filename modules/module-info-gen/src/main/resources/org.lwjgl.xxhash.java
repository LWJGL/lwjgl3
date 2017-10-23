module org.lwjgl.xxhash {
    requires transitive org.lwjgl;
    requires transitive org.lwjgl.xxhash.natives;

    exports org.lwjgl.util.xxhash;
}