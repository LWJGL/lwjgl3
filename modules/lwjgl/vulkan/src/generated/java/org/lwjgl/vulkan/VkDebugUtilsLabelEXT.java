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
 * Specify parameters of a label region.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTDebugUtils#VK_STRUCTURE_TYPE_DEBUG_UTILS_LABEL_EXT STRUCTURE_TYPE_DEBUG_UTILS_LABEL_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code pLabelName} <b>must</b> be a null-terminated UTF-8 string</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDebugUtilsMessengerCallbackDataEXT}, {@link EXTDebugUtils#vkCmdBeginDebugUtilsLabelEXT CmdBeginDebugUtilsLabelEXT}, {@link EXTDebugUtils#vkCmdInsertDebugUtilsLabelEXT CmdInsertDebugUtilsLabelEXT}, {@link EXTDebugUtils#vkQueueBeginDebugUtilsLabelEXT QueueBeginDebugUtilsLabelEXT}, {@link EXTDebugUtils#vkQueueInsertDebugUtilsLabelEXT QueueInsertDebugUtilsLabelEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDebugUtilsLabelEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     char const * {@link #pLabelName};
 *     float {@link #color}[4];
 * }</code></pre>
 */
public class VkDebugUtilsLabelEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PLABELNAME,
        COLOR;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __array(4, 4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PLABELNAME = layout.offsetof(2);
        COLOR = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkDebugUtilsLabelEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDebugUtilsLabelEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** a pointer to a null-terminated UTF-8 string containing the name of the label. */
    @NativeType("char const *")
    public ByteBuffer pLabelName() { return npLabelName(address()); }
    /** a pointer to a null-terminated UTF-8 string containing the name of the label. */
    @NativeType("char const *")
    public String pLabelNameString() { return npLabelNameString(address()); }
    /** an optional RGBA color value that can be associated with the label. A particular implementation <b>may</b> choose to ignore this color value. The values contain RGBA values in order, in the range 0.0 to 1.0. If all elements in {@code color} are set to 0.0 then it is ignored. */
    @NativeType("float[4]")
    public FloatBuffer color() { return ncolor(address()); }
    /** an optional RGBA color value that can be associated with the label. A particular implementation <b>may</b> choose to ignore this color value. The values contain RGBA values in order, in the range 0.0 to 1.0. If all elements in {@code color} are set to 0.0 then it is ignored. */
    public float color(int index) { return ncolor(address(), index); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkDebugUtilsLabelEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDebugUtils#VK_STRUCTURE_TYPE_DEBUG_UTILS_LABEL_EXT STRUCTURE_TYPE_DEBUG_UTILS_LABEL_EXT} value to the {@link #sType} field. */
    public VkDebugUtilsLabelEXT sType$Default() { return sType(EXTDebugUtils.VK_STRUCTURE_TYPE_DEBUG_UTILS_LABEL_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkDebugUtilsLabelEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@link #pLabelName} field. */
    public VkDebugUtilsLabelEXT pLabelName(@NativeType("char const *") ByteBuffer value) { npLabelName(address(), value); return this; }
    /** Copies the specified {@link FloatBuffer} to the {@link #color} field. */
    public VkDebugUtilsLabelEXT color(@NativeType("float[4]") FloatBuffer value) { ncolor(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@link #color} field. */
    public VkDebugUtilsLabelEXT color(int index, float value) { ncolor(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDebugUtilsLabelEXT set(
        int sType,
        long pNext,
        ByteBuffer pLabelName,
        FloatBuffer color
    ) {
        sType(sType);
        pNext(pNext);
        pLabelName(pLabelName);
        color(color);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDebugUtilsLabelEXT set(VkDebugUtilsLabelEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDebugUtilsLabelEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDebugUtilsLabelEXT malloc() {
        return wrap(VkDebugUtilsLabelEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDebugUtilsLabelEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDebugUtilsLabelEXT calloc() {
        return wrap(VkDebugUtilsLabelEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDebugUtilsLabelEXT} instance allocated with {@link BufferUtils}. */
    public static VkDebugUtilsLabelEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDebugUtilsLabelEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDebugUtilsLabelEXT} instance for the specified memory address. */
    public static VkDebugUtilsLabelEXT create(long address) {
        return wrap(VkDebugUtilsLabelEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDebugUtilsLabelEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkDebugUtilsLabelEXT.class, address);
    }

    /**
     * Returns a new {@link VkDebugUtilsLabelEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDebugUtilsLabelEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDebugUtilsLabelEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDebugUtilsLabelEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDebugUtilsLabelEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDebugUtilsLabelEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDebugUtilsLabelEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDebugUtilsLabelEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDebugUtilsLabelEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDebugUtilsLabelEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDebugUtilsLabelEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDebugUtilsLabelEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDebugUtilsLabelEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDebugUtilsLabelEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDebugUtilsLabelEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDebugUtilsLabelEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDebugUtilsLabelEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkDebugUtilsLabelEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDebugUtilsLabelEXT malloc(MemoryStack stack) {
        return wrap(VkDebugUtilsLabelEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDebugUtilsLabelEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDebugUtilsLabelEXT calloc(MemoryStack stack) {
        return wrap(VkDebugUtilsLabelEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDebugUtilsLabelEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDebugUtilsLabelEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDebugUtilsLabelEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDebugUtilsLabelEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkDebugUtilsLabelEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDebugUtilsLabelEXT.PNEXT); }
    /** Unsafe version of {@link #pLabelName}. */
    public static ByteBuffer npLabelName(long struct) { return memByteBufferNT1(memGetAddress(struct + VkDebugUtilsLabelEXT.PLABELNAME)); }
    /** Unsafe version of {@link #pLabelNameString}. */
    public static String npLabelNameString(long struct) { return memUTF8(memGetAddress(struct + VkDebugUtilsLabelEXT.PLABELNAME)); }
    /** Unsafe version of {@link #color}. */
    public static FloatBuffer ncolor(long struct) { return memFloatBuffer(struct + VkDebugUtilsLabelEXT.COLOR, 4); }
    /** Unsafe version of {@link #color(int) color}. */
    public static float ncolor(long struct, int index) {
        return UNSAFE.getFloat(null, struct + VkDebugUtilsLabelEXT.COLOR + check(index, 4) * 4);
    }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkDebugUtilsLabelEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDebugUtilsLabelEXT.PNEXT, value); }
    /** Unsafe version of {@link #pLabelName(ByteBuffer) pLabelName}. */
    public static void npLabelName(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + VkDebugUtilsLabelEXT.PLABELNAME, memAddress(value));
    }
    /** Unsafe version of {@link #color(FloatBuffer) color}. */
    public static void ncolor(long struct, FloatBuffer value) {
        if (CHECKS) { checkGT(value, 4); }
        memCopy(memAddress(value), struct + VkDebugUtilsLabelEXT.COLOR, value.remaining() * 4);
    }
    /** Unsafe version of {@link #color(int, float) color}. */
    public static void ncolor(long struct, int index, float value) {
        UNSAFE.putFloat(null, struct + VkDebugUtilsLabelEXT.COLOR + check(index, 4) * 4, value);
    }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkDebugUtilsLabelEXT.PLABELNAME));
    }

    // -----------------------------------

    /** An array of {@link VkDebugUtilsLabelEXT} structs. */
    public static class Buffer extends StructBuffer<VkDebugUtilsLabelEXT, Buffer> implements NativeResource {

        private static final VkDebugUtilsLabelEXT ELEMENT_FACTORY = VkDebugUtilsLabelEXT.create(-1L);

        /**
         * Creates a new {@code VkDebugUtilsLabelEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDebugUtilsLabelEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkDebugUtilsLabelEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDebugUtilsLabelEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDebugUtilsLabelEXT.nsType(address()); }
        /** @return the value of the {@link VkDebugUtilsLabelEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDebugUtilsLabelEXT.npNext(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@link VkDebugUtilsLabelEXT#pLabelName} field. */
        @NativeType("char const *")
        public ByteBuffer pLabelName() { return VkDebugUtilsLabelEXT.npLabelName(address()); }
        /** @return the null-terminated string pointed to by the {@link VkDebugUtilsLabelEXT#pLabelName} field. */
        @NativeType("char const *")
        public String pLabelNameString() { return VkDebugUtilsLabelEXT.npLabelNameString(address()); }
        /** @return a {@link FloatBuffer} view of the {@link VkDebugUtilsLabelEXT#color} field. */
        @NativeType("float[4]")
        public FloatBuffer color() { return VkDebugUtilsLabelEXT.ncolor(address()); }
        /** @return the value at the specified index of the {@link VkDebugUtilsLabelEXT#color} field. */
        public float color(int index) { return VkDebugUtilsLabelEXT.ncolor(address(), index); }

        /** Sets the specified value to the {@link VkDebugUtilsLabelEXT#sType} field. */
        public VkDebugUtilsLabelEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkDebugUtilsLabelEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDebugUtils#VK_STRUCTURE_TYPE_DEBUG_UTILS_LABEL_EXT STRUCTURE_TYPE_DEBUG_UTILS_LABEL_EXT} value to the {@link VkDebugUtilsLabelEXT#sType} field. */
        public VkDebugUtilsLabelEXT.Buffer sType$Default() { return sType(EXTDebugUtils.VK_STRUCTURE_TYPE_DEBUG_UTILS_LABEL_EXT); }
        /** Sets the specified value to the {@link VkDebugUtilsLabelEXT#pNext} field. */
        public VkDebugUtilsLabelEXT.Buffer pNext(@NativeType("void const *") long value) { VkDebugUtilsLabelEXT.npNext(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@link VkDebugUtilsLabelEXT#pLabelName} field. */
        public VkDebugUtilsLabelEXT.Buffer pLabelName(@NativeType("char const *") ByteBuffer value) { VkDebugUtilsLabelEXT.npLabelName(address(), value); return this; }
        /** Copies the specified {@link FloatBuffer} to the {@link VkDebugUtilsLabelEXT#color} field. */
        public VkDebugUtilsLabelEXT.Buffer color(@NativeType("float[4]") FloatBuffer value) { VkDebugUtilsLabelEXT.ncolor(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@link VkDebugUtilsLabelEXT#color} field. */
        public VkDebugUtilsLabelEXT.Buffer color(int index, float value) { VkDebugUtilsLabelEXT.ncolor(address(), index, value); return this; }

    }

}