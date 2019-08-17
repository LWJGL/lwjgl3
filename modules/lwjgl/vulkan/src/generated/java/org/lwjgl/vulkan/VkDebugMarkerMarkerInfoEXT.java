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
 * Specify parameters of a command buffer marker region.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTDebugMarker#VK_STRUCTURE_TYPE_DEBUG_MARKER_MARKER_INFO_EXT STRUCTURE_TYPE_DEBUG_MARKER_MARKER_INFO_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code pMarkerName} <b>must</b> be a null-terminated UTF-8 string</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link EXTDebugMarker#vkCmdDebugMarkerBeginEXT CmdDebugMarkerBeginEXT}, {@link EXTDebugMarker#vkCmdDebugMarkerInsertEXT CmdDebugMarkerInsertEXT}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code pMarkerName} &ndash; a pointer to a null-terminated UTF-8 string that contains the name of the marker.</li>
 * <li>{@code color[4]} &ndash; an optional: RGBA color value that can be associated with the marker. A particular implementation <b>may</b> choose to ignore this color value. The values contain RGBA values in order, in the range 0.0 to 1.0. If all elements in {@code color} are set to 0.0 then it is ignored.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDebugMarkerMarkerInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     char const * pMarkerName;
 *     float color[4];
 * }</code></pre>
 */
public class VkDebugMarkerMarkerInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PMARKERNAME,
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
        PMARKERNAME = layout.offsetof(2);
        COLOR = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkDebugMarkerMarkerInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDebugMarkerMarkerInfoEXT(ByteBuffer container) {
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
    /** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code pMarkerName} field. */
    @NativeType("char const *")
    public ByteBuffer pMarkerName() { return npMarkerName(address()); }
    /** Decodes the null-terminated string pointed to by the {@code pMarkerName} field. */
    @NativeType("char const *")
    public String pMarkerNameString() { return npMarkerNameString(address()); }
    /** Returns a {@link FloatBuffer} view of the {@code color} field. */
    @NativeType("float[4]")
    public FloatBuffer color() { return ncolor(address()); }
    /** Returns the value at the specified index of the {@code color} field. */
    public float color(int index) { return ncolor(address(), index); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDebugMarkerMarkerInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDebugMarkerMarkerInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code pMarkerName} field. */
    public VkDebugMarkerMarkerInfoEXT pMarkerName(@NativeType("char const *") ByteBuffer value) { npMarkerName(address(), value); return this; }
    /** Copies the specified {@link FloatBuffer} to the {@code color} field. */
    public VkDebugMarkerMarkerInfoEXT color(@NativeType("float[4]") FloatBuffer value) { ncolor(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code color} field. */
    public VkDebugMarkerMarkerInfoEXT color(int index, float value) { ncolor(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDebugMarkerMarkerInfoEXT set(
        int sType,
        long pNext,
        ByteBuffer pMarkerName,
        FloatBuffer color
    ) {
        sType(sType);
        pNext(pNext);
        pMarkerName(pMarkerName);
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
    public VkDebugMarkerMarkerInfoEXT set(VkDebugMarkerMarkerInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDebugMarkerMarkerInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDebugMarkerMarkerInfoEXT malloc() {
        return wrap(VkDebugMarkerMarkerInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDebugMarkerMarkerInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDebugMarkerMarkerInfoEXT calloc() {
        return wrap(VkDebugMarkerMarkerInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDebugMarkerMarkerInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkDebugMarkerMarkerInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDebugMarkerMarkerInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDebugMarkerMarkerInfoEXT} instance for the specified memory address. */
    public static VkDebugMarkerMarkerInfoEXT create(long address) {
        return wrap(VkDebugMarkerMarkerInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDebugMarkerMarkerInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkDebugMarkerMarkerInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkDebugMarkerMarkerInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDebugMarkerMarkerInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDebugMarkerMarkerInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDebugMarkerMarkerInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDebugMarkerMarkerInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDebugMarkerMarkerInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDebugMarkerMarkerInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDebugMarkerMarkerInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDebugMarkerMarkerInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkDebugMarkerMarkerInfoEXT} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkDebugMarkerMarkerInfoEXT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkDebugMarkerMarkerInfoEXT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkDebugMarkerMarkerInfoEXT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkDebugMarkerMarkerInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDebugMarkerMarkerInfoEXT mallocStack(MemoryStack stack) {
        return wrap(VkDebugMarkerMarkerInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDebugMarkerMarkerInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDebugMarkerMarkerInfoEXT callocStack(MemoryStack stack) {
        return wrap(VkDebugMarkerMarkerInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDebugMarkerMarkerInfoEXT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDebugMarkerMarkerInfoEXT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDebugMarkerMarkerInfoEXT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkDebugMarkerMarkerInfoEXT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDebugMarkerMarkerInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDebugMarkerMarkerInfoEXT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDebugMarkerMarkerInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDebugMarkerMarkerInfoEXT.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkDebugMarkerMarkerInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDebugMarkerMarkerInfoEXT.PNEXT); }
    /** Unsafe version of {@link #pMarkerName}. */
    public static ByteBuffer npMarkerName(long struct) { return memByteBufferNT1(memGetAddress(struct + VkDebugMarkerMarkerInfoEXT.PMARKERNAME)); }
    /** Unsafe version of {@link #pMarkerNameString}. */
    public static String npMarkerNameString(long struct) { return memUTF8(memGetAddress(struct + VkDebugMarkerMarkerInfoEXT.PMARKERNAME)); }
    /** Unsafe version of {@link #color}. */
    public static FloatBuffer ncolor(long struct) { return memFloatBuffer(struct + VkDebugMarkerMarkerInfoEXT.COLOR, 4); }
    /** Unsafe version of {@link #color(int) color}. */
    public static float ncolor(long struct, int index) {
        return UNSAFE.getFloat(null, struct + VkDebugMarkerMarkerInfoEXT.COLOR + check(index, 4) * 4);
    }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkDebugMarkerMarkerInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDebugMarkerMarkerInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #pMarkerName(ByteBuffer) pMarkerName}. */
    public static void npMarkerName(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + VkDebugMarkerMarkerInfoEXT.PMARKERNAME, memAddress(value));
    }
    /** Unsafe version of {@link #color(FloatBuffer) color}. */
    public static void ncolor(long struct, FloatBuffer value) {
        if (CHECKS) { checkGT(value, 4); }
        memCopy(memAddress(value), struct + VkDebugMarkerMarkerInfoEXT.COLOR, value.remaining() * 4);
    }
    /** Unsafe version of {@link #color(int, float) color}. */
    public static void ncolor(long struct, int index, float value) {
        UNSAFE.putFloat(null, struct + VkDebugMarkerMarkerInfoEXT.COLOR + check(index, 4) * 4, value);
    }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkDebugMarkerMarkerInfoEXT.PMARKERNAME));
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

    /** An array of {@link VkDebugMarkerMarkerInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkDebugMarkerMarkerInfoEXT, Buffer> implements NativeResource {

        private static final VkDebugMarkerMarkerInfoEXT ELEMENT_FACTORY = VkDebugMarkerMarkerInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkDebugMarkerMarkerInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDebugMarkerMarkerInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkDebugMarkerMarkerInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDebugMarkerMarkerInfoEXT.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDebugMarkerMarkerInfoEXT.npNext(address()); }
        /** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code pMarkerName} field. */
        @NativeType("char const *")
        public ByteBuffer pMarkerName() { return VkDebugMarkerMarkerInfoEXT.npMarkerName(address()); }
        /** Decodes the null-terminated string pointed to by the {@code pMarkerName} field. */
        @NativeType("char const *")
        public String pMarkerNameString() { return VkDebugMarkerMarkerInfoEXT.npMarkerNameString(address()); }
        /** Returns a {@link FloatBuffer} view of the {@code color} field. */
        @NativeType("float[4]")
        public FloatBuffer color() { return VkDebugMarkerMarkerInfoEXT.ncolor(address()); }
        /** Returns the value at the specified index of the {@code color} field. */
        public float color(int index) { return VkDebugMarkerMarkerInfoEXT.ncolor(address(), index); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDebugMarkerMarkerInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkDebugMarkerMarkerInfoEXT.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDebugMarkerMarkerInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkDebugMarkerMarkerInfoEXT.npNext(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code pMarkerName} field. */
        public VkDebugMarkerMarkerInfoEXT.Buffer pMarkerName(@NativeType("char const *") ByteBuffer value) { VkDebugMarkerMarkerInfoEXT.npMarkerName(address(), value); return this; }
        /** Copies the specified {@link FloatBuffer} to the {@code color} field. */
        public VkDebugMarkerMarkerInfoEXT.Buffer color(@NativeType("float[4]") FloatBuffer value) { VkDebugMarkerMarkerInfoEXT.ncolor(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code color} field. */
        public VkDebugMarkerMarkerInfoEXT.Buffer color(int index, float value) { VkDebugMarkerMarkerInfoEXT.ncolor(address(), index, value); return this; }

    }

}