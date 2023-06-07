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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * A render model system property.
 * 
 * <h5>Description</h5>
 * 
 * <p>{@link XrRenderModelCapabilitiesRequestFB} contains information about the render capabilities requested for a model. {@link XrRenderModelCapabilitiesRequestFB} <b>must</b> be set in the structure chain of the {@code next} pointer on the {@link XrRenderModelPropertiesFB} passed into the {@link FBRenderModel#xrGetRenderModelPropertiesFB GetRenderModelPropertiesFB} call. The {@code flags} on {@link XrRenderModelCapabilitiesRequestFB} represent an acknowledgement of being able to handle the individual model capability levels. If no {@link XrRenderModelCapabilitiesRequestFB} is on the structure chain then the runtime <b>should</b> treat it as if a value of {@link FBRenderModel#XR_RENDER_MODEL_SUPPORTS_GLTF_2_0_SUBSET_1_BIT_FB RENDER_MODEL_SUPPORTS_GLTF_2_0_SUBSET_1_BIT_FB} was set. If the runtime does not have a model available that matches any of the supports flags set, then it <b>must</b> return a {@link FBRenderModel#XR_RENDER_MODEL_UNAVAILABLE_FB RENDER_MODEL_UNAVAILABLE_FB} result.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBRenderModel XR_FB_render_model} extension <b>must</b> be enabled prior to using {@link XrRenderModelCapabilitiesRequestFB}</li>
 * <li>{@code type} <b>must</b> be {@link FBRenderModel#XR_TYPE_RENDER_MODEL_CAPABILITIES_REQUEST_FB TYPE_RENDER_MODEL_CAPABILITIES_REQUEST_FB}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrRenderModelCapabilitiesRequestFB {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     XrRenderModelFlagsFB {@link #flags};
 * }</code></pre>
 */
public class XrRenderModelCapabilitiesRequestFB extends Struct<XrRenderModelCapabilitiesRequestFB> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        FLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
    }

    protected XrRenderModelCapabilitiesRequestFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrRenderModelCapabilitiesRequestFB create(long address, @Nullable ByteBuffer container) {
        return new XrRenderModelCapabilitiesRequestFB(address, container);
    }

    /**
     * Creates a {@code XrRenderModelCapabilitiesRequestFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrRenderModelCapabilitiesRequestFB(ByteBuffer container) {
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
    /** a bit mask of the model complexities that the application is able to support. */
    @NativeType("XrRenderModelFlagsFB")
    public long flags() { return nflags(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrRenderModelCapabilitiesRequestFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBRenderModel#XR_TYPE_RENDER_MODEL_CAPABILITIES_REQUEST_FB TYPE_RENDER_MODEL_CAPABILITIES_REQUEST_FB} value to the {@link #type} field. */
    public XrRenderModelCapabilitiesRequestFB type$Default() { return type(FBRenderModel.XR_TYPE_RENDER_MODEL_CAPABILITIES_REQUEST_FB); }
    /** Sets the specified value to the {@link #next} field. */
    public XrRenderModelCapabilitiesRequestFB next(@NativeType("void *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrRenderModelCapabilitiesRequestFB set(
        int type,
        long next
    ) {
        type(type);
        next(next);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrRenderModelCapabilitiesRequestFB set(XrRenderModelCapabilitiesRequestFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrRenderModelCapabilitiesRequestFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrRenderModelCapabilitiesRequestFB malloc() {
        return new XrRenderModelCapabilitiesRequestFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrRenderModelCapabilitiesRequestFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrRenderModelCapabilitiesRequestFB calloc() {
        return new XrRenderModelCapabilitiesRequestFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrRenderModelCapabilitiesRequestFB} instance allocated with {@link BufferUtils}. */
    public static XrRenderModelCapabilitiesRequestFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrRenderModelCapabilitiesRequestFB(memAddress(container), container);
    }

    /** Returns a new {@code XrRenderModelCapabilitiesRequestFB} instance for the specified memory address. */
    public static XrRenderModelCapabilitiesRequestFB create(long address) {
        return new XrRenderModelCapabilitiesRequestFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrRenderModelCapabilitiesRequestFB createSafe(long address) {
        return address == NULL ? null : new XrRenderModelCapabilitiesRequestFB(address, null);
    }

    /**
     * Returns a new {@link XrRenderModelCapabilitiesRequestFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrRenderModelCapabilitiesRequestFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrRenderModelCapabilitiesRequestFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrRenderModelCapabilitiesRequestFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrRenderModelCapabilitiesRequestFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrRenderModelCapabilitiesRequestFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrRenderModelCapabilitiesRequestFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrRenderModelCapabilitiesRequestFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrRenderModelCapabilitiesRequestFB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrRenderModelCapabilitiesRequestFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrRenderModelCapabilitiesRequestFB malloc(MemoryStack stack) {
        return new XrRenderModelCapabilitiesRequestFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrRenderModelCapabilitiesRequestFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrRenderModelCapabilitiesRequestFB calloc(MemoryStack stack) {
        return new XrRenderModelCapabilitiesRequestFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrRenderModelCapabilitiesRequestFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrRenderModelCapabilitiesRequestFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrRenderModelCapabilitiesRequestFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrRenderModelCapabilitiesRequestFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrRenderModelCapabilitiesRequestFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrRenderModelCapabilitiesRequestFB.NEXT); }
    /** Unsafe version of {@link #flags}. */
    public static long nflags(long struct) { return UNSAFE.getLong(null, struct + XrRenderModelCapabilitiesRequestFB.FLAGS); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrRenderModelCapabilitiesRequestFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrRenderModelCapabilitiesRequestFB.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrRenderModelCapabilitiesRequestFB} structs. */
    public static class Buffer extends StructBuffer<XrRenderModelCapabilitiesRequestFB, Buffer> implements NativeResource {

        private static final XrRenderModelCapabilitiesRequestFB ELEMENT_FACTORY = XrRenderModelCapabilitiesRequestFB.create(-1L);

        /**
         * Creates a new {@code XrRenderModelCapabilitiesRequestFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrRenderModelCapabilitiesRequestFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrRenderModelCapabilitiesRequestFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrRenderModelCapabilitiesRequestFB#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrRenderModelCapabilitiesRequestFB.ntype(address()); }
        /** @return the value of the {@link XrRenderModelCapabilitiesRequestFB#next} field. */
        @NativeType("void *")
        public long next() { return XrRenderModelCapabilitiesRequestFB.nnext(address()); }
        /** @return the value of the {@link XrRenderModelCapabilitiesRequestFB#flags} field. */
        @NativeType("XrRenderModelFlagsFB")
        public long flags() { return XrRenderModelCapabilitiesRequestFB.nflags(address()); }

        /** Sets the specified value to the {@link XrRenderModelCapabilitiesRequestFB#type} field. */
        public XrRenderModelCapabilitiesRequestFB.Buffer type(@NativeType("XrStructureType") int value) { XrRenderModelCapabilitiesRequestFB.ntype(address(), value); return this; }
        /** Sets the {@link FBRenderModel#XR_TYPE_RENDER_MODEL_CAPABILITIES_REQUEST_FB TYPE_RENDER_MODEL_CAPABILITIES_REQUEST_FB} value to the {@link XrRenderModelCapabilitiesRequestFB#type} field. */
        public XrRenderModelCapabilitiesRequestFB.Buffer type$Default() { return type(FBRenderModel.XR_TYPE_RENDER_MODEL_CAPABILITIES_REQUEST_FB); }
        /** Sets the specified value to the {@link XrRenderModelCapabilitiesRequestFB#next} field. */
        public XrRenderModelCapabilitiesRequestFB.Buffer next(@NativeType("void *") long value) { XrRenderModelCapabilitiesRequestFB.nnext(address(), value); return this; }

    }

}