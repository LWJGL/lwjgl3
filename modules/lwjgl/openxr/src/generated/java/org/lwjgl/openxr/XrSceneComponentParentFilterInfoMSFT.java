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
 * Scene component parent filter.
 * 
 * <h5>Description</h5>
 * 
 * <p>The runtime <b>must</b> return only scene components with matching {@code parentId}. If {@code parentId} is zero then the runtime <b>must</b> return only scene components that do not have a parent.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension <b>must</b> be enabled prior to using {@link XrSceneComponentParentFilterInfoMSFT}</li>
 * <li>{@code type} <b>must</b> be {@link MSFTSceneUnderstanding#XR_TYPE_SCENE_COMPONENT_PARENT_FILTER_INFO_MSFT TYPE_SCENE_COMPONENT_PARENT_FILTER_INFO_MSFT}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrSceneComponentsGetInfoMSFT}, {@link XrUuidMSFT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSceneComponentParentFilterInfoMSFT {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     {@link XrUuidMSFT XrUuidMSFT} {@link #parentId};
 * }</code></pre>
 */
public class XrSceneComponentParentFilterInfoMSFT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        PARENTID;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(XrUuidMSFT.SIZEOF, XrUuidMSFT.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        PARENTID = layout.offsetof(2);
    }

    /**
     * Creates a {@code XrSceneComponentParentFilterInfoMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSceneComponentParentFilterInfoMSFT(ByteBuffer container) {
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
    /** the {@link XrUuidMSFT} of the parent scene component to filter by. */
    public XrUuidMSFT parentId() { return nparentId(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrSceneComponentParentFilterInfoMSFT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MSFTSceneUnderstanding#XR_TYPE_SCENE_COMPONENT_PARENT_FILTER_INFO_MSFT TYPE_SCENE_COMPONENT_PARENT_FILTER_INFO_MSFT} value to the {@link #type} field. */
    public XrSceneComponentParentFilterInfoMSFT type$Default() { return type(MSFTSceneUnderstanding.XR_TYPE_SCENE_COMPONENT_PARENT_FILTER_INFO_MSFT); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSceneComponentParentFilterInfoMSFT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Copies the specified {@link XrUuidMSFT} to the {@link #parentId} field. */
    public XrSceneComponentParentFilterInfoMSFT parentId(XrUuidMSFT value) { nparentId(address(), value); return this; }
    /** Passes the {@link #parentId} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrSceneComponentParentFilterInfoMSFT parentId(java.util.function.Consumer<XrUuidMSFT> consumer) { consumer.accept(parentId()); return this; }

    /** Initializes this struct with the specified values. */
    public XrSceneComponentParentFilterInfoMSFT set(
        int type,
        long next,
        XrUuidMSFT parentId
    ) {
        type(type);
        next(next);
        parentId(parentId);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSceneComponentParentFilterInfoMSFT set(XrSceneComponentParentFilterInfoMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSceneComponentParentFilterInfoMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSceneComponentParentFilterInfoMSFT malloc() {
        return wrap(XrSceneComponentParentFilterInfoMSFT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrSceneComponentParentFilterInfoMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSceneComponentParentFilterInfoMSFT calloc() {
        return wrap(XrSceneComponentParentFilterInfoMSFT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrSceneComponentParentFilterInfoMSFT} instance allocated with {@link BufferUtils}. */
    public static XrSceneComponentParentFilterInfoMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrSceneComponentParentFilterInfoMSFT.class, memAddress(container), container);
    }

    /** Returns a new {@code XrSceneComponentParentFilterInfoMSFT} instance for the specified memory address. */
    public static XrSceneComponentParentFilterInfoMSFT create(long address) {
        return wrap(XrSceneComponentParentFilterInfoMSFT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSceneComponentParentFilterInfoMSFT createSafe(long address) {
        return address == NULL ? null : wrap(XrSceneComponentParentFilterInfoMSFT.class, address);
    }

    /**
     * Returns a new {@link XrSceneComponentParentFilterInfoMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneComponentParentFilterInfoMSFT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSceneComponentParentFilterInfoMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneComponentParentFilterInfoMSFT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSceneComponentParentFilterInfoMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneComponentParentFilterInfoMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrSceneComponentParentFilterInfoMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSceneComponentParentFilterInfoMSFT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSceneComponentParentFilterInfoMSFT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrSceneComponentParentFilterInfoMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSceneComponentParentFilterInfoMSFT malloc(MemoryStack stack) {
        return wrap(XrSceneComponentParentFilterInfoMSFT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrSceneComponentParentFilterInfoMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSceneComponentParentFilterInfoMSFT calloc(MemoryStack stack) {
        return wrap(XrSceneComponentParentFilterInfoMSFT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrSceneComponentParentFilterInfoMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSceneComponentParentFilterInfoMSFT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSceneComponentParentFilterInfoMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSceneComponentParentFilterInfoMSFT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSceneComponentParentFilterInfoMSFT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSceneComponentParentFilterInfoMSFT.NEXT); }
    /** Unsafe version of {@link #parentId}. */
    public static XrUuidMSFT nparentId(long struct) { return XrUuidMSFT.create(struct + XrSceneComponentParentFilterInfoMSFT.PARENTID); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSceneComponentParentFilterInfoMSFT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSceneComponentParentFilterInfoMSFT.NEXT, value); }
    /** Unsafe version of {@link #parentId(XrUuidMSFT) parentId}. */
    public static void nparentId(long struct, XrUuidMSFT value) { memCopy(value.address(), struct + XrSceneComponentParentFilterInfoMSFT.PARENTID, XrUuidMSFT.SIZEOF); }

    // -----------------------------------

    /** An array of {@link XrSceneComponentParentFilterInfoMSFT} structs. */
    public static class Buffer extends StructBuffer<XrSceneComponentParentFilterInfoMSFT, Buffer> implements NativeResource {

        private static final XrSceneComponentParentFilterInfoMSFT ELEMENT_FACTORY = XrSceneComponentParentFilterInfoMSFT.create(-1L);

        /**
         * Creates a new {@code XrSceneComponentParentFilterInfoMSFT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSceneComponentParentFilterInfoMSFT#SIZEOF}, and its mark will be undefined.
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
        protected XrSceneComponentParentFilterInfoMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSceneComponentParentFilterInfoMSFT#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSceneComponentParentFilterInfoMSFT.ntype(address()); }
        /** @return the value of the {@link XrSceneComponentParentFilterInfoMSFT#next} field. */
        @NativeType("void const *")
        public long next() { return XrSceneComponentParentFilterInfoMSFT.nnext(address()); }
        /** @return a {@link XrUuidMSFT} view of the {@link XrSceneComponentParentFilterInfoMSFT#parentId} field. */
        public XrUuidMSFT parentId() { return XrSceneComponentParentFilterInfoMSFT.nparentId(address()); }

        /** Sets the specified value to the {@link XrSceneComponentParentFilterInfoMSFT#type} field. */
        public XrSceneComponentParentFilterInfoMSFT.Buffer type(@NativeType("XrStructureType") int value) { XrSceneComponentParentFilterInfoMSFT.ntype(address(), value); return this; }
        /** Sets the {@link MSFTSceneUnderstanding#XR_TYPE_SCENE_COMPONENT_PARENT_FILTER_INFO_MSFT TYPE_SCENE_COMPONENT_PARENT_FILTER_INFO_MSFT} value to the {@link XrSceneComponentParentFilterInfoMSFT#type} field. */
        public XrSceneComponentParentFilterInfoMSFT.Buffer type$Default() { return type(MSFTSceneUnderstanding.XR_TYPE_SCENE_COMPONENT_PARENT_FILTER_INFO_MSFT); }
        /** Sets the specified value to the {@link XrSceneComponentParentFilterInfoMSFT#next} field. */
        public XrSceneComponentParentFilterInfoMSFT.Buffer next(@NativeType("void const *") long value) { XrSceneComponentParentFilterInfoMSFT.nnext(address(), value); return this; }
        /** Copies the specified {@link XrUuidMSFT} to the {@link XrSceneComponentParentFilterInfoMSFT#parentId} field. */
        public XrSceneComponentParentFilterInfoMSFT.Buffer parentId(XrUuidMSFT value) { XrSceneComponentParentFilterInfoMSFT.nparentId(address(), value); return this; }
        /** Passes the {@link XrSceneComponentParentFilterInfoMSFT#parentId} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrSceneComponentParentFilterInfoMSFT.Buffer parentId(java.util.function.Consumer<XrUuidMSFT> consumer) { consumer.accept(parentId()); return this; }

    }

}