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
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code pLabelName} &ndash; a pointer to a null-terminated UTF-8 string that contains the name of the label.</li>
 * <li>{@code color[4]} &ndash; an optional RGBA color value that can be associated with the label. A particular implementation <b>may</b> choose to ignore this color value. The values contain RGBA values in order, in the range 0.0 to 1.0. If all elements in {@code color} are set to 0.0 then it is ignored.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDebugUtilsLabelEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     char const * pLabelName;
 *     float color[4];
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

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code pLabelName} field. */
    @NativeType("char const *")
    public ByteBuffer pLabelName() { return npLabelName(address()); }
    /** Decodes the null-terminated string pointed to by the {@code pLabelName} field. */
    @NativeType("char const *")
    public String pLabelNameString() { return npLabelNameString(address()); }
    /** Returns a {@link FloatBuffer} view of the {@code color} field. */
    @NativeType("float[4]")
    public FloatBuffer color() { return ncolor(address()); }
    /** Returns the value at the specified index of the {@code color} field. */
    public float color(int index) { return ncolor(address(), index); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDebugUtilsLabelEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDebugUtilsLabelEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code pLabelName} field. */
    public VkDebugUtilsLabelEXT pLabelName(@NativeType("char const *") ByteBuffer value) { npLabelName(address(), value); return this; }
    /** Copies the specified {@link FloatBuffer} to the {@code color} field. */
    public VkDebugUtilsLabelEXT color(@NativeType("float[4]") FloatBuffer value) { ncolor(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code color} field. */
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

    /** Returns a new {@code VkDebugUtilsLabelEXT} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkDebugUtilsLabelEXT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkDebugUtilsLabelEXT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkDebugUtilsLabelEXT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkDebugUtilsLabelEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDebugUtilsLabelEXT mallocStack(MemoryStack stack) {
        return wrap(VkDebugUtilsLabelEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDebugUtilsLabelEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDebugUtilsLabelEXT callocStack(MemoryStack stack) {
        return wrap(VkDebugUtilsLabelEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDebugUtilsLabelEXT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDebugUtilsLabelEXT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDebugUtilsLabelEXT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkDebugUtilsLabelEXT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDebugUtilsLabelEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDebugUtilsLabelEXT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDebugUtilsLabelEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDebugUtilsLabelEXT.Buffer callocStack(int capacity, MemoryStack stack) {
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

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDebugUtilsLabelEXT.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDebugUtilsLabelEXT.npNext(address()); }
        /** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code pLabelName} field. */
        @NativeType("char const *")
        public ByteBuffer pLabelName() { return VkDebugUtilsLabelEXT.npLabelName(address()); }
        /** Decodes the null-terminated string pointed to by the {@code pLabelName} field. */
        @NativeType("char const *")
        public String pLabelNameString() { return VkDebugUtilsLabelEXT.npLabelNameString(address()); }
        /** Returns a {@link FloatBuffer} view of the {@code color} field. */
        @NativeType("float[4]")
        public FloatBuffer color() { return VkDebugUtilsLabelEXT.ncolor(address()); }
        /** Returns the value at the specified index of the {@code color} field. */
        public float color(int index) { return VkDebugUtilsLabelEXT.ncolor(address(), index); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDebugUtilsLabelEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkDebugUtilsLabelEXT.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDebugUtilsLabelEXT.Buffer pNext(@NativeType("void const *") long value) { VkDebugUtilsLabelEXT.npNext(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code pLabelName} field. */
        public VkDebugUtilsLabelEXT.Buffer pLabelName(@NativeType("char const *") ByteBuffer value) { VkDebugUtilsLabelEXT.npLabelName(address(), value); return this; }
        /** Copies the specified {@link FloatBuffer} to the {@code color} field. */
        public VkDebugUtilsLabelEXT.Buffer color(@NativeType("float[4]") FloatBuffer value) { VkDebugUtilsLabelEXT.ncolor(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code color} field. */
        public VkDebugUtilsLabelEXT.Buffer color(int index, float value) { VkDebugUtilsLabelEXT.ncolor(address(), index, value); return this; }

    }

}