/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Allows specifying pose used to render provided scene texture (if different from value returned by {@link VRCompositor#VRCompositor_WaitGetPoses WaitGetPoses}).
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code mDeviceToAbsoluteTracking} &ndash; actual pose used to render scene textures</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VRTextureWithPose_t {
 *     {@link HmdMatrix34 HmdMatrix34_t} mDeviceToAbsoluteTracking;
 * }</code></pre>
 */
@NativeType("struct VRTextureWithPose_t")
public class VRTextureWithPose extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MDEVICETOABSOLUTETRACKING;

    static {
        Layout layout = __struct(
            __member(HmdMatrix34.SIZEOF, HmdMatrix34.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MDEVICETOABSOLUTETRACKING = layout.offsetof(0);
    }

    /**
     * Creates a {@code VRTextureWithPose} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VRTextureWithPose(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link HmdMatrix34} view of the {@code mDeviceToAbsoluteTracking} field. */
    @NativeType("HmdMatrix34_t")
    public HmdMatrix34 mDeviceToAbsoluteTracking() { return nmDeviceToAbsoluteTracking(address()); }

    /** Copies the specified {@link HmdMatrix34} to the {@code mDeviceToAbsoluteTracking} field. */
    public VRTextureWithPose mDeviceToAbsoluteTracking(@NativeType("HmdMatrix34_t") HmdMatrix34 value) { nmDeviceToAbsoluteTracking(address(), value); return this; }
    /** Passes the {@code mDeviceToAbsoluteTracking} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VRTextureWithPose mDeviceToAbsoluteTracking(java.util.function.Consumer<HmdMatrix34> consumer) { consumer.accept(mDeviceToAbsoluteTracking()); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VRTextureWithPose set(VRTextureWithPose src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VRTextureWithPose} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VRTextureWithPose malloc() {
        return wrap(VRTextureWithPose.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VRTextureWithPose} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VRTextureWithPose calloc() {
        return wrap(VRTextureWithPose.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VRTextureWithPose} instance allocated with {@link BufferUtils}. */
    public static VRTextureWithPose create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VRTextureWithPose.class, memAddress(container), container);
    }

    /** Returns a new {@code VRTextureWithPose} instance for the specified memory address. */
    public static VRTextureWithPose create(long address) {
        return wrap(VRTextureWithPose.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VRTextureWithPose createSafe(long address) {
        return address == NULL ? null : wrap(VRTextureWithPose.class, address);
    }

    /**
     * Returns a new {@link VRTextureWithPose.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VRTextureWithPose.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VRTextureWithPose.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VRTextureWithPose.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VRTextureWithPose.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VRTextureWithPose.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VRTextureWithPose.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VRTextureWithPose.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VRTextureWithPose.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VRTextureWithPose} instance allocated on the thread-local {@link MemoryStack}. */
    public static VRTextureWithPose mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VRTextureWithPose} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VRTextureWithPose callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VRTextureWithPose} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VRTextureWithPose mallocStack(MemoryStack stack) {
        return wrap(VRTextureWithPose.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VRTextureWithPose} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VRTextureWithPose callocStack(MemoryStack stack) {
        return wrap(VRTextureWithPose.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VRTextureWithPose.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VRTextureWithPose.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VRTextureWithPose.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VRTextureWithPose.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VRTextureWithPose.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VRTextureWithPose.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VRTextureWithPose.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VRTextureWithPose.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #mDeviceToAbsoluteTracking}. */
    public static HmdMatrix34 nmDeviceToAbsoluteTracking(long struct) { return HmdMatrix34.create(struct + VRTextureWithPose.MDEVICETOABSOLUTETRACKING); }

    /** Unsafe version of {@link #mDeviceToAbsoluteTracking(HmdMatrix34) mDeviceToAbsoluteTracking}. */
    public static void nmDeviceToAbsoluteTracking(long struct, HmdMatrix34 value) { memCopy(value.address(), struct + VRTextureWithPose.MDEVICETOABSOLUTETRACKING, HmdMatrix34.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VRTextureWithPose} structs. */
    public static class Buffer extends StructBuffer<VRTextureWithPose, Buffer> implements NativeResource {

        private static final VRTextureWithPose ELEMENT_FACTORY = VRTextureWithPose.create(-1L);

        /**
         * Creates a new {@code VRTextureWithPose.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VRTextureWithPose#SIZEOF}, and its mark will be undefined.
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
        protected VRTextureWithPose getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns a {@link HmdMatrix34} view of the {@code mDeviceToAbsoluteTracking} field. */
        @NativeType("HmdMatrix34_t")
        public HmdMatrix34 mDeviceToAbsoluteTracking() { return VRTextureWithPose.nmDeviceToAbsoluteTracking(address()); }

        /** Copies the specified {@link HmdMatrix34} to the {@code mDeviceToAbsoluteTracking} field. */
        public VRTextureWithPose.Buffer mDeviceToAbsoluteTracking(@NativeType("HmdMatrix34_t") HmdMatrix34 value) { VRTextureWithPose.nmDeviceToAbsoluteTracking(address(), value); return this; }
        /** Passes the {@code mDeviceToAbsoluteTracking} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VRTextureWithPose.Buffer mDeviceToAbsoluteTracking(java.util.function.Consumer<HmdMatrix34> consumer) { consumer.accept(mDeviceToAbsoluteTracking()); return this; }

    }

}