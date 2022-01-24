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
 * The information to deserialize a binary scene.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the scene fragments are not in the same order as returned by {@link MSFTSceneUnderstanding#xrGetSceneComponentsMSFT GetSceneComponentsMSFT} or the runtime failed to deserialized the binary data then {@link MSFTSceneUnderstanding#xrGetSceneComputeStateMSFT GetSceneComputeStateMSFT} <b>must</b> return {@link MSFTSceneUnderstanding#XR_SCENE_COMPUTE_STATE_COMPLETED_WITH_ERROR_MSFT SCENE_COMPUTE_STATE_COMPLETED_WITH_ERROR_MSFT}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link MSFTSceneUnderstandingSerialization XR_MSFT_scene_understanding_serialization} extension <b>must</b> be enabled prior to using {@link XrSceneDeserializeInfoMSFT}</li>
 * <li>{@code type} <b>must</b> be {@link MSFTSceneUnderstandingSerialization#XR_TYPE_SCENE_DESERIALIZE_INFO_MSFT TYPE_SCENE_DESERIALIZE_INFO_MSFT}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>If {@code fragmentCount} is not 0, {@code fragments} <b>must</b> be a pointer to an array of {@code fragmentCount} valid {@link XrDeserializeSceneFragmentMSFT} structures</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrDeserializeSceneFragmentMSFT}, {@link MSFTSceneUnderstandingSerialization#xrDeserializeSceneMSFT DeserializeSceneMSFT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSceneDeserializeInfoMSFT {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     uint32_t {@link #fragmentCount};
 *     {@link XrDeserializeSceneFragmentMSFT XrDeserializeSceneFragmentMSFT} const * {@link #fragments};
 * }</code></pre>
 */
public class XrSceneDeserializeInfoMSFT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        FRAGMENTCOUNT,
        FRAGMENTS;

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
        FRAGMENTCOUNT = layout.offsetof(2);
        FRAGMENTS = layout.offsetof(3);
    }

    /**
     * Creates a {@code XrSceneDeserializeInfoMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSceneDeserializeInfoMSFT(ByteBuffer container) {
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
    /** the count of {@link XrDeserializeSceneFragmentMSFT} structures in the {@code fragments} array. */
    @NativeType("uint32_t")
    public int fragmentCount() { return nfragmentCount(address()); }
    /** an array of {@link XrDeserializeSceneFragmentMSFT}. */
    @Nullable
    @NativeType("XrDeserializeSceneFragmentMSFT const *")
    public XrDeserializeSceneFragmentMSFT.Buffer fragments() { return nfragments(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrSceneDeserializeInfoMSFT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MSFTSceneUnderstandingSerialization#XR_TYPE_SCENE_DESERIALIZE_INFO_MSFT TYPE_SCENE_DESERIALIZE_INFO_MSFT} value to the {@link #type} field. */
    public XrSceneDeserializeInfoMSFT type$Default() { return type(MSFTSceneUnderstandingSerialization.XR_TYPE_SCENE_DESERIALIZE_INFO_MSFT); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSceneDeserializeInfoMSFT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #fragmentCount} field. */
    public XrSceneDeserializeInfoMSFT fragmentCount(@NativeType("uint32_t") int value) { nfragmentCount(address(), value); return this; }
    /** Sets the address of the specified {@link XrDeserializeSceneFragmentMSFT.Buffer} to the {@link #fragments} field. */
    public XrSceneDeserializeInfoMSFT fragments(@Nullable @NativeType("XrDeserializeSceneFragmentMSFT const *") XrDeserializeSceneFragmentMSFT.Buffer value) { nfragments(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSceneDeserializeInfoMSFT set(
        int type,
        long next,
        int fragmentCount,
        @Nullable XrDeserializeSceneFragmentMSFT.Buffer fragments
    ) {
        type(type);
        next(next);
        fragmentCount(fragmentCount);
        fragments(fragments);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSceneDeserializeInfoMSFT set(XrSceneDeserializeInfoMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSceneDeserializeInfoMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSceneDeserializeInfoMSFT malloc() {
        return wrap(XrSceneDeserializeInfoMSFT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrSceneDeserializeInfoMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSceneDeserializeInfoMSFT calloc() {
        return wrap(XrSceneDeserializeInfoMSFT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrSceneDeserializeInfoMSFT} instance allocated with {@link BufferUtils}. */
    public static XrSceneDeserializeInfoMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrSceneDeserializeInfoMSFT.class, memAddress(container), container);
    }

    /** Returns a new {@code XrSceneDeserializeInfoMSFT} instance for the specified memory address. */
    public static XrSceneDeserializeInfoMSFT create(long address) {
        return wrap(XrSceneDeserializeInfoMSFT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSceneDeserializeInfoMSFT createSafe(long address) {
        return address == NULL ? null : wrap(XrSceneDeserializeInfoMSFT.class, address);
    }

    /**
     * Returns a new {@link XrSceneDeserializeInfoMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneDeserializeInfoMSFT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSceneDeserializeInfoMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneDeserializeInfoMSFT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSceneDeserializeInfoMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneDeserializeInfoMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrSceneDeserializeInfoMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSceneDeserializeInfoMSFT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSceneDeserializeInfoMSFT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrSceneDeserializeInfoMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSceneDeserializeInfoMSFT malloc(MemoryStack stack) {
        return wrap(XrSceneDeserializeInfoMSFT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrSceneDeserializeInfoMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSceneDeserializeInfoMSFT calloc(MemoryStack stack) {
        return wrap(XrSceneDeserializeInfoMSFT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrSceneDeserializeInfoMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSceneDeserializeInfoMSFT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSceneDeserializeInfoMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSceneDeserializeInfoMSFT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSceneDeserializeInfoMSFT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSceneDeserializeInfoMSFT.NEXT); }
    /** Unsafe version of {@link #fragmentCount}. */
    public static int nfragmentCount(long struct) { return UNSAFE.getInt(null, struct + XrSceneDeserializeInfoMSFT.FRAGMENTCOUNT); }
    /** Unsafe version of {@link #fragments}. */
    @Nullable public static XrDeserializeSceneFragmentMSFT.Buffer nfragments(long struct) { return XrDeserializeSceneFragmentMSFT.createSafe(memGetAddress(struct + XrSceneDeserializeInfoMSFT.FRAGMENTS), nfragmentCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSceneDeserializeInfoMSFT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSceneDeserializeInfoMSFT.NEXT, value); }
    /** Sets the specified value to the {@code fragmentCount} field of the specified {@code struct}. */
    public static void nfragmentCount(long struct, int value) { UNSAFE.putInt(null, struct + XrSceneDeserializeInfoMSFT.FRAGMENTCOUNT, value); }
    /** Unsafe version of {@link #fragments(XrDeserializeSceneFragmentMSFT.Buffer) fragments}. */
    public static void nfragments(long struct, @Nullable XrDeserializeSceneFragmentMSFT.Buffer value) { memPutAddress(struct + XrSceneDeserializeInfoMSFT.FRAGMENTS, memAddressSafe(value)); if (value != null) { nfragmentCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link XrSceneDeserializeInfoMSFT} structs. */
    public static class Buffer extends StructBuffer<XrSceneDeserializeInfoMSFT, Buffer> implements NativeResource {

        private static final XrSceneDeserializeInfoMSFT ELEMENT_FACTORY = XrSceneDeserializeInfoMSFT.create(-1L);

        /**
         * Creates a new {@code XrSceneDeserializeInfoMSFT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSceneDeserializeInfoMSFT#SIZEOF}, and its mark will be undefined.
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
        protected XrSceneDeserializeInfoMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSceneDeserializeInfoMSFT#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSceneDeserializeInfoMSFT.ntype(address()); }
        /** @return the value of the {@link XrSceneDeserializeInfoMSFT#next} field. */
        @NativeType("void const *")
        public long next() { return XrSceneDeserializeInfoMSFT.nnext(address()); }
        /** @return the value of the {@link XrSceneDeserializeInfoMSFT#fragmentCount} field. */
        @NativeType("uint32_t")
        public int fragmentCount() { return XrSceneDeserializeInfoMSFT.nfragmentCount(address()); }
        /** @return a {@link XrDeserializeSceneFragmentMSFT.Buffer} view of the struct array pointed to by the {@link XrSceneDeserializeInfoMSFT#fragments} field. */
        @Nullable
        @NativeType("XrDeserializeSceneFragmentMSFT const *")
        public XrDeserializeSceneFragmentMSFT.Buffer fragments() { return XrSceneDeserializeInfoMSFT.nfragments(address()); }

        /** Sets the specified value to the {@link XrSceneDeserializeInfoMSFT#type} field. */
        public XrSceneDeserializeInfoMSFT.Buffer type(@NativeType("XrStructureType") int value) { XrSceneDeserializeInfoMSFT.ntype(address(), value); return this; }
        /** Sets the {@link MSFTSceneUnderstandingSerialization#XR_TYPE_SCENE_DESERIALIZE_INFO_MSFT TYPE_SCENE_DESERIALIZE_INFO_MSFT} value to the {@link XrSceneDeserializeInfoMSFT#type} field. */
        public XrSceneDeserializeInfoMSFT.Buffer type$Default() { return type(MSFTSceneUnderstandingSerialization.XR_TYPE_SCENE_DESERIALIZE_INFO_MSFT); }
        /** Sets the specified value to the {@link XrSceneDeserializeInfoMSFT#next} field. */
        public XrSceneDeserializeInfoMSFT.Buffer next(@NativeType("void const *") long value) { XrSceneDeserializeInfoMSFT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrSceneDeserializeInfoMSFT#fragmentCount} field. */
        public XrSceneDeserializeInfoMSFT.Buffer fragmentCount(@NativeType("uint32_t") int value) { XrSceneDeserializeInfoMSFT.nfragmentCount(address(), value); return this; }
        /** Sets the address of the specified {@link XrDeserializeSceneFragmentMSFT.Buffer} to the {@link XrSceneDeserializeInfoMSFT#fragments} field. */
        public XrSceneDeserializeInfoMSFT.Buffer fragments(@Nullable @NativeType("XrDeserializeSceneFragmentMSFT const *") XrDeserializeSceneFragmentMSFT.Buffer value) { XrSceneDeserializeInfoMSFT.nfragments(address(), value); return this; }

    }

}