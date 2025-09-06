/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct XrSpatialCapabilityConfigurationBaseHeaderEXT {
 *     XrStructureType type;
 *     void const * next;
 *     XrSpatialCapabilityEXT capability;
 *     uint32_t enabledComponentCount;
 *     XrSpatialComponentTypeEXT const * enabledComponents;
 * }}</pre>
 */
public class XrSpatialCapabilityConfigurationBaseHeaderEXT extends Struct<XrSpatialCapabilityConfigurationBaseHeaderEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        CAPABILITY,
        ENABLEDCOMPONENTCOUNT,
        ENABLEDCOMPONENTS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        CAPABILITY = layout.offsetof(2);
        ENABLEDCOMPONENTCOUNT = layout.offsetof(3);
        ENABLEDCOMPONENTS = layout.offsetof(4);
    }

    protected XrSpatialCapabilityConfigurationBaseHeaderEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialCapabilityConfigurationBaseHeaderEXT create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialCapabilityConfigurationBaseHeaderEXT(address, container);
    }

    /**
     * Creates a {@code XrSpatialCapabilityConfigurationBaseHeaderEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialCapabilityConfigurationBaseHeaderEXT(ByteBuffer container) {
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
    /** @return the value of the {@code capability} field. */
    @NativeType("XrSpatialCapabilityEXT")
    public int capability() { return ncapability(address()); }
    /** @return the value of the {@code enabledComponentCount} field. */
    @NativeType("uint32_t")
    public int enabledComponentCount() { return nenabledComponentCount(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code enabledComponents} field. */
    @NativeType("XrSpatialComponentTypeEXT const *")
    public IntBuffer enabledComponents() { return nenabledComponents(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpatialCapabilityConfigurationBaseHeaderEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code next} field. */
    public XrSpatialCapabilityConfigurationBaseHeaderEXT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code capability} field. */
    public XrSpatialCapabilityConfigurationBaseHeaderEXT capability(@NativeType("XrSpatialCapabilityEXT") int value) { ncapability(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code enabledComponents} field. */
    public XrSpatialCapabilityConfigurationBaseHeaderEXT enabledComponents(@NativeType("XrSpatialComponentTypeEXT const *") IntBuffer value) { nenabledComponents(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialCapabilityConfigurationBaseHeaderEXT set(
        int type,
        long next,
        int capability,
        IntBuffer enabledComponents
    ) {
        type(type);
        next(next);
        capability(capability);
        enabledComponents(enabledComponents);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialCapabilityConfigurationBaseHeaderEXT set(XrSpatialCapabilityConfigurationBaseHeaderEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialCapabilityConfigurationBaseHeaderEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialCapabilityConfigurationBaseHeaderEXT malloc() {
        return new XrSpatialCapabilityConfigurationBaseHeaderEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialCapabilityConfigurationBaseHeaderEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialCapabilityConfigurationBaseHeaderEXT calloc() {
        return new XrSpatialCapabilityConfigurationBaseHeaderEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialCapabilityConfigurationBaseHeaderEXT} instance allocated with {@link BufferUtils}. */
    public static XrSpatialCapabilityConfigurationBaseHeaderEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialCapabilityConfigurationBaseHeaderEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialCapabilityConfigurationBaseHeaderEXT} instance for the specified memory address. */
    public static XrSpatialCapabilityConfigurationBaseHeaderEXT create(long address) {
        return new XrSpatialCapabilityConfigurationBaseHeaderEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialCapabilityConfigurationBaseHeaderEXT createSafe(long address) {
        return address == NULL ? null : new XrSpatialCapabilityConfigurationBaseHeaderEXT(address, null);
    }

    /** Upcasts the specified {@code XrSpatialCapabilityConfigurationPlaneTrackingEXT} instance to {@code XrSpatialCapabilityConfigurationBaseHeaderEXT}. */
    public static XrSpatialCapabilityConfigurationBaseHeaderEXT create(XrSpatialCapabilityConfigurationPlaneTrackingEXT value) {
        return new XrSpatialCapabilityConfigurationBaseHeaderEXT(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrSpatialCapabilityConfigurationQrCodeEXT} instance to {@code XrSpatialCapabilityConfigurationBaseHeaderEXT}. */
    public static XrSpatialCapabilityConfigurationBaseHeaderEXT create(XrSpatialCapabilityConfigurationQrCodeEXT value) {
        return new XrSpatialCapabilityConfigurationBaseHeaderEXT(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrSpatialCapabilityConfigurationMicroQrCodeEXT} instance to {@code XrSpatialCapabilityConfigurationBaseHeaderEXT}. */
    public static XrSpatialCapabilityConfigurationBaseHeaderEXT create(XrSpatialCapabilityConfigurationMicroQrCodeEXT value) {
        return new XrSpatialCapabilityConfigurationBaseHeaderEXT(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrSpatialCapabilityConfigurationArucoMarkerEXT} instance to {@code XrSpatialCapabilityConfigurationBaseHeaderEXT}. */
    public static XrSpatialCapabilityConfigurationBaseHeaderEXT create(XrSpatialCapabilityConfigurationArucoMarkerEXT value) {
        return new XrSpatialCapabilityConfigurationBaseHeaderEXT(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrSpatialCapabilityConfigurationAprilTagEXT} instance to {@code XrSpatialCapabilityConfigurationBaseHeaderEXT}. */
    public static XrSpatialCapabilityConfigurationBaseHeaderEXT create(XrSpatialCapabilityConfigurationAprilTagEXT value) {
        return new XrSpatialCapabilityConfigurationBaseHeaderEXT(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrSpatialCapabilityConfigurationAnchorEXT} instance to {@code XrSpatialCapabilityConfigurationBaseHeaderEXT}. */
    public static XrSpatialCapabilityConfigurationBaseHeaderEXT create(XrSpatialCapabilityConfigurationAnchorEXT value) {
        return new XrSpatialCapabilityConfigurationBaseHeaderEXT(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrSpatialCapabilityConfigurationBaseHeaderEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialCapabilityConfigurationBaseHeaderEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialCapabilityConfigurationBaseHeaderEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialCapabilityConfigurationBaseHeaderEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialCapabilityConfigurationBaseHeaderEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialCapabilityConfigurationBaseHeaderEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialCapabilityConfigurationBaseHeaderEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialCapabilityConfigurationBaseHeaderEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialCapabilityConfigurationBaseHeaderEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Upcasts the specified {@code XrSpatialCapabilityConfigurationPlaneTrackingEXT.Buffer} instance to {@code XrSpatialCapabilityConfigurationBaseHeaderEXT.Buffer}. */
    public static XrSpatialCapabilityConfigurationBaseHeaderEXT.Buffer create(XrSpatialCapabilityConfigurationPlaneTrackingEXT.Buffer value) {
        return new XrSpatialCapabilityConfigurationBaseHeaderEXT.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrSpatialCapabilityConfigurationQrCodeEXT.Buffer} instance to {@code XrSpatialCapabilityConfigurationBaseHeaderEXT.Buffer}. */
    public static XrSpatialCapabilityConfigurationBaseHeaderEXT.Buffer create(XrSpatialCapabilityConfigurationQrCodeEXT.Buffer value) {
        return new XrSpatialCapabilityConfigurationBaseHeaderEXT.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrSpatialCapabilityConfigurationMicroQrCodeEXT.Buffer} instance to {@code XrSpatialCapabilityConfigurationBaseHeaderEXT.Buffer}. */
    public static XrSpatialCapabilityConfigurationBaseHeaderEXT.Buffer create(XrSpatialCapabilityConfigurationMicroQrCodeEXT.Buffer value) {
        return new XrSpatialCapabilityConfigurationBaseHeaderEXT.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrSpatialCapabilityConfigurationArucoMarkerEXT.Buffer} instance to {@code XrSpatialCapabilityConfigurationBaseHeaderEXT.Buffer}. */
    public static XrSpatialCapabilityConfigurationBaseHeaderEXT.Buffer create(XrSpatialCapabilityConfigurationArucoMarkerEXT.Buffer value) {
        return new XrSpatialCapabilityConfigurationBaseHeaderEXT.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrSpatialCapabilityConfigurationAprilTagEXT.Buffer} instance to {@code XrSpatialCapabilityConfigurationBaseHeaderEXT.Buffer}. */
    public static XrSpatialCapabilityConfigurationBaseHeaderEXT.Buffer create(XrSpatialCapabilityConfigurationAprilTagEXT.Buffer value) {
        return new XrSpatialCapabilityConfigurationBaseHeaderEXT.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrSpatialCapabilityConfigurationAnchorEXT.Buffer} instance to {@code XrSpatialCapabilityConfigurationBaseHeaderEXT.Buffer}. */
    public static XrSpatialCapabilityConfigurationBaseHeaderEXT.Buffer create(XrSpatialCapabilityConfigurationAnchorEXT.Buffer value) {
        return new XrSpatialCapabilityConfigurationBaseHeaderEXT.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrSpatialCapabilityConfigurationBaseHeaderEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialCapabilityConfigurationBaseHeaderEXT malloc(MemoryStack stack) {
        return new XrSpatialCapabilityConfigurationBaseHeaderEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialCapabilityConfigurationBaseHeaderEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialCapabilityConfigurationBaseHeaderEXT calloc(MemoryStack stack) {
        return new XrSpatialCapabilityConfigurationBaseHeaderEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialCapabilityConfigurationBaseHeaderEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialCapabilityConfigurationBaseHeaderEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialCapabilityConfigurationBaseHeaderEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialCapabilityConfigurationBaseHeaderEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialCapabilityConfigurationBaseHeaderEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialCapabilityConfigurationBaseHeaderEXT.NEXT); }
    /** Unsafe version of {@link #capability}. */
    public static int ncapability(long struct) { return memGetInt(struct + XrSpatialCapabilityConfigurationBaseHeaderEXT.CAPABILITY); }
    /** Unsafe version of {@link #enabledComponentCount}. */
    public static int nenabledComponentCount(long struct) { return memGetInt(struct + XrSpatialCapabilityConfigurationBaseHeaderEXT.ENABLEDCOMPONENTCOUNT); }
    /** Unsafe version of {@link #enabledComponents() enabledComponents}. */
    public static IntBuffer nenabledComponents(long struct) { return memIntBuffer(memGetAddress(struct + XrSpatialCapabilityConfigurationBaseHeaderEXT.ENABLEDCOMPONENTS), nenabledComponentCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialCapabilityConfigurationBaseHeaderEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialCapabilityConfigurationBaseHeaderEXT.NEXT, value); }
    /** Unsafe version of {@link #capability(int) capability}. */
    public static void ncapability(long struct, int value) { memPutInt(struct + XrSpatialCapabilityConfigurationBaseHeaderEXT.CAPABILITY, value); }
    /** Sets the specified value to the {@code enabledComponentCount} field of the specified {@code struct}. */
    public static void nenabledComponentCount(long struct, int value) { memPutInt(struct + XrSpatialCapabilityConfigurationBaseHeaderEXT.ENABLEDCOMPONENTCOUNT, value); }
    /** Unsafe version of {@link #enabledComponents(IntBuffer) enabledComponents}. */
    public static void nenabledComponents(long struct, IntBuffer value) { memPutAddress(struct + XrSpatialCapabilityConfigurationBaseHeaderEXT.ENABLEDCOMPONENTS, memAddress(value)); nenabledComponentCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSpatialCapabilityConfigurationBaseHeaderEXT.ENABLEDCOMPONENTS));
    }

    // -----------------------------------

    /** An array of {@link XrSpatialCapabilityConfigurationBaseHeaderEXT} structs. */
    public static class Buffer extends StructBuffer<XrSpatialCapabilityConfigurationBaseHeaderEXT, Buffer> implements NativeResource {

        private static final XrSpatialCapabilityConfigurationBaseHeaderEXT ELEMENT_FACTORY = XrSpatialCapabilityConfigurationBaseHeaderEXT.create(-1L);

        /**
         * Creates a new {@code XrSpatialCapabilityConfigurationBaseHeaderEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialCapabilityConfigurationBaseHeaderEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected XrSpatialCapabilityConfigurationBaseHeaderEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialCapabilityConfigurationBaseHeaderEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSpatialCapabilityConfigurationBaseHeaderEXT.nnext(address()); }
        /** @return the value of the {@code capability} field. */
        @NativeType("XrSpatialCapabilityEXT")
        public int capability() { return XrSpatialCapabilityConfigurationBaseHeaderEXT.ncapability(address()); }
        /** @return the value of the {@code enabledComponentCount} field. */
        @NativeType("uint32_t")
        public int enabledComponentCount() { return XrSpatialCapabilityConfigurationBaseHeaderEXT.nenabledComponentCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code enabledComponents} field. */
        @NativeType("XrSpatialComponentTypeEXT const *")
        public IntBuffer enabledComponents() { return XrSpatialCapabilityConfigurationBaseHeaderEXT.nenabledComponents(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpatialCapabilityConfigurationBaseHeaderEXT.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialCapabilityConfigurationBaseHeaderEXT.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code next} field. */
        public XrSpatialCapabilityConfigurationBaseHeaderEXT.Buffer next(@NativeType("void const *") long value) { XrSpatialCapabilityConfigurationBaseHeaderEXT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code capability} field. */
        public XrSpatialCapabilityConfigurationBaseHeaderEXT.Buffer capability(@NativeType("XrSpatialCapabilityEXT") int value) { XrSpatialCapabilityConfigurationBaseHeaderEXT.ncapability(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code enabledComponents} field. */
        public XrSpatialCapabilityConfigurationBaseHeaderEXT.Buffer enabledComponents(@NativeType("XrSpatialComponentTypeEXT const *") IntBuffer value) { XrSpatialCapabilityConfigurationBaseHeaderEXT.nenabledComponents(address(), value); return this; }

    }

}