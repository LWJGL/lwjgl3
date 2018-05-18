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
 * <code><pre>
 * struct VREvent_InputBindingLoad_t {
 *     PropertyContainerHandle_t ulAppContainer;
 *     uint64_t pathMessage;
 *     uint64_t pathUrl;
 * }</pre></code>
 */
@NativeType("struct VREvent_InputBindingLoad_t")
public class VREventInputBindingLoad extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ULAPPCONTAINER,
        PATHMESSAGE,
        PATHURL;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ULAPPCONTAINER = layout.offsetof(0);
        PATHMESSAGE = layout.offsetof(1);
        PATHURL = layout.offsetof(2);
    }

    VREventInputBindingLoad(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VREventInputBindingLoad} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VREventInputBindingLoad(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code ulAppContainer} field. */
    @NativeType("PropertyContainerHandle_t")
    public long ulAppContainer() { return nulAppContainer(address()); }
    /** Returns the value of the {@code pathMessage} field. */
    @NativeType("uint64_t")
    public long pathMessage() { return npathMessage(address()); }
    /** Returns the value of the {@code pathUrl} field. */
    @NativeType("uint64_t")
    public long pathUrl() { return npathUrl(address()); }

    // -----------------------------------

    /** Returns a new {@link VREventInputBindingLoad} instance for the specified memory address. */
    public static VREventInputBindingLoad create(long address) {
        return new VREventInputBindingLoad(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VREventInputBindingLoad createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Create a {@link VREventInputBindingLoad.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VREventInputBindingLoad.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VREventInputBindingLoad.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #ulAppContainer}. */
    public static long nulAppContainer(long struct) { return memGetLong(struct + VREventInputBindingLoad.ULAPPCONTAINER); }
    /** Unsafe version of {@link #pathMessage}. */
    public static long npathMessage(long struct) { return memGetLong(struct + VREventInputBindingLoad.PATHMESSAGE); }
    /** Unsafe version of {@link #pathUrl}. */
    public static long npathUrl(long struct) { return memGetLong(struct + VREventInputBindingLoad.PATHURL); }

    // -----------------------------------

    /** An array of {@link VREventInputBindingLoad} structs. */
    public static class Buffer extends StructBuffer<VREventInputBindingLoad, Buffer> {

        /**
         * Creates a new {@link VREventInputBindingLoad.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VREventInputBindingLoad#SIZEOF}, and its mark will be undefined.
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
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected VREventInputBindingLoad newInstance(long address) {
            return new VREventInputBindingLoad(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code ulAppContainer} field. */
        @NativeType("PropertyContainerHandle_t")
        public long ulAppContainer() { return VREventInputBindingLoad.nulAppContainer(address()); }
        /** Returns the value of the {@code pathMessage} field. */
        @NativeType("uint64_t")
        public long pathMessage() { return VREventInputBindingLoad.npathMessage(address()); }
        /** Returns the value of the {@code pathUrl} field. */
        @NativeType("uint64_t")
        public long pathUrl() { return VREventInputBindingLoad.npathUrl(address()); }

    }

}