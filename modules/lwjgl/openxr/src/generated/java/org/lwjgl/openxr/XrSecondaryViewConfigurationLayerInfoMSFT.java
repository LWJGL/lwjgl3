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
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSecondaryViewConfigurationLayerInfoMSFT {
 *     XrStructureType type;
 *     void const * next;
 *     XrViewConfigurationType viewConfigurationType;
 *     XrEnvironmentBlendMode environmentBlendMode;
 *     uint32_t layerCount;
 *     {@link XrCompositionLayerBaseHeader XrCompositionLayerBaseHeader} const * const * layers;
 * }</code></pre>
 */
public class XrSecondaryViewConfigurationLayerInfoMSFT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        VIEWCONFIGURATIONTYPE,
        ENVIRONMENTBLENDMODE,
        LAYERCOUNT,
        LAYERS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        VIEWCONFIGURATIONTYPE = layout.offsetof(2);
        ENVIRONMENTBLENDMODE = layout.offsetof(3);
        LAYERCOUNT = layout.offsetof(4);
        LAYERS = layout.offsetof(5);
    }

    /**
     * Creates a {@code XrSecondaryViewConfigurationLayerInfoMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSecondaryViewConfigurationLayerInfoMSFT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code viewConfigurationType} field. */
    @NativeType("XrViewConfigurationType")
    public int viewConfigurationType() { return nviewConfigurationType(address()); }
    /** @return the value of the {@code environmentBlendMode} field. */
    @NativeType("XrEnvironmentBlendMode")
    public int environmentBlendMode() { return nenvironmentBlendMode(address()); }
    /** @return the value of the {@code layerCount} field. */
    @NativeType("uint32_t")
    public int layerCount() { return nlayerCount(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code layers} field. */
    @NativeType("XrCompositionLayerBaseHeader const * const *")
    public PointerBuffer layers() { return nlayers(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSecondaryViewConfigurationLayerInfoMSFT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code next} field. */
    public XrSecondaryViewConfigurationLayerInfoMSFT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code viewConfigurationType} field. */
    public XrSecondaryViewConfigurationLayerInfoMSFT viewConfigurationType(@NativeType("XrViewConfigurationType") int value) { nviewConfigurationType(address(), value); return this; }
    /** Sets the specified value to the {@code environmentBlendMode} field. */
    public XrSecondaryViewConfigurationLayerInfoMSFT environmentBlendMode(@NativeType("XrEnvironmentBlendMode") int value) { nenvironmentBlendMode(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code layers} field. */
    public XrSecondaryViewConfigurationLayerInfoMSFT layers(@NativeType("XrCompositionLayerBaseHeader const * const *") PointerBuffer value) { nlayers(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSecondaryViewConfigurationLayerInfoMSFT set(
        int type,
        long next,
        int viewConfigurationType,
        int environmentBlendMode,
        PointerBuffer layers
    ) {
        type(type);
        next(next);
        viewConfigurationType(viewConfigurationType);
        environmentBlendMode(environmentBlendMode);
        layers(layers);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSecondaryViewConfigurationLayerInfoMSFT set(XrSecondaryViewConfigurationLayerInfoMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSecondaryViewConfigurationLayerInfoMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSecondaryViewConfigurationLayerInfoMSFT malloc() {
        return wrap(XrSecondaryViewConfigurationLayerInfoMSFT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrSecondaryViewConfigurationLayerInfoMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSecondaryViewConfigurationLayerInfoMSFT calloc() {
        return wrap(XrSecondaryViewConfigurationLayerInfoMSFT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrSecondaryViewConfigurationLayerInfoMSFT} instance allocated with {@link BufferUtils}. */
    public static XrSecondaryViewConfigurationLayerInfoMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrSecondaryViewConfigurationLayerInfoMSFT.class, memAddress(container), container);
    }

    /** Returns a new {@code XrSecondaryViewConfigurationLayerInfoMSFT} instance for the specified memory address. */
    public static XrSecondaryViewConfigurationLayerInfoMSFT create(long address) {
        return wrap(XrSecondaryViewConfigurationLayerInfoMSFT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSecondaryViewConfigurationLayerInfoMSFT createSafe(long address) {
        return address == NULL ? null : wrap(XrSecondaryViewConfigurationLayerInfoMSFT.class, address);
    }

    /**
     * Returns a new {@link XrSecondaryViewConfigurationLayerInfoMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSecondaryViewConfigurationLayerInfoMSFT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSecondaryViewConfigurationLayerInfoMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSecondaryViewConfigurationLayerInfoMSFT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSecondaryViewConfigurationLayerInfoMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSecondaryViewConfigurationLayerInfoMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrSecondaryViewConfigurationLayerInfoMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSecondaryViewConfigurationLayerInfoMSFT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSecondaryViewConfigurationLayerInfoMSFT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code XrSecondaryViewConfigurationLayerInfoMSFT} instance allocated on the thread-local {@link MemoryStack}. */
    public static XrSecondaryViewConfigurationLayerInfoMSFT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code XrSecondaryViewConfigurationLayerInfoMSFT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XrSecondaryViewConfigurationLayerInfoMSFT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code XrSecondaryViewConfigurationLayerInfoMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSecondaryViewConfigurationLayerInfoMSFT mallocStack(MemoryStack stack) {
        return wrap(XrSecondaryViewConfigurationLayerInfoMSFT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrSecondaryViewConfigurationLayerInfoMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSecondaryViewConfigurationLayerInfoMSFT callocStack(MemoryStack stack) {
        return wrap(XrSecondaryViewConfigurationLayerInfoMSFT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrSecondaryViewConfigurationLayerInfoMSFT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSecondaryViewConfigurationLayerInfoMSFT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrSecondaryViewConfigurationLayerInfoMSFT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static XrSecondaryViewConfigurationLayerInfoMSFT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrSecondaryViewConfigurationLayerInfoMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSecondaryViewConfigurationLayerInfoMSFT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSecondaryViewConfigurationLayerInfoMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSecondaryViewConfigurationLayerInfoMSFT.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSecondaryViewConfigurationLayerInfoMSFT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSecondaryViewConfigurationLayerInfoMSFT.NEXT); }
    /** Unsafe version of {@link #viewConfigurationType}. */
    public static int nviewConfigurationType(long struct) { return UNSAFE.getInt(null, struct + XrSecondaryViewConfigurationLayerInfoMSFT.VIEWCONFIGURATIONTYPE); }
    /** Unsafe version of {@link #environmentBlendMode}. */
    public static int nenvironmentBlendMode(long struct) { return UNSAFE.getInt(null, struct + XrSecondaryViewConfigurationLayerInfoMSFT.ENVIRONMENTBLENDMODE); }
    /** Unsafe version of {@link #layerCount}. */
    public static int nlayerCount(long struct) { return UNSAFE.getInt(null, struct + XrSecondaryViewConfigurationLayerInfoMSFT.LAYERCOUNT); }
    /** Unsafe version of {@link #layers() layers}. */
    public static PointerBuffer nlayers(long struct) { return memPointerBuffer(memGetAddress(struct + XrSecondaryViewConfigurationLayerInfoMSFT.LAYERS), nlayerCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSecondaryViewConfigurationLayerInfoMSFT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSecondaryViewConfigurationLayerInfoMSFT.NEXT, value); }
    /** Unsafe version of {@link #viewConfigurationType(int) viewConfigurationType}. */
    public static void nviewConfigurationType(long struct, int value) { UNSAFE.putInt(null, struct + XrSecondaryViewConfigurationLayerInfoMSFT.VIEWCONFIGURATIONTYPE, value); }
    /** Unsafe version of {@link #environmentBlendMode(int) environmentBlendMode}. */
    public static void nenvironmentBlendMode(long struct, int value) { UNSAFE.putInt(null, struct + XrSecondaryViewConfigurationLayerInfoMSFT.ENVIRONMENTBLENDMODE, value); }
    /** Sets the specified value to the {@code layerCount} field of the specified {@code struct}. */
    public static void nlayerCount(long struct, int value) { UNSAFE.putInt(null, struct + XrSecondaryViewConfigurationLayerInfoMSFT.LAYERCOUNT, value); }
    /** Unsafe version of {@link #layers(PointerBuffer) layers}. */
    public static void nlayers(long struct, PointerBuffer value) { memPutAddress(struct + XrSecondaryViewConfigurationLayerInfoMSFT.LAYERS, memAddress(value)); nlayerCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSecondaryViewConfigurationLayerInfoMSFT.LAYERS));
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

    /** An array of {@link XrSecondaryViewConfigurationLayerInfoMSFT} structs. */
    public static class Buffer extends StructBuffer<XrSecondaryViewConfigurationLayerInfoMSFT, Buffer> implements NativeResource {

        private static final XrSecondaryViewConfigurationLayerInfoMSFT ELEMENT_FACTORY = XrSecondaryViewConfigurationLayerInfoMSFT.create(-1L);

        /**
         * Creates a new {@code XrSecondaryViewConfigurationLayerInfoMSFT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSecondaryViewConfigurationLayerInfoMSFT#SIZEOF}, and its mark will be undefined.
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
        protected XrSecondaryViewConfigurationLayerInfoMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSecondaryViewConfigurationLayerInfoMSFT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSecondaryViewConfigurationLayerInfoMSFT.nnext(address()); }
        /** @return the value of the {@code viewConfigurationType} field. */
        @NativeType("XrViewConfigurationType")
        public int viewConfigurationType() { return XrSecondaryViewConfigurationLayerInfoMSFT.nviewConfigurationType(address()); }
        /** @return the value of the {@code environmentBlendMode} field. */
        @NativeType("XrEnvironmentBlendMode")
        public int environmentBlendMode() { return XrSecondaryViewConfigurationLayerInfoMSFT.nenvironmentBlendMode(address()); }
        /** @return the value of the {@code layerCount} field. */
        @NativeType("uint32_t")
        public int layerCount() { return XrSecondaryViewConfigurationLayerInfoMSFT.nlayerCount(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code layers} field. */
        @NativeType("XrCompositionLayerBaseHeader const * const *")
        public PointerBuffer layers() { return XrSecondaryViewConfigurationLayerInfoMSFT.nlayers(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSecondaryViewConfigurationLayerInfoMSFT.Buffer type(@NativeType("XrStructureType") int value) { XrSecondaryViewConfigurationLayerInfoMSFT.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code next} field. */
        public XrSecondaryViewConfigurationLayerInfoMSFT.Buffer next(@NativeType("void const *") long value) { XrSecondaryViewConfigurationLayerInfoMSFT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code viewConfigurationType} field. */
        public XrSecondaryViewConfigurationLayerInfoMSFT.Buffer viewConfigurationType(@NativeType("XrViewConfigurationType") int value) { XrSecondaryViewConfigurationLayerInfoMSFT.nviewConfigurationType(address(), value); return this; }
        /** Sets the specified value to the {@code environmentBlendMode} field. */
        public XrSecondaryViewConfigurationLayerInfoMSFT.Buffer environmentBlendMode(@NativeType("XrEnvironmentBlendMode") int value) { XrSecondaryViewConfigurationLayerInfoMSFT.nenvironmentBlendMode(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code layers} field. */
        public XrSecondaryViewConfigurationLayerInfoMSFT.Buffer layers(@NativeType("XrCompositionLayerBaseHeader const * const *") PointerBuffer value) { XrSecondaryViewConfigurationLayerInfoMSFT.nlayers(address(), value); return this; }

    }

}