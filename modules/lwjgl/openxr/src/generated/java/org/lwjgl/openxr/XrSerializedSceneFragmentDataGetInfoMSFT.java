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
 * The information to get the serialized scene fragment data.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link MSFTSceneUnderstandingSerialization XR_MSFT_scene_understanding_serialization} extension <b>must</b> be enabled prior to using {@link XrSerializedSceneFragmentDataGetInfoMSFT}</li>
 * <li>{@code type} <b>must</b> be {@link MSFTSceneUnderstandingSerialization#XR_TYPE_SERIALIZED_SCENE_FRAGMENT_DATA_GET_INFO_MSFT TYPE_SERIALIZED_SCENE_FRAGMENT_DATA_GET_INFO_MSFT}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrUuidMSFT}, {@link MSFTSceneUnderstandingSerialization#xrGetSerializedSceneFragmentDataMSFT GetSerializedSceneFragmentDataMSFT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSerializedSceneFragmentDataGetInfoMSFT {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     {@link XrUuidMSFT XrUuidMSFT} {@link #sceneFragmentId};
 * }</code></pre>
 */
public class XrSerializedSceneFragmentDataGetInfoMSFT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SCENEFRAGMENTID;

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
        SCENEFRAGMENTID = layout.offsetof(2);
    }

    /**
     * Creates a {@code XrSerializedSceneFragmentDataGetInfoMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSerializedSceneFragmentDataGetInfoMSFT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** the {@link XrUuidMSFT} of the serialized scene fragment that was previously read from {@link MSFTSceneUnderstanding#xrGetSceneComponentsMSFT GetSceneComponentsMSFT} with {@link MSFTSceneUnderstandingSerialization#XR_SCENE_COMPONENT_TYPE_SERIALIZED_SCENE_FRAGMENT_MSFT SCENE_COMPONENT_TYPE_SERIALIZED_SCENE_FRAGMENT_MSFT}. */
    public XrUuidMSFT sceneFragmentId() { return nsceneFragmentId(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrSerializedSceneFragmentDataGetInfoMSFT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MSFTSceneUnderstandingSerialization#XR_TYPE_SERIALIZED_SCENE_FRAGMENT_DATA_GET_INFO_MSFT TYPE_SERIALIZED_SCENE_FRAGMENT_DATA_GET_INFO_MSFT} value to the {@link #type} field. */
    public XrSerializedSceneFragmentDataGetInfoMSFT type$Default() { return type(MSFTSceneUnderstandingSerialization.XR_TYPE_SERIALIZED_SCENE_FRAGMENT_DATA_GET_INFO_MSFT); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSerializedSceneFragmentDataGetInfoMSFT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Copies the specified {@link XrUuidMSFT} to the {@link #sceneFragmentId} field. */
    public XrSerializedSceneFragmentDataGetInfoMSFT sceneFragmentId(XrUuidMSFT value) { nsceneFragmentId(address(), value); return this; }
    /** Passes the {@link #sceneFragmentId} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrSerializedSceneFragmentDataGetInfoMSFT sceneFragmentId(java.util.function.Consumer<XrUuidMSFT> consumer) { consumer.accept(sceneFragmentId()); return this; }

    /** Initializes this struct with the specified values. */
    public XrSerializedSceneFragmentDataGetInfoMSFT set(
        int type,
        long next,
        XrUuidMSFT sceneFragmentId
    ) {
        type(type);
        next(next);
        sceneFragmentId(sceneFragmentId);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSerializedSceneFragmentDataGetInfoMSFT set(XrSerializedSceneFragmentDataGetInfoMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSerializedSceneFragmentDataGetInfoMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSerializedSceneFragmentDataGetInfoMSFT malloc() {
        return wrap(XrSerializedSceneFragmentDataGetInfoMSFT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrSerializedSceneFragmentDataGetInfoMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSerializedSceneFragmentDataGetInfoMSFT calloc() {
        return wrap(XrSerializedSceneFragmentDataGetInfoMSFT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrSerializedSceneFragmentDataGetInfoMSFT} instance allocated with {@link BufferUtils}. */
    public static XrSerializedSceneFragmentDataGetInfoMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrSerializedSceneFragmentDataGetInfoMSFT.class, memAddress(container), container);
    }

    /** Returns a new {@code XrSerializedSceneFragmentDataGetInfoMSFT} instance for the specified memory address. */
    public static XrSerializedSceneFragmentDataGetInfoMSFT create(long address) {
        return wrap(XrSerializedSceneFragmentDataGetInfoMSFT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSerializedSceneFragmentDataGetInfoMSFT createSafe(long address) {
        return address == NULL ? null : wrap(XrSerializedSceneFragmentDataGetInfoMSFT.class, address);
    }

    /**
     * Returns a new {@link XrSerializedSceneFragmentDataGetInfoMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSerializedSceneFragmentDataGetInfoMSFT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSerializedSceneFragmentDataGetInfoMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSerializedSceneFragmentDataGetInfoMSFT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSerializedSceneFragmentDataGetInfoMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSerializedSceneFragmentDataGetInfoMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrSerializedSceneFragmentDataGetInfoMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSerializedSceneFragmentDataGetInfoMSFT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSerializedSceneFragmentDataGetInfoMSFT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrSerializedSceneFragmentDataGetInfoMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSerializedSceneFragmentDataGetInfoMSFT malloc(MemoryStack stack) {
        return wrap(XrSerializedSceneFragmentDataGetInfoMSFT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrSerializedSceneFragmentDataGetInfoMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSerializedSceneFragmentDataGetInfoMSFT calloc(MemoryStack stack) {
        return wrap(XrSerializedSceneFragmentDataGetInfoMSFT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrSerializedSceneFragmentDataGetInfoMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSerializedSceneFragmentDataGetInfoMSFT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSerializedSceneFragmentDataGetInfoMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSerializedSceneFragmentDataGetInfoMSFT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSerializedSceneFragmentDataGetInfoMSFT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSerializedSceneFragmentDataGetInfoMSFT.NEXT); }
    /** Unsafe version of {@link #sceneFragmentId}. */
    public static XrUuidMSFT nsceneFragmentId(long struct) { return XrUuidMSFT.create(struct + XrSerializedSceneFragmentDataGetInfoMSFT.SCENEFRAGMENTID); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSerializedSceneFragmentDataGetInfoMSFT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSerializedSceneFragmentDataGetInfoMSFT.NEXT, value); }
    /** Unsafe version of {@link #sceneFragmentId(XrUuidMSFT) sceneFragmentId}. */
    public static void nsceneFragmentId(long struct, XrUuidMSFT value) { memCopy(value.address(), struct + XrSerializedSceneFragmentDataGetInfoMSFT.SCENEFRAGMENTID, XrUuidMSFT.SIZEOF); }

    // -----------------------------------

    /** An array of {@link XrSerializedSceneFragmentDataGetInfoMSFT} structs. */
    public static class Buffer extends StructBuffer<XrSerializedSceneFragmentDataGetInfoMSFT, Buffer> implements NativeResource {

        private static final XrSerializedSceneFragmentDataGetInfoMSFT ELEMENT_FACTORY = XrSerializedSceneFragmentDataGetInfoMSFT.create(-1L);

        /**
         * Creates a new {@code XrSerializedSceneFragmentDataGetInfoMSFT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSerializedSceneFragmentDataGetInfoMSFT#SIZEOF}, and its mark will be undefined.
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
        protected XrSerializedSceneFragmentDataGetInfoMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSerializedSceneFragmentDataGetInfoMSFT#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSerializedSceneFragmentDataGetInfoMSFT.ntype(address()); }
        /** @return the value of the {@link XrSerializedSceneFragmentDataGetInfoMSFT#next} field. */
        @NativeType("void const *")
        public long next() { return XrSerializedSceneFragmentDataGetInfoMSFT.nnext(address()); }
        /** @return a {@link XrUuidMSFT} view of the {@link XrSerializedSceneFragmentDataGetInfoMSFT#sceneFragmentId} field. */
        public XrUuidMSFT sceneFragmentId() { return XrSerializedSceneFragmentDataGetInfoMSFT.nsceneFragmentId(address()); }

        /** Sets the specified value to the {@link XrSerializedSceneFragmentDataGetInfoMSFT#type} field. */
        public XrSerializedSceneFragmentDataGetInfoMSFT.Buffer type(@NativeType("XrStructureType") int value) { XrSerializedSceneFragmentDataGetInfoMSFT.ntype(address(), value); return this; }
        /** Sets the {@link MSFTSceneUnderstandingSerialization#XR_TYPE_SERIALIZED_SCENE_FRAGMENT_DATA_GET_INFO_MSFT TYPE_SERIALIZED_SCENE_FRAGMENT_DATA_GET_INFO_MSFT} value to the {@link XrSerializedSceneFragmentDataGetInfoMSFT#type} field. */
        public XrSerializedSceneFragmentDataGetInfoMSFT.Buffer type$Default() { return type(MSFTSceneUnderstandingSerialization.XR_TYPE_SERIALIZED_SCENE_FRAGMENT_DATA_GET_INFO_MSFT); }
        /** Sets the specified value to the {@link XrSerializedSceneFragmentDataGetInfoMSFT#next} field. */
        public XrSerializedSceneFragmentDataGetInfoMSFT.Buffer next(@NativeType("void const *") long value) { XrSerializedSceneFragmentDataGetInfoMSFT.nnext(address(), value); return this; }
        /** Copies the specified {@link XrUuidMSFT} to the {@link XrSerializedSceneFragmentDataGetInfoMSFT#sceneFragmentId} field. */
        public XrSerializedSceneFragmentDataGetInfoMSFT.Buffer sceneFragmentId(XrUuidMSFT value) { XrSerializedSceneFragmentDataGetInfoMSFT.nsceneFragmentId(address(), value); return this; }
        /** Passes the {@link XrSerializedSceneFragmentDataGetInfoMSFT#sceneFragmentId} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrSerializedSceneFragmentDataGetInfoMSFT.Buffer sceneFragmentId(java.util.function.Consumer<XrUuidMSFT> consumer) { consumer.accept(sceneFragmentId()); return this; }

    }

}