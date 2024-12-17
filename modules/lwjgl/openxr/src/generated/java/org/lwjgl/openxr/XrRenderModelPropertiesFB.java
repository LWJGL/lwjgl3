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

import static org.lwjgl.openxr.FBRenderModel.*;

/**
 * <pre>{@code
 * struct XrRenderModelPropertiesFB {
 *     XrStructureType type;
 *     void * next;
 *     uint32_t vendorId;
 *     char modelName[XR_MAX_RENDER_MODEL_NAME_SIZE_FB];
 *     XrRenderModelKeyFB modelKey;
 *     uint32_t modelVersion;
 *     XrRenderModelFlagsFB flags;
 * }}</pre>
 */
public class XrRenderModelPropertiesFB extends Struct<XrRenderModelPropertiesFB> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        VENDORID,
        MODELNAME,
        MODELKEY,
        MODELVERSION,
        FLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __array(1, XR_MAX_RENDER_MODEL_NAME_SIZE_FB),
            __member(8),
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        VENDORID = layout.offsetof(2);
        MODELNAME = layout.offsetof(3);
        MODELKEY = layout.offsetof(4);
        MODELVERSION = layout.offsetof(5);
        FLAGS = layout.offsetof(6);
    }

    protected XrRenderModelPropertiesFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrRenderModelPropertiesFB create(long address, @Nullable ByteBuffer container) {
        return new XrRenderModelPropertiesFB(address, container);
    }

    /**
     * Creates a {@code XrRenderModelPropertiesFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrRenderModelPropertiesFB(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code vendorId} field. */
    @NativeType("uint32_t")
    public int vendorId() { return nvendorId(address()); }
    /** @return a {@link ByteBuffer} view of the {@code modelName} field. */
    @NativeType("char[XR_MAX_RENDER_MODEL_NAME_SIZE_FB]")
    public ByteBuffer modelName() { return nmodelName(address()); }
    /** @return the null-terminated string stored in the {@code modelName} field. */
    @NativeType("char[XR_MAX_RENDER_MODEL_NAME_SIZE_FB]")
    public String modelNameString() { return nmodelNameString(address()); }
    /** @return the value of the {@code modelKey} field. */
    @NativeType("XrRenderModelKeyFB")
    public long modelKey() { return nmodelKey(address()); }
    /** @return the value of the {@code modelVersion} field. */
    @NativeType("uint32_t")
    public int modelVersion() { return nmodelVersion(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("XrRenderModelFlagsFB")
    public long flags() { return nflags(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrRenderModelPropertiesFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBRenderModel#XR_TYPE_RENDER_MODEL_PROPERTIES_FB TYPE_RENDER_MODEL_PROPERTIES_FB} value to the {@code type} field. */
    public XrRenderModelPropertiesFB type$Default() { return type(FBRenderModel.XR_TYPE_RENDER_MODEL_PROPERTIES_FB); }
    /** Sets the specified value to the {@code next} field. */
    public XrRenderModelPropertiesFB next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Prepends the specified {@link XrRenderModelCapabilitiesRequestFB} value to the {@code next} chain. */
    public XrRenderModelPropertiesFB next(XrRenderModelCapabilitiesRequestFB value) { return this.next(value.next(this.next()).address()); }
    /** Sets the specified value to the {@code vendorId} field. */
    public XrRenderModelPropertiesFB vendorId(@NativeType("uint32_t") int value) { nvendorId(address(), value); return this; }
    /** Copies the specified encoded string to the {@code modelName} field. */
    public XrRenderModelPropertiesFB modelName(@NativeType("char[XR_MAX_RENDER_MODEL_NAME_SIZE_FB]") ByteBuffer value) { nmodelName(address(), value); return this; }
    /** Sets the specified value to the {@code modelKey} field. */
    public XrRenderModelPropertiesFB modelKey(@NativeType("XrRenderModelKeyFB") long value) { nmodelKey(address(), value); return this; }
    /** Sets the specified value to the {@code modelVersion} field. */
    public XrRenderModelPropertiesFB modelVersion(@NativeType("uint32_t") int value) { nmodelVersion(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public XrRenderModelPropertiesFB flags(@NativeType("XrRenderModelFlagsFB") long value) { nflags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrRenderModelPropertiesFB set(
        int type,
        long next,
        int vendorId,
        ByteBuffer modelName,
        long modelKey,
        int modelVersion,
        long flags
    ) {
        type(type);
        next(next);
        vendorId(vendorId);
        modelName(modelName);
        modelKey(modelKey);
        modelVersion(modelVersion);
        flags(flags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrRenderModelPropertiesFB set(XrRenderModelPropertiesFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrRenderModelPropertiesFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrRenderModelPropertiesFB malloc() {
        return new XrRenderModelPropertiesFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrRenderModelPropertiesFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrRenderModelPropertiesFB calloc() {
        return new XrRenderModelPropertiesFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrRenderModelPropertiesFB} instance allocated with {@link BufferUtils}. */
    public static XrRenderModelPropertiesFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrRenderModelPropertiesFB(memAddress(container), container);
    }

    /** Returns a new {@code XrRenderModelPropertiesFB} instance for the specified memory address. */
    public static XrRenderModelPropertiesFB create(long address) {
        return new XrRenderModelPropertiesFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrRenderModelPropertiesFB createSafe(long address) {
        return address == NULL ? null : new XrRenderModelPropertiesFB(address, null);
    }

    /**
     * Returns a new {@link XrRenderModelPropertiesFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrRenderModelPropertiesFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrRenderModelPropertiesFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrRenderModelPropertiesFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrRenderModelPropertiesFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrRenderModelPropertiesFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrRenderModelPropertiesFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrRenderModelPropertiesFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrRenderModelPropertiesFB.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrRenderModelPropertiesFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrRenderModelPropertiesFB malloc(MemoryStack stack) {
        return new XrRenderModelPropertiesFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrRenderModelPropertiesFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrRenderModelPropertiesFB calloc(MemoryStack stack) {
        return new XrRenderModelPropertiesFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrRenderModelPropertiesFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrRenderModelPropertiesFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrRenderModelPropertiesFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrRenderModelPropertiesFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrRenderModelPropertiesFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrRenderModelPropertiesFB.NEXT); }
    /** Unsafe version of {@link #vendorId}. */
    public static int nvendorId(long struct) { return memGetInt(struct + XrRenderModelPropertiesFB.VENDORID); }
    /** Unsafe version of {@link #modelName}. */
    public static ByteBuffer nmodelName(long struct) { return memByteBuffer(struct + XrRenderModelPropertiesFB.MODELNAME, XR_MAX_RENDER_MODEL_NAME_SIZE_FB); }
    /** Unsafe version of {@link #modelNameString}. */
    public static String nmodelNameString(long struct) { return memUTF8(struct + XrRenderModelPropertiesFB.MODELNAME); }
    /** Unsafe version of {@link #modelKey}. */
    public static long nmodelKey(long struct) { return memGetLong(struct + XrRenderModelPropertiesFB.MODELKEY); }
    /** Unsafe version of {@link #modelVersion}. */
    public static int nmodelVersion(long struct) { return memGetInt(struct + XrRenderModelPropertiesFB.MODELVERSION); }
    /** Unsafe version of {@link #flags}. */
    public static long nflags(long struct) { return memGetLong(struct + XrRenderModelPropertiesFB.FLAGS); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrRenderModelPropertiesFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrRenderModelPropertiesFB.NEXT, value); }
    /** Unsafe version of {@link #vendorId(int) vendorId}. */
    public static void nvendorId(long struct, int value) { memPutInt(struct + XrRenderModelPropertiesFB.VENDORID, value); }
    /** Unsafe version of {@link #modelName(ByteBuffer) modelName}. */
    public static void nmodelName(long struct, ByteBuffer value) {
        if (CHECKS) {
            checkNT1(value);
            checkGT(value, XR_MAX_RENDER_MODEL_NAME_SIZE_FB);
        }
        memCopy(memAddress(value), struct + XrRenderModelPropertiesFB.MODELNAME, value.remaining());
    }
    /** Unsafe version of {@link #modelKey(long) modelKey}. */
    public static void nmodelKey(long struct, long value) { memPutLong(struct + XrRenderModelPropertiesFB.MODELKEY, value); }
    /** Unsafe version of {@link #modelVersion(int) modelVersion}. */
    public static void nmodelVersion(long struct, int value) { memPutInt(struct + XrRenderModelPropertiesFB.MODELVERSION, value); }
    /** Unsafe version of {@link #flags(long) flags}. */
    public static void nflags(long struct, long value) { memPutLong(struct + XrRenderModelPropertiesFB.FLAGS, value); }

    // -----------------------------------

    /** An array of {@link XrRenderModelPropertiesFB} structs. */
    public static class Buffer extends StructBuffer<XrRenderModelPropertiesFB, Buffer> implements NativeResource {

        private static final XrRenderModelPropertiesFB ELEMENT_FACTORY = XrRenderModelPropertiesFB.create(-1L);

        /**
         * Creates a new {@code XrRenderModelPropertiesFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrRenderModelPropertiesFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrRenderModelPropertiesFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrRenderModelPropertiesFB.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrRenderModelPropertiesFB.nnext(address()); }
        /** @return the value of the {@code vendorId} field. */
        @NativeType("uint32_t")
        public int vendorId() { return XrRenderModelPropertiesFB.nvendorId(address()); }
        /** @return a {@link ByteBuffer} view of the {@code modelName} field. */
        @NativeType("char[XR_MAX_RENDER_MODEL_NAME_SIZE_FB]")
        public ByteBuffer modelName() { return XrRenderModelPropertiesFB.nmodelName(address()); }
        /** @return the null-terminated string stored in the {@code modelName} field. */
        @NativeType("char[XR_MAX_RENDER_MODEL_NAME_SIZE_FB]")
        public String modelNameString() { return XrRenderModelPropertiesFB.nmodelNameString(address()); }
        /** @return the value of the {@code modelKey} field. */
        @NativeType("XrRenderModelKeyFB")
        public long modelKey() { return XrRenderModelPropertiesFB.nmodelKey(address()); }
        /** @return the value of the {@code modelVersion} field. */
        @NativeType("uint32_t")
        public int modelVersion() { return XrRenderModelPropertiesFB.nmodelVersion(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("XrRenderModelFlagsFB")
        public long flags() { return XrRenderModelPropertiesFB.nflags(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrRenderModelPropertiesFB.Buffer type(@NativeType("XrStructureType") int value) { XrRenderModelPropertiesFB.ntype(address(), value); return this; }
        /** Sets the {@link FBRenderModel#XR_TYPE_RENDER_MODEL_PROPERTIES_FB TYPE_RENDER_MODEL_PROPERTIES_FB} value to the {@code type} field. */
        public XrRenderModelPropertiesFB.Buffer type$Default() { return type(FBRenderModel.XR_TYPE_RENDER_MODEL_PROPERTIES_FB); }
        /** Sets the specified value to the {@code next} field. */
        public XrRenderModelPropertiesFB.Buffer next(@NativeType("void *") long value) { XrRenderModelPropertiesFB.nnext(address(), value); return this; }
        /** Prepends the specified {@link XrRenderModelCapabilitiesRequestFB} value to the {@code next} chain. */
        public XrRenderModelPropertiesFB.Buffer next(XrRenderModelCapabilitiesRequestFB value) { return this.next(value.next(this.next()).address()); }
        /** Sets the specified value to the {@code vendorId} field. */
        public XrRenderModelPropertiesFB.Buffer vendorId(@NativeType("uint32_t") int value) { XrRenderModelPropertiesFB.nvendorId(address(), value); return this; }
        /** Copies the specified encoded string to the {@code modelName} field. */
        public XrRenderModelPropertiesFB.Buffer modelName(@NativeType("char[XR_MAX_RENDER_MODEL_NAME_SIZE_FB]") ByteBuffer value) { XrRenderModelPropertiesFB.nmodelName(address(), value); return this; }
        /** Sets the specified value to the {@code modelKey} field. */
        public XrRenderModelPropertiesFB.Buffer modelKey(@NativeType("XrRenderModelKeyFB") long value) { XrRenderModelPropertiesFB.nmodelKey(address(), value); return this; }
        /** Sets the specified value to the {@code modelVersion} field. */
        public XrRenderModelPropertiesFB.Buffer modelVersion(@NativeType("uint32_t") int value) { XrRenderModelPropertiesFB.nmodelVersion(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public XrRenderModelPropertiesFB.Buffer flags(@NativeType("XrRenderModelFlagsFB") long value) { XrRenderModelPropertiesFB.nflags(address(), value); return this; }

    }

}