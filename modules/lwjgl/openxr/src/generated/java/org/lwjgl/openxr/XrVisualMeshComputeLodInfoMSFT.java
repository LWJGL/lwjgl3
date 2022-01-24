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
 * Visual mesh compute level of detail info.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension <b>must</b> be enabled prior to using {@link XrVisualMeshComputeLodInfoMSFT}</li>
 * <li>{@code type} <b>must</b> be {@link MSFTSceneUnderstanding#XR_TYPE_VISUAL_MESH_COMPUTE_LOD_INFO_MSFT TYPE_VISUAL_MESH_COMPUTE_LOD_INFO_MSFT}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code lod} <b>must</b> be a valid {@code XrMeshComputeLodMSFT} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrNewSceneComputeInfoMSFT}, {@link MSFTSceneUnderstanding#xrComputeNewSceneMSFT ComputeNewSceneMSFT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrVisualMeshComputeLodInfoMSFT {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrMeshComputeLodMSFT {@link #lod};
 * }</code></pre>
 */
public class XrVisualMeshComputeLodInfoMSFT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        LOD;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        LOD = layout.offsetof(2);
    }

    /**
     * Creates a {@code XrVisualMeshComputeLodInfoMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrVisualMeshComputeLodInfoMSFT(ByteBuffer container) {
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
    /** the requested mesh level of detail specified by {@code XrMeshComputeLodMSFT}. */
    @NativeType("XrMeshComputeLodMSFT")
    public int lod() { return nlod(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrVisualMeshComputeLodInfoMSFT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MSFTSceneUnderstanding#XR_TYPE_VISUAL_MESH_COMPUTE_LOD_INFO_MSFT TYPE_VISUAL_MESH_COMPUTE_LOD_INFO_MSFT} value to the {@link #type} field. */
    public XrVisualMeshComputeLodInfoMSFT type$Default() { return type(MSFTSceneUnderstanding.XR_TYPE_VISUAL_MESH_COMPUTE_LOD_INFO_MSFT); }
    /** Sets the specified value to the {@link #next} field. */
    public XrVisualMeshComputeLodInfoMSFT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #lod} field. */
    public XrVisualMeshComputeLodInfoMSFT lod(@NativeType("XrMeshComputeLodMSFT") int value) { nlod(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrVisualMeshComputeLodInfoMSFT set(
        int type,
        long next,
        int lod
    ) {
        type(type);
        next(next);
        lod(lod);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrVisualMeshComputeLodInfoMSFT set(XrVisualMeshComputeLodInfoMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrVisualMeshComputeLodInfoMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrVisualMeshComputeLodInfoMSFT malloc() {
        return wrap(XrVisualMeshComputeLodInfoMSFT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrVisualMeshComputeLodInfoMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrVisualMeshComputeLodInfoMSFT calloc() {
        return wrap(XrVisualMeshComputeLodInfoMSFT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrVisualMeshComputeLodInfoMSFT} instance allocated with {@link BufferUtils}. */
    public static XrVisualMeshComputeLodInfoMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrVisualMeshComputeLodInfoMSFT.class, memAddress(container), container);
    }

    /** Returns a new {@code XrVisualMeshComputeLodInfoMSFT} instance for the specified memory address. */
    public static XrVisualMeshComputeLodInfoMSFT create(long address) {
        return wrap(XrVisualMeshComputeLodInfoMSFT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrVisualMeshComputeLodInfoMSFT createSafe(long address) {
        return address == NULL ? null : wrap(XrVisualMeshComputeLodInfoMSFT.class, address);
    }

    /**
     * Returns a new {@link XrVisualMeshComputeLodInfoMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrVisualMeshComputeLodInfoMSFT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrVisualMeshComputeLodInfoMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrVisualMeshComputeLodInfoMSFT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrVisualMeshComputeLodInfoMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrVisualMeshComputeLodInfoMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrVisualMeshComputeLodInfoMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrVisualMeshComputeLodInfoMSFT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrVisualMeshComputeLodInfoMSFT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrVisualMeshComputeLodInfoMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrVisualMeshComputeLodInfoMSFT malloc(MemoryStack stack) {
        return wrap(XrVisualMeshComputeLodInfoMSFT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrVisualMeshComputeLodInfoMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrVisualMeshComputeLodInfoMSFT calloc(MemoryStack stack) {
        return wrap(XrVisualMeshComputeLodInfoMSFT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrVisualMeshComputeLodInfoMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrVisualMeshComputeLodInfoMSFT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrVisualMeshComputeLodInfoMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrVisualMeshComputeLodInfoMSFT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrVisualMeshComputeLodInfoMSFT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrVisualMeshComputeLodInfoMSFT.NEXT); }
    /** Unsafe version of {@link #lod}. */
    public static int nlod(long struct) { return UNSAFE.getInt(null, struct + XrVisualMeshComputeLodInfoMSFT.LOD); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrVisualMeshComputeLodInfoMSFT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrVisualMeshComputeLodInfoMSFT.NEXT, value); }
    /** Unsafe version of {@link #lod(int) lod}. */
    public static void nlod(long struct, int value) { UNSAFE.putInt(null, struct + XrVisualMeshComputeLodInfoMSFT.LOD, value); }

    // -----------------------------------

    /** An array of {@link XrVisualMeshComputeLodInfoMSFT} structs. */
    public static class Buffer extends StructBuffer<XrVisualMeshComputeLodInfoMSFT, Buffer> implements NativeResource {

        private static final XrVisualMeshComputeLodInfoMSFT ELEMENT_FACTORY = XrVisualMeshComputeLodInfoMSFT.create(-1L);

        /**
         * Creates a new {@code XrVisualMeshComputeLodInfoMSFT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrVisualMeshComputeLodInfoMSFT#SIZEOF}, and its mark will be undefined.
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
        protected XrVisualMeshComputeLodInfoMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrVisualMeshComputeLodInfoMSFT#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrVisualMeshComputeLodInfoMSFT.ntype(address()); }
        /** @return the value of the {@link XrVisualMeshComputeLodInfoMSFT#next} field. */
        @NativeType("void const *")
        public long next() { return XrVisualMeshComputeLodInfoMSFT.nnext(address()); }
        /** @return the value of the {@link XrVisualMeshComputeLodInfoMSFT#lod} field. */
        @NativeType("XrMeshComputeLodMSFT")
        public int lod() { return XrVisualMeshComputeLodInfoMSFT.nlod(address()); }

        /** Sets the specified value to the {@link XrVisualMeshComputeLodInfoMSFT#type} field. */
        public XrVisualMeshComputeLodInfoMSFT.Buffer type(@NativeType("XrStructureType") int value) { XrVisualMeshComputeLodInfoMSFT.ntype(address(), value); return this; }
        /** Sets the {@link MSFTSceneUnderstanding#XR_TYPE_VISUAL_MESH_COMPUTE_LOD_INFO_MSFT TYPE_VISUAL_MESH_COMPUTE_LOD_INFO_MSFT} value to the {@link XrVisualMeshComputeLodInfoMSFT#type} field. */
        public XrVisualMeshComputeLodInfoMSFT.Buffer type$Default() { return type(MSFTSceneUnderstanding.XR_TYPE_VISUAL_MESH_COMPUTE_LOD_INFO_MSFT); }
        /** Sets the specified value to the {@link XrVisualMeshComputeLodInfoMSFT#next} field. */
        public XrVisualMeshComputeLodInfoMSFT.Buffer next(@NativeType("void const *") long value) { XrVisualMeshComputeLodInfoMSFT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrVisualMeshComputeLodInfoMSFT#lod} field. */
        public XrVisualMeshComputeLodInfoMSFT.Buffer lod(@NativeType("XrMeshComputeLodMSFT") int value) { XrVisualMeshComputeLodInfoMSFT.nlod(address(), value); return this; }

    }

}