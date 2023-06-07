/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Configuration for custom mode.
 * 
 * <h5>Description</h5>
 * 
 * <p>The application <b>must</b> chain an {@link XrFoveationCustomModeInfoHTC} structure to {@link XrFoveationApplyInfoHTC} to customize foveation if custom mode is set.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link HTCFoveation XR_HTC_foveation} extension <b>must</b> be enabled prior to using {@link XrFoveationCustomModeInfoHTC}</li>
 * <li>{@code type} <b>must</b> be {@link HTCFoveation#XR_TYPE_FOVEATION_CUSTOM_MODE_INFO_HTC TYPE_FOVEATION_CUSTOM_MODE_INFO_HTC}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code configs} <b>must</b> be a pointer to an array of {@code configCount} valid {@link XrFoveationConfigurationHTC} structures</li>
 * <li>The {@code configCount} parameter <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrFoveationConfigurationHTC}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrFoveationCustomModeInfoHTC {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     uint32_t {@link #configCount};
 *     {@link XrFoveationConfigurationHTC XrFoveationConfigurationHTC} const * {@link #configs};
 * }</code></pre>
 */
public class XrFoveationCustomModeInfoHTC extends Struct<XrFoveationCustomModeInfoHTC> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        CONFIGCOUNT,
        CONFIGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        CONFIGCOUNT = layout.offsetof(2);
        CONFIGS = layout.offsetof(3);
    }

    protected XrFoveationCustomModeInfoHTC(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrFoveationCustomModeInfoHTC create(long address, @Nullable ByteBuffer container) {
        return new XrFoveationCustomModeInfoHTC(address, container);
    }

    /**
     * Creates a {@code XrFoveationCustomModeInfoHTC} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrFoveationCustomModeInfoHTC(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** a {@code uint32_t} describing the count of elements in the {@code configs} array, which <b>must</b> be the number of views. */
    @NativeType("uint32_t")
    public int configCount() { return nconfigCount(address()); }
    /** an array of {@link XrFoveationConfigurationHTC} structure contains the custom foveation settings for the corresponding views. */
    @NativeType("XrFoveationConfigurationHTC const *")
    public XrFoveationConfigurationHTC.Buffer configs() { return nconfigs(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrFoveationCustomModeInfoHTC type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link HTCFoveation#XR_TYPE_FOVEATION_CUSTOM_MODE_INFO_HTC TYPE_FOVEATION_CUSTOM_MODE_INFO_HTC} value to the {@link #type} field. */
    public XrFoveationCustomModeInfoHTC type$Default() { return type(HTCFoveation.XR_TYPE_FOVEATION_CUSTOM_MODE_INFO_HTC); }
    /** Sets the specified value to the {@link #next} field. */
    public XrFoveationCustomModeInfoHTC next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link XrFoveationConfigurationHTC.Buffer} to the {@link #configs} field. */
    public XrFoveationCustomModeInfoHTC configs(@NativeType("XrFoveationConfigurationHTC const *") XrFoveationConfigurationHTC.Buffer value) { nconfigs(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrFoveationCustomModeInfoHTC set(
        int type,
        long next,
        XrFoveationConfigurationHTC.Buffer configs
    ) {
        type(type);
        next(next);
        configs(configs);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrFoveationCustomModeInfoHTC set(XrFoveationCustomModeInfoHTC src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrFoveationCustomModeInfoHTC} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrFoveationCustomModeInfoHTC malloc() {
        return new XrFoveationCustomModeInfoHTC(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrFoveationCustomModeInfoHTC} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrFoveationCustomModeInfoHTC calloc() {
        return new XrFoveationCustomModeInfoHTC(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrFoveationCustomModeInfoHTC} instance allocated with {@link BufferUtils}. */
    public static XrFoveationCustomModeInfoHTC create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrFoveationCustomModeInfoHTC(memAddress(container), container);
    }

    /** Returns a new {@code XrFoveationCustomModeInfoHTC} instance for the specified memory address. */
    public static XrFoveationCustomModeInfoHTC create(long address) {
        return new XrFoveationCustomModeInfoHTC(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrFoveationCustomModeInfoHTC createSafe(long address) {
        return address == NULL ? null : new XrFoveationCustomModeInfoHTC(address, null);
    }

    /**
     * Returns a new {@link XrFoveationCustomModeInfoHTC.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFoveationCustomModeInfoHTC.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrFoveationCustomModeInfoHTC.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFoveationCustomModeInfoHTC.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFoveationCustomModeInfoHTC.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrFoveationCustomModeInfoHTC.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrFoveationCustomModeInfoHTC.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrFoveationCustomModeInfoHTC.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrFoveationCustomModeInfoHTC.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrFoveationCustomModeInfoHTC} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFoveationCustomModeInfoHTC malloc(MemoryStack stack) {
        return new XrFoveationCustomModeInfoHTC(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrFoveationCustomModeInfoHTC} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFoveationCustomModeInfoHTC calloc(MemoryStack stack) {
        return new XrFoveationCustomModeInfoHTC(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrFoveationCustomModeInfoHTC.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFoveationCustomModeInfoHTC.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFoveationCustomModeInfoHTC.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFoveationCustomModeInfoHTC.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrFoveationCustomModeInfoHTC.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrFoveationCustomModeInfoHTC.NEXT); }
    /** Unsafe version of {@link #configCount}. */
    public static int nconfigCount(long struct) { return UNSAFE.getInt(null, struct + XrFoveationCustomModeInfoHTC.CONFIGCOUNT); }
    /** Unsafe version of {@link #configs}. */
    public static XrFoveationConfigurationHTC.Buffer nconfigs(long struct) { return XrFoveationConfigurationHTC.create(memGetAddress(struct + XrFoveationCustomModeInfoHTC.CONFIGS), nconfigCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrFoveationCustomModeInfoHTC.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrFoveationCustomModeInfoHTC.NEXT, value); }
    /** Sets the specified value to the {@code configCount} field of the specified {@code struct}. */
    public static void nconfigCount(long struct, int value) { UNSAFE.putInt(null, struct + XrFoveationCustomModeInfoHTC.CONFIGCOUNT, value); }
    /** Unsafe version of {@link #configs(XrFoveationConfigurationHTC.Buffer) configs}. */
    public static void nconfigs(long struct, XrFoveationConfigurationHTC.Buffer value) { memPutAddress(struct + XrFoveationCustomModeInfoHTC.CONFIGS, value.address()); nconfigCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrFoveationCustomModeInfoHTC.CONFIGS));
    }

    // -----------------------------------

    /** An array of {@link XrFoveationCustomModeInfoHTC} structs. */
    public static class Buffer extends StructBuffer<XrFoveationCustomModeInfoHTC, Buffer> implements NativeResource {

        private static final XrFoveationCustomModeInfoHTC ELEMENT_FACTORY = XrFoveationCustomModeInfoHTC.create(-1L);

        /**
         * Creates a new {@code XrFoveationCustomModeInfoHTC.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrFoveationCustomModeInfoHTC#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrFoveationCustomModeInfoHTC getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrFoveationCustomModeInfoHTC#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrFoveationCustomModeInfoHTC.ntype(address()); }
        /** @return the value of the {@link XrFoveationCustomModeInfoHTC#next} field. */
        @NativeType("void const *")
        public long next() { return XrFoveationCustomModeInfoHTC.nnext(address()); }
        /** @return the value of the {@link XrFoveationCustomModeInfoHTC#configCount} field. */
        @NativeType("uint32_t")
        public int configCount() { return XrFoveationCustomModeInfoHTC.nconfigCount(address()); }
        /** @return a {@link XrFoveationConfigurationHTC.Buffer} view of the struct array pointed to by the {@link XrFoveationCustomModeInfoHTC#configs} field. */
        @NativeType("XrFoveationConfigurationHTC const *")
        public XrFoveationConfigurationHTC.Buffer configs() { return XrFoveationCustomModeInfoHTC.nconfigs(address()); }

        /** Sets the specified value to the {@link XrFoveationCustomModeInfoHTC#type} field. */
        public XrFoveationCustomModeInfoHTC.Buffer type(@NativeType("XrStructureType") int value) { XrFoveationCustomModeInfoHTC.ntype(address(), value); return this; }
        /** Sets the {@link HTCFoveation#XR_TYPE_FOVEATION_CUSTOM_MODE_INFO_HTC TYPE_FOVEATION_CUSTOM_MODE_INFO_HTC} value to the {@link XrFoveationCustomModeInfoHTC#type} field. */
        public XrFoveationCustomModeInfoHTC.Buffer type$Default() { return type(HTCFoveation.XR_TYPE_FOVEATION_CUSTOM_MODE_INFO_HTC); }
        /** Sets the specified value to the {@link XrFoveationCustomModeInfoHTC#next} field. */
        public XrFoveationCustomModeInfoHTC.Buffer next(@NativeType("void const *") long value) { XrFoveationCustomModeInfoHTC.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link XrFoveationConfigurationHTC.Buffer} to the {@link XrFoveationCustomModeInfoHTC#configs} field. */
        public XrFoveationCustomModeInfoHTC.Buffer configs(@NativeType("XrFoveationConfigurationHTC const *") XrFoveationConfigurationHTC.Buffer value) { XrFoveationCustomModeInfoHTC.nconfigs(address(), value); return this; }

    }

}