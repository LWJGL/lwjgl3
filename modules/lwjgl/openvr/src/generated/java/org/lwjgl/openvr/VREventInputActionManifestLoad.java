/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VREvent_InputActionManifestLoad_t {
 *     uint64_t pathAppKey;
 *     uint64_t pathMessage;
 *     uint64_t pathMessageParam;
 *     uint64_t pathManifestPath;
 * }</code></pre>
 */
@NativeType("struct VREvent_InputActionManifestLoad_t")
public class VREventInputActionManifestLoad extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PATHAPPKEY,
        PATHMESSAGE,
        PATHMESSAGEPARAM,
        PATHMANIFESTPATH;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PATHAPPKEY = layout.offsetof(0);
        PATHMESSAGE = layout.offsetof(1);
        PATHMESSAGEPARAM = layout.offsetof(2);
        PATHMANIFESTPATH = layout.offsetof(3);
    }

    /**
     * Creates a {@code VREventInputActionManifestLoad} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VREventInputActionManifestLoad(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code pathAppKey} field. */
    @NativeType("uint64_t")
    public long pathAppKey() { return npathAppKey(address()); }
    /** @return the value of the {@code pathMessage} field. */
    @NativeType("uint64_t")
    public long pathMessage() { return npathMessage(address()); }
    /** @return the value of the {@code pathMessageParam} field. */
    @NativeType("uint64_t")
    public long pathMessageParam() { return npathMessageParam(address()); }
    /** @return the value of the {@code pathManifestPath} field. */
    @NativeType("uint64_t")
    public long pathManifestPath() { return npathManifestPath(address()); }

    // -----------------------------------

    /** Returns a new {@code VREventInputActionManifestLoad} instance for the specified memory address. */
    public static VREventInputActionManifestLoad create(long address) {
        return wrap(VREventInputActionManifestLoad.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VREventInputActionManifestLoad createSafe(long address) {
        return address == NULL ? null : wrap(VREventInputActionManifestLoad.class, address);
    }

    /**
     * Create a {@link VREventInputActionManifestLoad.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VREventInputActionManifestLoad.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VREventInputActionManifestLoad.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #pathAppKey}. */
    public static long npathAppKey(long struct) { return UNSAFE.getLong(null, struct + VREventInputActionManifestLoad.PATHAPPKEY); }
    /** Unsafe version of {@link #pathMessage}. */
    public static long npathMessage(long struct) { return UNSAFE.getLong(null, struct + VREventInputActionManifestLoad.PATHMESSAGE); }
    /** Unsafe version of {@link #pathMessageParam}. */
    public static long npathMessageParam(long struct) { return UNSAFE.getLong(null, struct + VREventInputActionManifestLoad.PATHMESSAGEPARAM); }
    /** Unsafe version of {@link #pathManifestPath}. */
    public static long npathManifestPath(long struct) { return UNSAFE.getLong(null, struct + VREventInputActionManifestLoad.PATHMANIFESTPATH); }

    // -----------------------------------

    /** An array of {@link VREventInputActionManifestLoad} structs. */
    public static class Buffer extends StructBuffer<VREventInputActionManifestLoad, Buffer> {

        private static final VREventInputActionManifestLoad ELEMENT_FACTORY = VREventInputActionManifestLoad.create(-1L);

        /**
         * Creates a new {@code VREventInputActionManifestLoad.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VREventInputActionManifestLoad#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected VREventInputActionManifestLoad getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code pathAppKey} field. */
        @NativeType("uint64_t")
        public long pathAppKey() { return VREventInputActionManifestLoad.npathAppKey(address()); }
        /** @return the value of the {@code pathMessage} field. */
        @NativeType("uint64_t")
        public long pathMessage() { return VREventInputActionManifestLoad.npathMessage(address()); }
        /** @return the value of the {@code pathMessageParam} field. */
        @NativeType("uint64_t")
        public long pathMessageParam() { return VREventInputActionManifestLoad.npathMessageParam(address()); }
        /** @return the value of the {@code pathManifestPath} field. */
        @NativeType("uint64_t")
        public long pathManifestPath() { return VREventInputActionManifestLoad.npathManifestPath(address()); }

    }

}