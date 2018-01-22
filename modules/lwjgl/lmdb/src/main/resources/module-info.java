/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
module org.lwjgl.lmdb {
    requires transitive org.lwjgl;
    requires static org.lwjgl.lmdb.natives;

    exports org.lwjgl.util.lmdb;
}