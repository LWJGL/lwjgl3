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
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct InputOriginInfo_t {
 *     VRInputValueHandle_t devicePath;
 *     TrackedDeviceIndex_t trackedDeviceIndex;
 *     char rchRenderModelComponentName[128];
 * }</code></pre>
 */
@NativeType("struct InputOriginInfo_t")
public class InputOriginInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        DEVICEPATH,
        TRACKEDDEVICEINDEX,
        RCHRENDERMODELCOMPONENTNAME;

    static {
        Layout layout = __struct(
            __member(8),
            __member(4),
            __array(1, 128)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        DEVICEPATH = layout.offsetof(0);
        TRACKEDDEVICEINDEX = layout.offsetof(1);
        RCHRENDERMODELCOMPONENTNAME = layout.offsetof(2);
    }

    /**
     * Creates a {@code InputOriginInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public InputOriginInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code devicePath} field. */
    @NativeType("VRInputValueHandle_t")
    public long devicePath() { return ndevicePath(address()); }
    /** @return the value of the {@code trackedDeviceIndex} field. */
    @NativeType("TrackedDeviceIndex_t")
    public int trackedDeviceIndex() { return ntrackedDeviceIndex(address()); }
    /** @return a {@link ByteBuffer} view of the {@code rchRenderModelComponentName} field. */
    @NativeType("char[128]")
    public ByteBuffer rchRenderModelComponentName() { return nrchRenderModelComponentName(address()); }
    /** @return the null-terminated string stored in the {@code rchRenderModelComponentName} field. */
    @NativeType("char[128]")
    public String rchRenderModelComponentNameString() { return nrchRenderModelComponentNameString(address()); }

    // -----------------------------------

    /** Returns a new {@code InputOriginInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static InputOriginInfo malloc() {
        return wrap(InputOriginInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code InputOriginInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static InputOriginInfo calloc() {
        return wrap(InputOriginInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code InputOriginInfo} instance allocated with {@link BufferUtils}. */
    public static InputOriginInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(InputOriginInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code InputOriginInfo} instance for the specified memory address. */
    public static InputOriginInfo create(long address) {
        return wrap(InputOriginInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static InputOriginInfo createSafe(long address) {
        return address == NULL ? null : wrap(InputOriginInfo.class, address);
    }

    /**
     * Returns a new {@link InputOriginInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static InputOriginInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link InputOriginInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static InputOriginInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link InputOriginInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static InputOriginInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link InputOriginInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static InputOriginInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static InputOriginInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static InputOriginInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static InputOriginInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static InputOriginInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static InputOriginInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static InputOriginInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static InputOriginInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static InputOriginInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static InputOriginInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code InputOriginInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static InputOriginInfo malloc(MemoryStack stack) {
        return wrap(InputOriginInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code InputOriginInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static InputOriginInfo calloc(MemoryStack stack) {
        return wrap(InputOriginInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link InputOriginInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static InputOriginInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link InputOriginInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static InputOriginInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #devicePath}. */
    public static long ndevicePath(long struct) { return UNSAFE.getLong(null, struct + InputOriginInfo.DEVICEPATH); }
    /** Unsafe version of {@link #trackedDeviceIndex}. */
    public static int ntrackedDeviceIndex(long struct) { return UNSAFE.getInt(null, struct + InputOriginInfo.TRACKEDDEVICEINDEX); }
    /** Unsafe version of {@link #rchRenderModelComponentName}. */
    public static ByteBuffer nrchRenderModelComponentName(long struct) { return memByteBuffer(struct + InputOriginInfo.RCHRENDERMODELCOMPONENTNAME, 128); }
    /** Unsafe version of {@link #rchRenderModelComponentNameString}. */
    public static String nrchRenderModelComponentNameString(long struct) { return memUTF8(struct + InputOriginInfo.RCHRENDERMODELCOMPONENTNAME); }

    // -----------------------------------

    /** An array of {@link InputOriginInfo} structs. */
    public static class Buffer extends StructBuffer<InputOriginInfo, Buffer> implements NativeResource {

        private static final InputOriginInfo ELEMENT_FACTORY = InputOriginInfo.create(-1L);

        /**
         * Creates a new {@code InputOriginInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link InputOriginInfo#SIZEOF}, and its mark will be undefined.
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
        protected InputOriginInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code devicePath} field. */
        @NativeType("VRInputValueHandle_t")
        public long devicePath() { return InputOriginInfo.ndevicePath(address()); }
        /** @return the value of the {@code trackedDeviceIndex} field. */
        @NativeType("TrackedDeviceIndex_t")
        public int trackedDeviceIndex() { return InputOriginInfo.ntrackedDeviceIndex(address()); }
        /** @return a {@link ByteBuffer} view of the {@code rchRenderModelComponentName} field. */
        @NativeType("char[128]")
        public ByteBuffer rchRenderModelComponentName() { return InputOriginInfo.nrchRenderModelComponentName(address()); }
        /** @return the null-terminated string stored in the {@code rchRenderModelComponentName} field. */
        @NativeType("char[128]")
        public String rchRenderModelComponentNameString() { return InputOriginInfo.nrchRenderModelComponentNameString(address()); }

    }

}