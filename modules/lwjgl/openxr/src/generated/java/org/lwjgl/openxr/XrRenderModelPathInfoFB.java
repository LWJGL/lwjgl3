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
 * Supported model paths.
 * 
 * <h5>Description</h5>
 * 
 * <p>{@link XrRenderModelPathInfoFB} contains a model path supported by the device when returned from {@link FBRenderModel#xrEnumerateRenderModelPathsFB EnumerateRenderModelPathsFB}. This path can be used to request information about the render model for the connected device that the path represents using {@link FBRenderModel#xrGetRenderModelPropertiesFB GetRenderModelPropertiesFB}.</p>
 * 
 * <h5>Possible Render Model Paths</h5>
 * 
 * <ul>
 * <li>Controller models with origin at the grip pose.
 * 
 * <ul>
 * <li>pathname:/model_fb/controller/left</li>
 * <li>pathname:/model_fb/controller/right</li>
 * </ul>
 * </li>
 * <li>Keyboard models with origin at the center of its bounding box.
 * 
 * <ul>
 * <li>pathname:/model_fb/keyboard/local</li>
 * <li>pathname:/model_fb/keyboard/remote</li>
 * </ul>
 * </li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBRenderModel XR_FB_render_model} extension <b>must</b> be enabled prior to using {@link XrRenderModelPathInfoFB}</li>
 * <li>{@code type} <b>must</b> be {@link FBRenderModel#XR_TYPE_RENDER_MODEL_PATH_INFO_FB TYPE_RENDER_MODEL_PATH_INFO_FB}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link FBRenderModel#xrEnumerateRenderModelPathsFB EnumerateRenderModelPathsFB}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrRenderModelPathInfoFB {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     XrPath {@link #path};
 * }</code></pre>
 */
public class XrRenderModelPathInfoFB extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        PATH;

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
        PATH = layout.offsetof(2);
    }

    /**
     * Creates a {@code XrRenderModelPathInfoFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrRenderModelPathInfoFB(ByteBuffer container) {
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
    /** a valid {@code XrPath} used for retrieving model properties from {@link FBRenderModel#xrGetRenderModelPropertiesFB GetRenderModelPropertiesFB}. */
    @NativeType("XrPath")
    public long path() { return npath(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrRenderModelPathInfoFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBRenderModel#XR_TYPE_RENDER_MODEL_PATH_INFO_FB TYPE_RENDER_MODEL_PATH_INFO_FB} value to the {@link #type} field. */
    public XrRenderModelPathInfoFB type$Default() { return type(FBRenderModel.XR_TYPE_RENDER_MODEL_PATH_INFO_FB); }
    /** Sets the specified value to the {@link #next} field. */
    public XrRenderModelPathInfoFB next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #path} field. */
    public XrRenderModelPathInfoFB path(@NativeType("XrPath") long value) { npath(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrRenderModelPathInfoFB set(
        int type,
        long next,
        long path
    ) {
        type(type);
        next(next);
        path(path);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrRenderModelPathInfoFB set(XrRenderModelPathInfoFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrRenderModelPathInfoFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrRenderModelPathInfoFB malloc() {
        return wrap(XrRenderModelPathInfoFB.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrRenderModelPathInfoFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrRenderModelPathInfoFB calloc() {
        return wrap(XrRenderModelPathInfoFB.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrRenderModelPathInfoFB} instance allocated with {@link BufferUtils}. */
    public static XrRenderModelPathInfoFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrRenderModelPathInfoFB.class, memAddress(container), container);
    }

    /** Returns a new {@code XrRenderModelPathInfoFB} instance for the specified memory address. */
    public static XrRenderModelPathInfoFB create(long address) {
        return wrap(XrRenderModelPathInfoFB.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrRenderModelPathInfoFB createSafe(long address) {
        return address == NULL ? null : wrap(XrRenderModelPathInfoFB.class, address);
    }

    /**
     * Returns a new {@link XrRenderModelPathInfoFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrRenderModelPathInfoFB.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrRenderModelPathInfoFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrRenderModelPathInfoFB.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrRenderModelPathInfoFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrRenderModelPathInfoFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrRenderModelPathInfoFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrRenderModelPathInfoFB.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrRenderModelPathInfoFB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrRenderModelPathInfoFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrRenderModelPathInfoFB malloc(MemoryStack stack) {
        return wrap(XrRenderModelPathInfoFB.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrRenderModelPathInfoFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrRenderModelPathInfoFB calloc(MemoryStack stack) {
        return wrap(XrRenderModelPathInfoFB.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrRenderModelPathInfoFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrRenderModelPathInfoFB.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrRenderModelPathInfoFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrRenderModelPathInfoFB.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrRenderModelPathInfoFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrRenderModelPathInfoFB.NEXT); }
    /** Unsafe version of {@link #path}. */
    public static long npath(long struct) { return UNSAFE.getLong(null, struct + XrRenderModelPathInfoFB.PATH); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrRenderModelPathInfoFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrRenderModelPathInfoFB.NEXT, value); }
    /** Unsafe version of {@link #path(long) path}. */
    public static void npath(long struct, long value) { UNSAFE.putLong(null, struct + XrRenderModelPathInfoFB.PATH, value); }

    // -----------------------------------

    /** An array of {@link XrRenderModelPathInfoFB} structs. */
    public static class Buffer extends StructBuffer<XrRenderModelPathInfoFB, Buffer> implements NativeResource {

        private static final XrRenderModelPathInfoFB ELEMENT_FACTORY = XrRenderModelPathInfoFB.create(-1L);

        /**
         * Creates a new {@code XrRenderModelPathInfoFB.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrRenderModelPathInfoFB#SIZEOF}, and its mark will be undefined.
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
        protected XrRenderModelPathInfoFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrRenderModelPathInfoFB#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrRenderModelPathInfoFB.ntype(address()); }
        /** @return the value of the {@link XrRenderModelPathInfoFB#next} field. */
        @NativeType("void *")
        public long next() { return XrRenderModelPathInfoFB.nnext(address()); }
        /** @return the value of the {@link XrRenderModelPathInfoFB#path} field. */
        @NativeType("XrPath")
        public long path() { return XrRenderModelPathInfoFB.npath(address()); }

        /** Sets the specified value to the {@link XrRenderModelPathInfoFB#type} field. */
        public XrRenderModelPathInfoFB.Buffer type(@NativeType("XrStructureType") int value) { XrRenderModelPathInfoFB.ntype(address(), value); return this; }
        /** Sets the {@link FBRenderModel#XR_TYPE_RENDER_MODEL_PATH_INFO_FB TYPE_RENDER_MODEL_PATH_INFO_FB} value to the {@link XrRenderModelPathInfoFB#type} field. */
        public XrRenderModelPathInfoFB.Buffer type$Default() { return type(FBRenderModel.XR_TYPE_RENDER_MODEL_PATH_INFO_FB); }
        /** Sets the specified value to the {@link XrRenderModelPathInfoFB#next} field. */
        public XrRenderModelPathInfoFB.Buffer next(@NativeType("void *") long value) { XrRenderModelPathInfoFB.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrRenderModelPathInfoFB#path} field. */
        public XrRenderModelPathInfoFB.Buffer path(@NativeType("XrPath") long value) { XrRenderModelPathInfoFB.npath(address(), value); return this; }

    }

}