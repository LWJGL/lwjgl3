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

import static org.lwjgl.openxr.FBRenderModel.*;

/**
 * The information about the render model.
 * 
 * <h5>Description</h5>
 * 
 * <p>{@link XrRenderModelPropertiesFB} contains information about the render model for a device. {@link XrRenderModelPropertiesFB} <b>must</b> be provided when calling {@link FBRenderModel#xrGetRenderModelPropertiesFB GetRenderModelPropertiesFB}. The {@code XrRenderModelKeyFB} included in the properties is a unique key for each render model that is valid across multiple instances and installs.</p>
 * 
 * <p>If the application decides to cache or save the render model in any way, {@code modelVersion} can be used to determine if the render model has changed. The application <b>should</b> then update its cached or saved version.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBRenderModel XR_FB_render_model} extension <b>must</b> be enabled prior to using {@link XrRenderModelPropertiesFB}</li>
 * <li>{@code type} <b>must</b> be {@link FBRenderModel#XR_TYPE_RENDER_MODEL_PROPERTIES_FB TYPE_RENDER_MODEL_PROPERTIES_FB}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code modelName} <b>must</b> be a null-terminated UTF-8 string whose length is less than or equal to {@link FBRenderModel#XR_MAX_RENDER_MODEL_NAME_SIZE_FB MAX_RENDER_MODEL_NAME_SIZE_FB}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link FBRenderModel#xrGetRenderModelPropertiesFB GetRenderModelPropertiesFB}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrRenderModelPropertiesFB {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     uint32_t {@link #vendorId};
 *     char {@link #modelName}[XR_MAX_RENDER_MODEL_NAME_SIZE_FB];
 *     XrRenderModelKeyFB {@link #modelKey};
 *     uint32_t {@link #modelVersion};
 *     XrRenderModelFlagsFB {@link #flags};
 * }</code></pre>
 */
