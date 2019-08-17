/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying a clear color value.
 * 
 * <h5>Description</h5>
 * 
 * <p>The four array elements of the clear color map to R, G, B, and A components of image formats, in order.</p>
 * 
 * <p>If the image has more than one sample, the same value is written to all samples for any pixels being cleared.</p>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkClearValue}, {@link VK10#vkCmdClearColorImage CmdClearColorImage}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code float32[4]} &ndash; are the color clear values when the format of the image or attachment is one of the formats in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#formats-numericformat">Interpretation of Numeric Format</a> table other than signed integer ({@code SINT}) or unsigned integer ({@code UINT}). Floating point values are automatically converted to the format of the image, with the clear value being treated as linear if the image is sRGB.</li>
 * <li>{@code int32[4]} &ndash; are the color clear values when the format of the image or attachment is signed integer ({@code SINT}). Signed integer values are converted to the format of the image by casting to the smaller type (with negative 32-bit values mapping to negative values in the smaller type). If the integer clear value is not representable in the target type (e.g. would overflow in conversion to that type), the clear value is undefined.</li>
 * <li>{@code uint32[4]} &ndash; are the color clear values when the format of the image or attachment is unsigned integer ({@code UINT}). Unsigned integer values are converted to the format of the image by casting to the integer type with fewer bits.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * union VkClearColorValue {
 *     float float32[4];
 *     int32_t int32[4];
 *     uint32_t uint32[4];
 * }</code></pre>
 */
public class VkClearColorValue extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLOAT32,
        INT32,
        UINT32;

    static {
        Layout layout = __union(
            __array(4, 4),
            __array(4, 4),
            __array(4, 4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FLOAT32 = layout.offsetof(0);
        INT32 = layout.offsetof(1);
        UINT32 = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkClearColorValue} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkClearColorValue(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link FloatBuffer} view of the {@code float32} field. */
    @NativeType("float[4]")
    public FloatBuffer float32() { return nfloat32(address()); }
    /** Returns the value at the specified index of the {@code float32} field. */
    public float float32(int index) { return nfloat32(address(), index); }
    /** Returns a {@link IntBuffer} view of the {@code int32} field. */
    @NativeType("int32_t[4]")
    public IntBuffer int32() { return nint32(address()); }
    /** Returns the value at the specified index of the {@code int32} field. */
    @NativeType("int32_t")
    public int int32(int index) { return nint32(address(), index); }
    /** Returns a {@link IntBuffer} view of the {@code uint32} field. */
    @NativeType("uint32_t[4]")
    public IntBuffer uint32() { return nuint32(address()); }
    /** Returns the value at the specified index of the {@code uint32} field. */
    @NativeType("uint32_t")
    public int uint32(int index) { return nuint32(address(), index); }

    /** Copies the specified {@link FloatBuffer} to the {@code float32} field. */
    public VkClearColorValue float32(@NativeType("float[4]") FloatBuffer value) { nfloat32(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code float32} field. */
    public VkClearColorValue float32(int index, float value) { nfloat32(address(), index, value); return this; }
    /** Copies the specified {@link IntBuffer} to the {@code int32} field. */
    public VkClearColorValue int32(@NativeType("int32_t[4]") IntBuffer value) { nint32(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code int32} field. */
    public VkClearColorValue int32(int index, @NativeType("int32_t") int value) { nint32(address(), index, value); return this; }
    /** Copies the specified {@link IntBuffer} to the {@code uint32} field. */
    public VkClearColorValue uint32(@NativeType("uint32_t[4]") IntBuffer value) { nuint32(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code uint32} field. */
    public VkClearColorValue uint32(int index, @NativeType("uint32_t") int value) { nuint32(address(), index, value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkClearColorValue set(VkClearColorValue src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkClearColorValue} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkClearColorValue malloc() {
        return wrap(VkClearColorValue.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkClearColorValue} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkClearColorValue calloc() {
        return wrap(VkClearColorValue.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkClearColorValue} instance allocated with {@link BufferUtils}. */
    public static VkClearColorValue create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkClearColorValue.class, memAddress(container), container);
    }

    /** Returns a new {@code VkClearColorValue} instance for the specified memory address. */
    public static VkClearColorValue create(long address) {
        return wrap(VkClearColorValue.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkClearColorValue createSafe(long address) {
        return address == NULL ? null : wrap(VkClearColorValue.class, address);
    }

    /**
     * Returns a new {@link VkClearColorValue.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkClearColorValue.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkClearColorValue.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkClearColorValue.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkClearColorValue.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkClearColorValue.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkClearColorValue.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkClearColorValue.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkClearColorValue.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkClearColorValue} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkClearColorValue mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkClearColorValue} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkClearColorValue callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkClearColorValue} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkClearColorValue mallocStack(MemoryStack stack) {
        return wrap(VkClearColorValue.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkClearColorValue} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkClearColorValue callocStack(MemoryStack stack) {
        return wrap(VkClearColorValue.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkClearColorValue.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkClearColorValue.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkClearColorValue.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkClearColorValue.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkClearColorValue.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkClearColorValue.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkClearColorValue.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkClearColorValue.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #float32}. */
    public static FloatBuffer nfloat32(long struct) { return memFloatBuffer(struct + VkClearColorValue.FLOAT32, 4); }
    /** Unsafe version of {@link #float32(int) float32}. */
    public static float nfloat32(long struct, int index) {
        return UNSAFE.getFloat(null, struct + VkClearColorValue.FLOAT32 + check(index, 4) * 4);
    }
    /** Unsafe version of {@link #int32}. */
    public static IntBuffer nint32(long struct) { return memIntBuffer(struct + VkClearColorValue.INT32, 4); }
    /** Unsafe version of {@link #int32(int) int32}. */
    public static int nint32(long struct, int index) {
        return UNSAFE.getInt(null, struct + VkClearColorValue.INT32 + check(index, 4) * 4);
    }
    /** Unsafe version of {@link #uint32}. */
    public static IntBuffer nuint32(long struct) { return memIntBuffer(struct + VkClearColorValue.UINT32, 4); }
    /** Unsafe version of {@link #uint32(int) uint32}. */
    public static int nuint32(long struct, int index) {
        return UNSAFE.getInt(null, struct + VkClearColorValue.UINT32 + check(index, 4) * 4);
    }

    /** Unsafe version of {@link #float32(FloatBuffer) float32}. */
    public static void nfloat32(long struct, FloatBuffer value) {
        if (CHECKS) { checkGT(value, 4); }
        memCopy(memAddress(value), struct + VkClearColorValue.FLOAT32, value.remaining() * 4);
    }
    /** Unsafe version of {@link #float32(int, float) float32}. */
    public static void nfloat32(long struct, int index, float value) {
        UNSAFE.putFloat(null, struct + VkClearColorValue.FLOAT32 + check(index, 4) * 4, value);
    }
    /** Unsafe version of {@link #int32(IntBuffer) int32}. */
    public static void nint32(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, 4); }
        memCopy(memAddress(value), struct + VkClearColorValue.INT32, value.remaining() * 4);
    }
    /** Unsafe version of {@link #int32(int, int) int32}. */
    public static void nint32(long struct, int index, int value) {
        UNSAFE.putInt(null, struct + VkClearColorValue.INT32 + check(index, 4) * 4, value);
    }
    /** Unsafe version of {@link #uint32(IntBuffer) uint32}. */
    public static void nuint32(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, 4); }
        memCopy(memAddress(value), struct + VkClearColorValue.UINT32, value.remaining() * 4);
    }
    /** Unsafe version of {@link #uint32(int, int) uint32}. */
    public static void nuint32(long struct, int index, int value) {
        UNSAFE.putInt(null, struct + VkClearColorValue.UINT32 + check(index, 4) * 4, value);
    }

    // -----------------------------------

    /** An array of {@link VkClearColorValue} structs. */
    public static class Buffer extends StructBuffer<VkClearColorValue, Buffer> implements NativeResource {

        private static final VkClearColorValue ELEMENT_FACTORY = VkClearColorValue.create(-1L);

        /**
         * Creates a new {@code VkClearColorValue.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkClearColorValue#SIZEOF}, and its mark will be undefined.
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
        protected VkClearColorValue getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns a {@link FloatBuffer} view of the {@code float32} field. */
        @NativeType("float[4]")
        public FloatBuffer float32() { return VkClearColorValue.nfloat32(address()); }
        /** Returns the value at the specified index of the {@code float32} field. */
        public float float32(int index) { return VkClearColorValue.nfloat32(address(), index); }
        /** Returns a {@link IntBuffer} view of the {@code int32} field. */
        @NativeType("int32_t[4]")
        public IntBuffer int32() { return VkClearColorValue.nint32(address()); }
        /** Returns the value at the specified index of the {@code int32} field. */
        @NativeType("int32_t")
        public int int32(int index) { return VkClearColorValue.nint32(address(), index); }
        /** Returns a {@link IntBuffer} view of the {@code uint32} field. */
        @NativeType("uint32_t[4]")
        public IntBuffer uint32() { return VkClearColorValue.nuint32(address()); }
        /** Returns the value at the specified index of the {@code uint32} field. */
        @NativeType("uint32_t")
        public int uint32(int index) { return VkClearColorValue.nuint32(address(), index); }

        /** Copies the specified {@link FloatBuffer} to the {@code float32} field. */
        public VkClearColorValue.Buffer float32(@NativeType("float[4]") FloatBuffer value) { VkClearColorValue.nfloat32(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code float32} field. */
        public VkClearColorValue.Buffer float32(int index, float value) { VkClearColorValue.nfloat32(address(), index, value); return this; }
        /** Copies the specified {@link IntBuffer} to the {@code int32} field. */
        public VkClearColorValue.Buffer int32(@NativeType("int32_t[4]") IntBuffer value) { VkClearColorValue.nint32(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code int32} field. */
        public VkClearColorValue.Buffer int32(int index, @NativeType("int32_t") int value) { VkClearColorValue.nint32(address(), index, value); return this; }
        /** Copies the specified {@link IntBuffer} to the {@code uint32} field. */
        public VkClearColorValue.Buffer uint32(@NativeType("uint32_t[4]") IntBuffer value) { VkClearColorValue.nuint32(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code uint32} field. */
        public VkClearColorValue.Buffer uint32(int index, @NativeType("uint32_t") int value) { VkClearColorValue.nuint32(address(), index, value); return this; }

    }

}