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
 * Specify a layer capability to configure.
 * 
 * <h5>Description</h5>
 * 
 * <p>When multiple {@link VkLayerSettingsCreateInfoEXT} structures are chained and the same {@code pSettingName} is referenced for the same {@code pLayerName}, the value of the first reference of the layer setting is used.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code valueCount} is not 0, {@code pValues} <b>must</b> be a valid pointer to an array of {@code valueCount} values of the type indicated by {@code type}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code pLayerName} <b>must</b> be a null-terminated UTF-8 string</li>
 * <li>{@code pSettingName} <b>must</b> be a null-terminated UTF-8 string</li>
 * <li>{@code type} <b>must</b> be a valid {@code VkLayerSettingTypeEXT} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkLayerSettingsCreateInfoEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkLayerSettingEXT {
 *     char const * {@link #pLayerName};
 *     char const * {@link #pSettingName};
 *     VkLayerSettingTypeEXT {@link #type};
 *     uint32_t {@link #valueCount};
 *     void const * {@link #pValues};
 * }</code></pre>
 */
public class VkLayerSettingEXT extends Struct<VkLayerSettingEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PLAYERNAME,
        PSETTINGNAME,
        TYPE,
        VALUECOUNT,
        PVALUES;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PLAYERNAME = layout.offsetof(0);
        PSETTINGNAME = layout.offsetof(1);
        TYPE = layout.offsetof(2);
        VALUECOUNT = layout.offsetof(3);
        PVALUES = layout.offsetof(4);
    }

    protected VkLayerSettingEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkLayerSettingEXT create(long address, @Nullable ByteBuffer container) {
        return new VkLayerSettingEXT(address, container);
    }

    /**
     * Creates a {@code VkLayerSettingEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkLayerSettingEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a pointer to a null-terminated UTF-8 string naming the layer to configure the setting from. */
    @NativeType("char const *")
    public ByteBuffer pLayerName() { return npLayerName(address()); }
    /** a pointer to a null-terminated UTF-8 string naming the layer to configure the setting from. */
    @NativeType("char const *")
    public String pLayerNameString() { return npLayerNameString(address()); }
    /** a pointer to a null-terminated UTF-8 string naming the setting to configure. Values of {@code pSettingName} that are unknown to the layer are ignored. */
    @NativeType("char const *")
    public ByteBuffer pSettingName() { return npSettingName(address()); }
    /** a pointer to a null-terminated UTF-8 string naming the setting to configure. Values of {@code pSettingName} that are unknown to the layer are ignored. */
    @NativeType("char const *")
    public String pSettingNameString() { return npSettingNameString(address()); }
    /** a {@code VkLayerSettingTypeEXT} value specifying the type of the {@code pValues} values. */
    @NativeType("VkLayerSettingTypeEXT")
    public int type() { return ntype(address()); }
    /** the number of values used to configure the layer setting. */
    @NativeType("uint32_t")
    public int valueCount() { return nvalueCount(address()); }
    /** a pointer to an array of {@code valueCount} values of the type indicated by {@code type} to configure the layer setting. */
    @Nullable
    @NativeType("void const *")
    public ByteBuffer pValues() { return npValues(address()); }

    /** Sets the address of the specified encoded string to the {@link #pLayerName} field. */
    public VkLayerSettingEXT pLayerName(@NativeType("char const *") ByteBuffer value) { npLayerName(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@link #pSettingName} field. */
    public VkLayerSettingEXT pSettingName(@NativeType("char const *") ByteBuffer value) { npSettingName(address(), value); return this; }
    /** Sets the specified value to the {@link #type} field. */
    public VkLayerSettingEXT type(@NativeType("VkLayerSettingTypeEXT") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@link #valueCount} field. */
    public VkLayerSettingEXT valueCount(@NativeType("uint32_t") int value) { nvalueCount(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@link #pValues} field. */
    public VkLayerSettingEXT pValues(@Nullable @NativeType("void const *") ByteBuffer value) { npValues(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkLayerSettingEXT set(
        ByteBuffer pLayerName,
        ByteBuffer pSettingName,
        int type,
        int valueCount,
        @Nullable ByteBuffer pValues
    ) {
        pLayerName(pLayerName);
        pSettingName(pSettingName);
        type(type);
        valueCount(valueCount);
        pValues(pValues);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkLayerSettingEXT set(VkLayerSettingEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkLayerSettingEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkLayerSettingEXT malloc() {
        return new VkLayerSettingEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkLayerSettingEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkLayerSettingEXT calloc() {
        return new VkLayerSettingEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkLayerSettingEXT} instance allocated with {@link BufferUtils}. */
    public static VkLayerSettingEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkLayerSettingEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkLayerSettingEXT} instance for the specified memory address. */
    public static VkLayerSettingEXT create(long address) {
        return new VkLayerSettingEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkLayerSettingEXT createSafe(long address) {
        return address == NULL ? null : new VkLayerSettingEXT(address, null);
    }

    /**
     * Returns a new {@link VkLayerSettingEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkLayerSettingEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkLayerSettingEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkLayerSettingEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkLayerSettingEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkLayerSettingEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkLayerSettingEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkLayerSettingEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkLayerSettingEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkLayerSettingEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkLayerSettingEXT malloc(MemoryStack stack) {
        return new VkLayerSettingEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkLayerSettingEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkLayerSettingEXT calloc(MemoryStack stack) {
        return new VkLayerSettingEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkLayerSettingEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkLayerSettingEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkLayerSettingEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkLayerSettingEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #pLayerName}. */
    public static ByteBuffer npLayerName(long struct) { return memByteBufferNT1(memGetAddress(struct + VkLayerSettingEXT.PLAYERNAME)); }
    /** Unsafe version of {@link #pLayerNameString}. */
    public static String npLayerNameString(long struct) { return memUTF8(memGetAddress(struct + VkLayerSettingEXT.PLAYERNAME)); }
    /** Unsafe version of {@link #pSettingName}. */
    public static ByteBuffer npSettingName(long struct) { return memByteBufferNT1(memGetAddress(struct + VkLayerSettingEXT.PSETTINGNAME)); }
    /** Unsafe version of {@link #pSettingNameString}. */
    public static String npSettingNameString(long struct) { return memUTF8(memGetAddress(struct + VkLayerSettingEXT.PSETTINGNAME)); }
    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + VkLayerSettingEXT.TYPE); }
    /** Unsafe version of {@link #valueCount}. */
    public static int nvalueCount(long struct) { return UNSAFE.getInt(null, struct + VkLayerSettingEXT.VALUECOUNT); }
    /** Unsafe version of {@link #pValues() pValues}. */
    @Nullable public static ByteBuffer npValues(long struct) { return memByteBufferSafe(memGetAddress(struct + VkLayerSettingEXT.PVALUES), nvalueCount(struct)); }

    /** Unsafe version of {@link #pLayerName(ByteBuffer) pLayerName}. */
    public static void npLayerName(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + VkLayerSettingEXT.PLAYERNAME, memAddress(value));
    }
    /** Unsafe version of {@link #pSettingName(ByteBuffer) pSettingName}. */
    public static void npSettingName(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + VkLayerSettingEXT.PSETTINGNAME, memAddress(value));
    }
    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + VkLayerSettingEXT.TYPE, value); }
    /** Sets the specified value to the {@code valueCount} field of the specified {@code struct}. */
    public static void nvalueCount(long struct, int value) { UNSAFE.putInt(null, struct + VkLayerSettingEXT.VALUECOUNT, value); }
    /** Unsafe version of {@link #pValues(ByteBuffer) pValues}. */
    public static void npValues(long struct, @Nullable ByteBuffer value) { memPutAddress(struct + VkLayerSettingEXT.PVALUES, memAddressSafe(value)); if (value != null) { nvalueCount(struct, value.remaining()); } }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkLayerSettingEXT.PLAYERNAME));
        check(memGetAddress(struct + VkLayerSettingEXT.PSETTINGNAME));
    }

    // -----------------------------------

    /** An array of {@link VkLayerSettingEXT} structs. */
    public static class Buffer extends StructBuffer<VkLayerSettingEXT, Buffer> implements NativeResource {

        private static final VkLayerSettingEXT ELEMENT_FACTORY = VkLayerSettingEXT.create(-1L);

        /**
         * Creates a new {@code VkLayerSettingEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkLayerSettingEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkLayerSettingEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@link VkLayerSettingEXT#pLayerName} field. */
        @NativeType("char const *")
        public ByteBuffer pLayerName() { return VkLayerSettingEXT.npLayerName(address()); }
        /** @return the null-terminated string pointed to by the {@link VkLayerSettingEXT#pLayerName} field. */
        @NativeType("char const *")
        public String pLayerNameString() { return VkLayerSettingEXT.npLayerNameString(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@link VkLayerSettingEXT#pSettingName} field. */
        @NativeType("char const *")
        public ByteBuffer pSettingName() { return VkLayerSettingEXT.npSettingName(address()); }
        /** @return the null-terminated string pointed to by the {@link VkLayerSettingEXT#pSettingName} field. */
        @NativeType("char const *")
        public String pSettingNameString() { return VkLayerSettingEXT.npSettingNameString(address()); }
        /** @return the value of the {@link VkLayerSettingEXT#type} field. */
        @NativeType("VkLayerSettingTypeEXT")
        public int type() { return VkLayerSettingEXT.ntype(address()); }
        /** @return the value of the {@link VkLayerSettingEXT#valueCount} field. */
        @NativeType("uint32_t")
        public int valueCount() { return VkLayerSettingEXT.nvalueCount(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@link VkLayerSettingEXT#pValues} field. */
        @Nullable
        @NativeType("void const *")
        public ByteBuffer pValues() { return VkLayerSettingEXT.npValues(address()); }

        /** Sets the address of the specified encoded string to the {@link VkLayerSettingEXT#pLayerName} field. */
        public VkLayerSettingEXT.Buffer pLayerName(@NativeType("char const *") ByteBuffer value) { VkLayerSettingEXT.npLayerName(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@link VkLayerSettingEXT#pSettingName} field. */
        public VkLayerSettingEXT.Buffer pSettingName(@NativeType("char const *") ByteBuffer value) { VkLayerSettingEXT.npSettingName(address(), value); return this; }
        /** Sets the specified value to the {@link VkLayerSettingEXT#type} field. */
        public VkLayerSettingEXT.Buffer type(@NativeType("VkLayerSettingTypeEXT") int value) { VkLayerSettingEXT.ntype(address(), value); return this; }
        /** Sets the specified value to the {@link VkLayerSettingEXT#valueCount} field. */
        public VkLayerSettingEXT.Buffer valueCount(@NativeType("uint32_t") int value) { VkLayerSettingEXT.nvalueCount(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@link VkLayerSettingEXT#pValues} field. */
        public VkLayerSettingEXT.Buffer pValues(@Nullable @NativeType("void const *") ByteBuffer value) { VkLayerSettingEXT.npValues(address(), value); return this; }

    }

}