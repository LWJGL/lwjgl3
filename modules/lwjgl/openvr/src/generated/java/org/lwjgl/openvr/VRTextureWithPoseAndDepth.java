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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VRTextureWithPoseAndDepth_t {
 *     void * handle;
 *     ETextureType eType;
 *     EColorSpace eColorSpace;
 *     {@link HmdMatrix34 HmdMatrix34_t} mDeviceToAbsoluteTracking;
 *     {@link VRTextureDepthInfo VRTextureDepthInfo_t} depth;
 * }</code></pre>
 */
@NativeType("struct VRTextureWithPoseAndDepth_t")
public class VRTextureWithPoseAndDepth extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        HANDLE,
        ETYPE,
        ECOLORSPACE,
        MDEVICETOABSOLUTETRACKING,
        DEPTH;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(HmdMatrix34.SIZEOF, HmdMatrix34.ALIGNOF),
            __member(VRTextureDepthInfo.SIZEOF, VRTextureDepthInfo.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        HANDLE = layout.offsetof(0);
        ETYPE = layout.offsetof(1);
        ECOLORSPACE = layout.offsetof(2);
        MDEVICETOABSOLUTETRACKING = layout.offsetof(3);
        DEPTH = layout.offsetof(4);
    }

    /**
     * Creates a {@code VRTextureWithPoseAndDepth} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VRTextureWithPoseAndDepth(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code handle} field. */
    @NativeType("void *")
    public long handle() { return nhandle(address()); }
    /** Returns the value of the {@code eType} field. */
    @NativeType("ETextureType")
    public int eType() { return neType(address()); }
    /** Returns the value of the {@code eColorSpace} field. */
    @NativeType("EColorSpace")
    public int eColorSpace() { return neColorSpace(address()); }
    /** Returns a {@link HmdMatrix34} view of the {@code mDeviceToAbsoluteTracking} field. */
    @NativeType("HmdMatrix34_t")
    public HmdMatrix34 mDeviceToAbsoluteTracking() { return nmDeviceToAbsoluteTracking(address()); }
    /** Returns a {@link VRTextureDepthInfo} view of the {@code depth} field. */
    @NativeType("VRTextureDepthInfo_t")
    public VRTextureDepthInfo depth() { return ndepth(address()); }

    /** Sets the specified value to the {@code handle} field. */
    public VRTextureWithPoseAndDepth handle(@NativeType("void *") long value) { nhandle(address(), value); return this; }
    /** Sets the specified value to the {@code eType} field. */
    public VRTextureWithPoseAndDepth eType(@NativeType("ETextureType") int value) { neType(address(), value); return this; }
    /** Sets the specified value to the {@code eColorSpace} field. */
    public VRTextureWithPoseAndDepth eColorSpace(@NativeType("EColorSpace") int value) { neColorSpace(address(), value); return this; }
    /** Copies the specified {@link HmdMatrix34} to the {@code mDeviceToAbsoluteTracking} field. */
    public VRTextureWithPoseAndDepth mDeviceToAbsoluteTracking(@NativeType("HmdMatrix34_t") HmdMatrix34 value) { nmDeviceToAbsoluteTracking(address(), value); return this; }
    /** Passes the {@code mDeviceToAbsoluteTracking} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VRTextureWithPoseAndDepth mDeviceToAbsoluteTracking(java.util.function.Consumer<HmdMatrix34> consumer) { consumer.accept(mDeviceToAbsoluteTracking()); return this; }
    /** Copies the specified {@link VRTextureDepthInfo} to the {@code depth} field. */
    public VRTextureWithPoseAndDepth depth(@NativeType("VRTextureDepthInfo_t") VRTextureDepthInfo value) { ndepth(address(), value); return this; }
    /** Passes the {@code depth} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VRTextureWithPoseAndDepth depth(java.util.function.Consumer<VRTextureDepthInfo> consumer) { consumer.accept(depth()); return this; }

    /** Initializes this struct with the specified values. */
    public VRTextureWithPoseAndDepth set(
        long handle,
        int eType,
        int eColorSpace,
        HmdMatrix34 mDeviceToAbsoluteTracking,
        VRTextureDepthInfo depth
    ) {
        handle(handle);
        eType(eType);
        eColorSpace(eColorSpace);
        mDeviceToAbsoluteTracking(mDeviceToAbsoluteTracking);
        depth(depth);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VRTextureWithPoseAndDepth set(VRTextureWithPoseAndDepth src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VRTextureWithPoseAndDepth} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VRTextureWithPoseAndDepth malloc() {
        return wrap(VRTextureWithPoseAndDepth.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VRTextureWithPoseAndDepth} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VRTextureWithPoseAndDepth calloc() {
        return wrap(VRTextureWithPoseAndDepth.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VRTextureWithPoseAndDepth} instance allocated with {@link BufferUtils}. */
    public static VRTextureWithPoseAndDepth create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VRTextureWithPoseAndDepth.class, memAddress(container), container);
    }

    /** Returns a new {@code VRTextureWithPoseAndDepth} instance for the specified memory address. */
    public static VRTextureWithPoseAndDepth create(long address) {
        return wrap(VRTextureWithPoseAndDepth.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VRTextureWithPoseAndDepth createSafe(long address) {
        return address == NULL ? null : wrap(VRTextureWithPoseAndDepth.class, address);
    }

    /**
     * Returns a new {@link VRTextureWithPoseAndDepth.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VRTextureWithPoseAndDepth.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VRTextureWithPoseAndDepth.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VRTextureWithPoseAndDepth.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VRTextureWithPoseAndDepth.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VRTextureWithPoseAndDepth.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VRTextureWithPoseAndDepth.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VRTextureWithPoseAndDepth.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VRTextureWithPoseAndDepth.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VRTextureWithPoseAndDepth} instance allocated on the thread-local {@link MemoryStack}. */
    public static VRTextureWithPoseAndDepth mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VRTextureWithPoseAndDepth} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VRTextureWithPoseAndDepth callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VRTextureWithPoseAndDepth} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VRTextureWithPoseAndDepth mallocStack(MemoryStack stack) {
        return wrap(VRTextureWithPoseAndDepth.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VRTextureWithPoseAndDepth} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VRTextureWithPoseAndDepth callocStack(MemoryStack stack) {
        return wrap(VRTextureWithPoseAndDepth.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VRTextureWithPoseAndDepth.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VRTextureWithPoseAndDepth.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VRTextureWithPoseAndDepth.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VRTextureWithPoseAndDepth.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VRTextureWithPoseAndDepth.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VRTextureWithPoseAndDepth.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VRTextureWithPoseAndDepth.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VRTextureWithPoseAndDepth.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #handle}. */
    public static long nhandle(long struct) { return memGetAddress(struct + VRTextureWithPoseAndDepth.HANDLE); }
    /** Unsafe version of {@link #eType}. */
    public static int neType(long struct) { return UNSAFE.getInt(null, struct + VRTextureWithPoseAndDepth.ETYPE); }
    /** Unsafe version of {@link #eColorSpace}. */
    public static int neColorSpace(long struct) { return UNSAFE.getInt(null, struct + VRTextureWithPoseAndDepth.ECOLORSPACE); }
    /** Unsafe version of {@link #mDeviceToAbsoluteTracking}. */
    public static HmdMatrix34 nmDeviceToAbsoluteTracking(long struct) { return HmdMatrix34.create(struct + VRTextureWithPoseAndDepth.MDEVICETOABSOLUTETRACKING); }
    /** Unsafe version of {@link #depth}. */
    public static VRTextureDepthInfo ndepth(long struct) { return VRTextureDepthInfo.create(struct + VRTextureWithPoseAndDepth.DEPTH); }

    /** Unsafe version of {@link #handle(long) handle}. */
    public static void nhandle(long struct, long value) { memPutAddress(struct + VRTextureWithPoseAndDepth.HANDLE, check(value)); }
    /** Unsafe version of {@link #eType(int) eType}. */
    public static void neType(long struct, int value) { UNSAFE.putInt(null, struct + VRTextureWithPoseAndDepth.ETYPE, value); }
    /** Unsafe version of {@link #eColorSpace(int) eColorSpace}. */
    public static void neColorSpace(long struct, int value) { UNSAFE.putInt(null, struct + VRTextureWithPoseAndDepth.ECOLORSPACE, value); }
    /** Unsafe version of {@link #mDeviceToAbsoluteTracking(HmdMatrix34) mDeviceToAbsoluteTracking}. */
    public static void nmDeviceToAbsoluteTracking(long struct, HmdMatrix34 value) { memCopy(value.address(), struct + VRTextureWithPoseAndDepth.MDEVICETOABSOLUTETRACKING, HmdMatrix34.SIZEOF); }
    /** Unsafe version of {@link #depth(VRTextureDepthInfo) depth}. */
    public static void ndepth(long struct, VRTextureDepthInfo value) { memCopy(value.address(), struct + VRTextureWithPoseAndDepth.DEPTH, VRTextureDepthInfo.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VRTextureWithPoseAndDepth.HANDLE));
        VRTextureDepthInfo.validate(struct + VRTextureWithPoseAndDepth.DEPTH);
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link VRTextureWithPoseAndDepth} structs. */
    public static class Buffer extends StructBuffer<VRTextureWithPoseAndDepth, Buffer> implements NativeResource {

        private static final VRTextureWithPoseAndDepth ELEMENT_FACTORY = VRTextureWithPoseAndDepth.create(-1L);

        /**
         * Creates a new {@code VRTextureWithPoseAndDepth.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VRTextureWithPoseAndDepth#SIZEOF}, and its mark will be undefined.
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
        protected VRTextureWithPoseAndDepth getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code handle} field. */
        @NativeType("void *")
        public long handle() { return VRTextureWithPoseAndDepth.nhandle(address()); }
        /** Returns the value of the {@code eType} field. */
        @NativeType("ETextureType")
        public int eType() { return VRTextureWithPoseAndDepth.neType(address()); }
        /** Returns the value of the {@code eColorSpace} field. */
        @NativeType("EColorSpace")
        public int eColorSpace() { return VRTextureWithPoseAndDepth.neColorSpace(address()); }
        /** Returns a {@link HmdMatrix34} view of the {@code mDeviceToAbsoluteTracking} field. */
        @NativeType("HmdMatrix34_t")
        public HmdMatrix34 mDeviceToAbsoluteTracking() { return VRTextureWithPoseAndDepth.nmDeviceToAbsoluteTracking(address()); }
        /** Returns a {@link VRTextureDepthInfo} view of the {@code depth} field. */
        @NativeType("VRTextureDepthInfo_t")
        public VRTextureDepthInfo depth() { return VRTextureWithPoseAndDepth.ndepth(address()); }

        /** Sets the specified value to the {@code handle} field. */
        public VRTextureWithPoseAndDepth.Buffer handle(@NativeType("void *") long value) { VRTextureWithPoseAndDepth.nhandle(address(), value); return this; }
        /** Sets the specified value to the {@code eType} field. */
        public VRTextureWithPoseAndDepth.Buffer eType(@NativeType("ETextureType") int value) { VRTextureWithPoseAndDepth.neType(address(), value); return this; }
        /** Sets the specified value to the {@code eColorSpace} field. */
        public VRTextureWithPoseAndDepth.Buffer eColorSpace(@NativeType("EColorSpace") int value) { VRTextureWithPoseAndDepth.neColorSpace(address(), value); return this; }
        /** Copies the specified {@link HmdMatrix34} to the {@code mDeviceToAbsoluteTracking} field. */
        public VRTextureWithPoseAndDepth.Buffer mDeviceToAbsoluteTracking(@NativeType("HmdMatrix34_t") HmdMatrix34 value) { VRTextureWithPoseAndDepth.nmDeviceToAbsoluteTracking(address(), value); return this; }
        /** Passes the {@code mDeviceToAbsoluteTracking} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VRTextureWithPoseAndDepth.Buffer mDeviceToAbsoluteTracking(java.util.function.Consumer<HmdMatrix34> consumer) { consumer.accept(mDeviceToAbsoluteTracking()); return this; }
        /** Copies the specified {@link VRTextureDepthInfo} to the {@code depth} field. */
        public VRTextureWithPoseAndDepth.Buffer depth(@NativeType("VRTextureDepthInfo_t") VRTextureDepthInfo value) { VRTextureWithPoseAndDepth.ndepth(address(), value); return this; }
        /** Passes the {@code depth} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VRTextureWithPoseAndDepth.Buffer depth(java.util.function.Consumer<VRTextureDepthInfo> consumer) { consumer.accept(depth()); return this; }

    }

}