public class XrRenderModelPropertiesFB extends Struct implements NativeResource {

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

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** the vendor id of the model. */
    @NativeType("uint32_t")
    public int vendorId() { return nvendorId(address()); }
    /** the name of the model. */
    @NativeType("char[XR_MAX_RENDER_MODEL_NAME_SIZE_FB]")
    public ByteBuffer modelName() { return nmodelName(address()); }
    /** the name of the model. */
    @NativeType("char[XR_MAX_RENDER_MODEL_NAME_SIZE_FB]")
    public String modelNameString() { return nmodelNameString(address()); }
    /** the unique model key used to load the model in {@link FBRenderModel#xrLoadRenderModelFB LoadRenderModelFB}. */
    @NativeType("XrRenderModelKeyFB")
    public long modelKey() { return nmodelKey(address()); }
    /** the version number of the model. */
    @NativeType("uint32_t")
    public int modelVersion() { return nmodelVersion(address()); }
    /** a bitmask of {@code XrRenderModelFlagsFB}. */
    @NativeType("XrRenderModelFlagsFB")
    public long flags() { return nflags(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrRenderModelPropertiesFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBRenderModel#XR_TYPE_RENDER_MODEL_PROPERTIES_FB TYPE_RENDER_MODEL_PROPERTIES_FB} value to the {@link #type} field. */
    public XrRenderModelPropertiesFB type$Default() { return type(FBRenderModel.XR_TYPE_RENDER_MODEL_PROPERTIES_FB); }
    /** Sets the specified value to the {@link #next} field. */
    public XrRenderModelPropertiesFB next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #vendorId} field. */
    public XrRenderModelPropertiesFB vendorId(@NativeType("uint32_t") int value) { nvendorId(address(), value); return this; }
    /** Copies the specified encoded string to the {@link #modelName} field. */
    public XrRenderModelPropertiesFB modelName(@NativeType("char[XR_MAX_RENDER_MODEL_NAME_SIZE_FB]") ByteBuffer value) { nmodelName(address(), value); return this; }
    /** Sets the specified value to the {@link #modelKey} field. */
    public XrRenderModelPropertiesFB modelKey(@NativeType("XrRenderModelKeyFB") long value) { nmodelKey(address(), value); return this; }
    /** Sets the specified value to the {@link #modelVersion} field. */
    public XrRenderModelPropertiesFB modelVersion(@NativeType("uint32_t") int value) { nmodelVersion(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
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
        return wrap(XrRenderModelPropertiesFB.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrRenderModelPropertiesFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrRenderModelPropertiesFB calloc() {
        return wrap(XrRenderModelPropertiesFB.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrRenderModelPropertiesFB} instance allocated with {@link BufferUtils}. */
    public static XrRenderModelPropertiesFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrRenderModelPropertiesFB.class, memAddress(container), container);
    }

    /** Returns a new {@code XrRenderModelPropertiesFB} instance for the specified memory address. */
    public static XrRenderModelPropertiesFB create(long address) {
        return wrap(XrRenderModelPropertiesFB.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrRenderModelPropertiesFB createSafe(long address) {
        return address == NULL ? null : wrap(XrRenderModelPropertiesFB.class, address);
    }

    /**
     * Returns a new {@link XrRenderModelPropertiesFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrRenderModelPropertiesFB.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrRenderModelPropertiesFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrRenderModelPropertiesFB.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrRenderModelPropertiesFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrRenderModelPropertiesFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrRenderModelPropertiesFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrRenderModelPropertiesFB.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrRenderModelPropertiesFB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrRenderModelPropertiesFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrRenderModelPropertiesFB malloc(MemoryStack stack) {
        return wrap(XrRenderModelPropertiesFB.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrRenderModelPropertiesFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrRenderModelPropertiesFB calloc(MemoryStack stack) {
        return wrap(XrRenderModelPropertiesFB.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrRenderModelPropertiesFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrRenderModelPropertiesFB.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrRenderModelPropertiesFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrRenderModelPropertiesFB.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrRenderModelPropertiesFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrRenderModelPropertiesFB.NEXT); }
    /** Unsafe version of {@link #vendorId}. */
    public static int nvendorId(long struct) { return UNSAFE.getInt(null, struct + XrRenderModelPropertiesFB.VENDORID); }
    /** Unsafe version of {@link #modelName}. */
    public static ByteBuffer nmodelName(long struct) { return memByteBuffer(struct + XrRenderModelPropertiesFB.MODELNAME, XR_MAX_RENDER_MODEL_NAME_SIZE_FB); }
    /** Unsafe version of {@link #modelNameString}. */
    public static String nmodelNameString(long struct) { return memUTF8(struct + XrRenderModelPropertiesFB.MODELNAME); }
    /** Unsafe version of {@link #modelKey}. */
    public static long nmodelKey(long struct) { return UNSAFE.getLong(null, struct + XrRenderModelPropertiesFB.MODELKEY); }
    /** Unsafe version of {@link #modelVersion}. */
    public static int nmodelVersion(long struct) { return UNSAFE.getInt(null, struct + XrRenderModelPropertiesFB.MODELVERSION); }
    /** Unsafe version of {@link #flags}. */
    public static long nflags(long struct) { return UNSAFE.getLong(null, struct + XrRenderModelPropertiesFB.FLAGS); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrRenderModelPropertiesFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrRenderModelPropertiesFB.NEXT, value); }
    /** Unsafe version of {@link #vendorId(int) vendorId}. */
    public static void nvendorId(long struct, int value) { UNSAFE.putInt(null, struct + XrRenderModelPropertiesFB.VENDORID, value); }
    /** Unsafe version of {@link #modelName(ByteBuffer) modelName}. */
    public static void nmodelName(long struct, ByteBuffer value) {
        if (CHECKS) {
            checkNT1(value);
            checkGT(value, XR_MAX_RENDER_MODEL_NAME_SIZE_FB);
        }
        memCopy(memAddress(value), struct + XrRenderModelPropertiesFB.MODELNAME, value.remaining());
    }
    /** Unsafe version of {@link #modelKey(long) modelKey}. */
    public static void nmodelKey(long struct, long value) { UNSAFE.putLong(null, struct + XrRenderModelPropertiesFB.MODELKEY, value); }
    /** Unsafe version of {@link #modelVersion(int) modelVersion}. */
    public static void nmodelVersion(long struct, int value) { UNSAFE.putInt(null, struct + XrRenderModelPropertiesFB.MODELVERSION, value); }
    /** Unsafe version of {@link #flags(long) flags}. */
    public static void nflags(long struct, long value) { UNSAFE.putLong(null, struct + XrRenderModelPropertiesFB.FLAGS, value); }

    // -----------------------------------

    /** An array of {@link XrRenderModelPropertiesFB} structs. */
    public static class Buffer extends StructBuffer<XrRenderModelPropertiesFB, Buffer> implements NativeResource {

        private static final XrRenderModelPropertiesFB ELEMENT_FACTORY = XrRenderModelPropertiesFB.create(-1L);

        /**
         * Creates a new {@code XrRenderModelPropertiesFB.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrRenderModelPropertiesFB#SIZEOF}, and its mark will be undefined.
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
        protected XrRenderModelPropertiesFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrRenderModelPropertiesFB#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrRenderModelPropertiesFB.ntype(address()); }
        /** @return the value of the {@link XrRenderModelPropertiesFB#next} field. */
        @NativeType("void *")
        public long next() { return XrRenderModelPropertiesFB.nnext(address()); }
        /** @return the value of the {@link XrRenderModelPropertiesFB#vendorId} field. */
        @NativeType("uint32_t")
        public int vendorId() { return XrRenderModelPropertiesFB.nvendorId(address()); }
        /** @return a {@link ByteBuffer} view of the {@link XrRenderModelPropertiesFB#modelName} field. */
        @NativeType("char[XR_MAX_RENDER_MODEL_NAME_SIZE_FB]")
        public ByteBuffer modelName() { return XrRenderModelPropertiesFB.nmodelName(address()); }
        /** @return the null-terminated string stored in the {@link XrRenderModelPropertiesFB#modelName} field. */
        @NativeType("char[XR_MAX_RENDER_MODEL_NAME_SIZE_FB]")
        public String modelNameString() { return XrRenderModelPropertiesFB.nmodelNameString(address()); }
        /** @return the value of the {@link XrRenderModelPropertiesFB#modelKey} field. */
        @NativeType("XrRenderModelKeyFB")
        public long modelKey() { return XrRenderModelPropertiesFB.nmodelKey(address()); }
        /** @return the value of the {@link XrRenderModelPropertiesFB#modelVersion} field. */
        @NativeType("uint32_t")
        public int modelVersion() { return XrRenderModelPropertiesFB.nmodelVersion(address()); }
        /** @return the value of the {@link XrRenderModelPropertiesFB#flags} field. */
        @NativeType("XrRenderModelFlagsFB")
        public long flags() { return XrRenderModelPropertiesFB.nflags(address()); }

        /** Sets the specified value to the {@link XrRenderModelPropertiesFB#type} field. */
        public XrRenderModelPropertiesFB.Buffer type(@NativeType("XrStructureType") int value) { XrRenderModelPropertiesFB.ntype(address(), value); return this; }
        /** Sets the {@link FBRenderModel#XR_TYPE_RENDER_MODEL_PROPERTIES_FB TYPE_RENDER_MODEL_PROPERTIES_FB} value to the {@link XrRenderModelPropertiesFB#type} field. */
        public XrRenderModelPropertiesFB.Buffer type$Default() { return type(FBRenderModel.XR_TYPE_RENDER_MODEL_PROPERTIES_FB); }
        /** Sets the specified value to the {@link XrRenderModelPropertiesFB#next} field. */
        public XrRenderModelPropertiesFB.Buffer next(@NativeType("void *") long value) { XrRenderModelPropertiesFB.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrRenderModelPropertiesFB#vendorId} field. */
        public XrRenderModelPropertiesFB.Buffer vendorId(@NativeType("uint32_t") int value) { XrRenderModelPropertiesFB.nvendorId(address(), value); return this; }
        /** Copies the specified encoded string to the {@link XrRenderModelPropertiesFB#modelName} field. */
        public XrRenderModelPropertiesFB.Buffer modelName(@NativeType("char[XR_MAX_RENDER_MODEL_NAME_SIZE_FB]") ByteBuffer value) { XrRenderModelPropertiesFB.nmodelName(address(), value); return this; }
        /** Sets the specified value to the {@link XrRenderModelPropertiesFB#modelKey} field. */
        public XrRenderModelPropertiesFB.Buffer modelKey(@NativeType("XrRenderModelKeyFB") long value) { XrRenderModelPropertiesFB.nmodelKey(address(), value); return this; }
        /** Sets the specified value to the {@link XrRenderModelPropertiesFB#modelVersion} field. */
        public XrRenderModelPropertiesFB.Buffer modelVersion(@NativeType("uint32_t") int value) { XrRenderModelPropertiesFB.nmodelVersion(address(), value); return this; }
        /** Sets the specified value to the {@link XrRenderModelPropertiesFB#flags} field. */
        public XrRenderModelPropertiesFB.Buffer flags(@NativeType("XrRenderModelFlagsFB") long value) { XrRenderModelPropertiesFB.nflags(address(), value); return this; }

    }

}