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
 * Block Request Info.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link MLWorldMeshDetection XR_ML_world_mesh_detection} extension <b>must</b> be enabled prior to using {@link XrWorldMeshGetInfoML}</li>
 * <li>{@code type} <b>must</b> be {@link MLWorldMeshDetection#XR_TYPE_WORLD_MESH_GET_INFO_ML TYPE_WORLD_MESH_GET_INFO_ML}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code flags} <b>must</b> be 0 or a valid combination of {@code XrWorldMeshDetectorFlagBitsML} values</li>
 * <li>{@code blocks} <b>must</b> be a pointer to an array of {@code blockCount} {@link XrWorldMeshBlockRequestML} structures</li>
 * <li>The {@code blockCount} parameter <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrWorldMeshBlockRequestML}, {@link MLWorldMeshDetection#xrRequestWorldMeshAsyncML RequestWorldMeshAsyncML}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrWorldMeshGetInfoML {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrWorldMeshDetectorFlagsML {@link #flags};
 *     float {@link #fillHoleLength};
 *     float {@link #disconnectedComponentArea};
 *     uint32_t {@link #blockCount};
 *     {@link XrWorldMeshBlockRequestML XrWorldMeshBlockRequestML} * {@link #blocks};
 * }</code></pre>
 */
public class XrWorldMeshGetInfoML extends Struct<XrWorldMeshGetInfoML> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        FLAGS,
        FILLHOLELENGTH,
        DISCONNECTEDCOMPONENTAREA,
        BLOCKCOUNT,
        BLOCKS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        FILLHOLELENGTH = layout.offsetof(3);
        DISCONNECTEDCOMPONENTAREA = layout.offsetof(4);
        BLOCKCOUNT = layout.offsetof(5);
        BLOCKS = layout.offsetof(6);
    }

    protected XrWorldMeshGetInfoML(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrWorldMeshGetInfoML create(long address, @Nullable ByteBuffer container) {
        return new XrWorldMeshGetInfoML(address, container);
    }

    /**
     * Creates a {@code XrWorldMeshGetInfoML} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrWorldMeshGetInfoML(ByteBuffer container) {
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
    /** are the detector flags defined by {@code XrWorldMeshDetectorFlagBitsML}. */
    @NativeType("XrWorldMeshDetectorFlagsML")
    public long flags() { return nflags(address()); }
    /** Any hole which has perimeter (in meters) less than {@code fillHoleLength} will be filled. The maximum hole perimeter is limited to 5 meters, the runtime <b>must</b> clamp the value between 0 and 5 meters. Also the maximum area of the hole <b>should</b> not exceed 0.5 square meters. If the hole overlaps with neighboring mesh block(s), it will not be filled in. */
    public float fillHoleLength() { return nfillHoleLength(address()); }
    /** Any component that is disconnected from the main mesh which has an area (in square meters) less than {@code disconnectedComponentArea} will be removed. The maximum area is limited to 2 square meters, and the area needs to exist fully within a mesh block boundary without skirt. The runtime <b>must</b> clamp this value between 0 and 2 square meters. */
    public float disconnectedComponentArea() { return ndisconnectedComponentArea(address()); }
    /** a {@code uint32_t} indicating the number of elements in the {@code blocks} array. */
    @NativeType("uint32_t")
    public int blockCount() { return nblockCount(address()); }
    /** an array of {@link XrWorldMeshBlockRequestML}. */
    @NativeType("XrWorldMeshBlockRequestML *")
    public XrWorldMeshBlockRequestML.Buffer blocks() { return nblocks(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrWorldMeshGetInfoML type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MLWorldMeshDetection#XR_TYPE_WORLD_MESH_GET_INFO_ML TYPE_WORLD_MESH_GET_INFO_ML} value to the {@link #type} field. */
    public XrWorldMeshGetInfoML type$Default() { return type(MLWorldMeshDetection.XR_TYPE_WORLD_MESH_GET_INFO_ML); }
    /** Sets the specified value to the {@link #next} field. */
    public XrWorldMeshGetInfoML next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public XrWorldMeshGetInfoML flags(@NativeType("XrWorldMeshDetectorFlagsML") long value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #fillHoleLength} field. */
    public XrWorldMeshGetInfoML fillHoleLength(float value) { nfillHoleLength(address(), value); return this; }
    /** Sets the specified value to the {@link #disconnectedComponentArea} field. */
    public XrWorldMeshGetInfoML disconnectedComponentArea(float value) { ndisconnectedComponentArea(address(), value); return this; }
    /** Sets the address of the specified {@link XrWorldMeshBlockRequestML.Buffer} to the {@link #blocks} field. */
    public XrWorldMeshGetInfoML blocks(@NativeType("XrWorldMeshBlockRequestML *") XrWorldMeshBlockRequestML.Buffer value) { nblocks(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrWorldMeshGetInfoML set(
        int type,
        long next,
        long flags,
        float fillHoleLength,
        float disconnectedComponentArea,
        XrWorldMeshBlockRequestML.Buffer blocks
    ) {
        type(type);
        next(next);
        flags(flags);
        fillHoleLength(fillHoleLength);
        disconnectedComponentArea(disconnectedComponentArea);
        blocks(blocks);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrWorldMeshGetInfoML set(XrWorldMeshGetInfoML src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrWorldMeshGetInfoML} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrWorldMeshGetInfoML malloc() {
        return new XrWorldMeshGetInfoML(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrWorldMeshGetInfoML} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrWorldMeshGetInfoML calloc() {
        return new XrWorldMeshGetInfoML(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrWorldMeshGetInfoML} instance allocated with {@link BufferUtils}. */
    public static XrWorldMeshGetInfoML create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrWorldMeshGetInfoML(memAddress(container), container);
    }

    /** Returns a new {@code XrWorldMeshGetInfoML} instance for the specified memory address. */
    public static XrWorldMeshGetInfoML create(long address) {
        return new XrWorldMeshGetInfoML(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrWorldMeshGetInfoML createSafe(long address) {
        return address == NULL ? null : new XrWorldMeshGetInfoML(address, null);
    }

    /**
     * Returns a new {@link XrWorldMeshGetInfoML.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshGetInfoML.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrWorldMeshGetInfoML.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshGetInfoML.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrWorldMeshGetInfoML.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshGetInfoML.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrWorldMeshGetInfoML.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshGetInfoML.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrWorldMeshGetInfoML.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrWorldMeshGetInfoML} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrWorldMeshGetInfoML malloc(MemoryStack stack) {
        return new XrWorldMeshGetInfoML(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrWorldMeshGetInfoML} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrWorldMeshGetInfoML calloc(MemoryStack stack) {
        return new XrWorldMeshGetInfoML(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrWorldMeshGetInfoML.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshGetInfoML.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrWorldMeshGetInfoML.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshGetInfoML.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrWorldMeshGetInfoML.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrWorldMeshGetInfoML.NEXT); }
    /** Unsafe version of {@link #flags}. */
    public static long nflags(long struct) { return memGetLong(struct + XrWorldMeshGetInfoML.FLAGS); }
    /** Unsafe version of {@link #fillHoleLength}. */
    public static float nfillHoleLength(long struct) { return memGetFloat(struct + XrWorldMeshGetInfoML.FILLHOLELENGTH); }
    /** Unsafe version of {@link #disconnectedComponentArea}. */
    public static float ndisconnectedComponentArea(long struct) { return memGetFloat(struct + XrWorldMeshGetInfoML.DISCONNECTEDCOMPONENTAREA); }
    /** Unsafe version of {@link #blockCount}. */
    public static int nblockCount(long struct) { return memGetInt(struct + XrWorldMeshGetInfoML.BLOCKCOUNT); }
    /** Unsafe version of {@link #blocks}. */
    public static XrWorldMeshBlockRequestML.Buffer nblocks(long struct) { return XrWorldMeshBlockRequestML.create(memGetAddress(struct + XrWorldMeshGetInfoML.BLOCKS), nblockCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrWorldMeshGetInfoML.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrWorldMeshGetInfoML.NEXT, value); }
    /** Unsafe version of {@link #flags(long) flags}. */
    public static void nflags(long struct, long value) { memPutLong(struct + XrWorldMeshGetInfoML.FLAGS, value); }
    /** Unsafe version of {@link #fillHoleLength(float) fillHoleLength}. */
    public static void nfillHoleLength(long struct, float value) { memPutFloat(struct + XrWorldMeshGetInfoML.FILLHOLELENGTH, value); }
    /** Unsafe version of {@link #disconnectedComponentArea(float) disconnectedComponentArea}. */
    public static void ndisconnectedComponentArea(long struct, float value) { memPutFloat(struct + XrWorldMeshGetInfoML.DISCONNECTEDCOMPONENTAREA, value); }
    /** Sets the specified value to the {@code blockCount} field of the specified {@code struct}. */
    public static void nblockCount(long struct, int value) { memPutInt(struct + XrWorldMeshGetInfoML.BLOCKCOUNT, value); }
    /** Unsafe version of {@link #blocks(XrWorldMeshBlockRequestML.Buffer) blocks}. */
    public static void nblocks(long struct, XrWorldMeshBlockRequestML.Buffer value) { memPutAddress(struct + XrWorldMeshGetInfoML.BLOCKS, value.address()); nblockCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrWorldMeshGetInfoML.BLOCKS));
    }

    // -----------------------------------

    /** An array of {@link XrWorldMeshGetInfoML} structs. */
    public static class Buffer extends StructBuffer<XrWorldMeshGetInfoML, Buffer> implements NativeResource {

        private static final XrWorldMeshGetInfoML ELEMENT_FACTORY = XrWorldMeshGetInfoML.create(-1L);

        /**
         * Creates a new {@code XrWorldMeshGetInfoML.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrWorldMeshGetInfoML#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrWorldMeshGetInfoML getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrWorldMeshGetInfoML#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrWorldMeshGetInfoML.ntype(address()); }
        /** @return the value of the {@link XrWorldMeshGetInfoML#next} field. */
        @NativeType("void const *")
        public long next() { return XrWorldMeshGetInfoML.nnext(address()); }
        /** @return the value of the {@link XrWorldMeshGetInfoML#flags} field. */
        @NativeType("XrWorldMeshDetectorFlagsML")
        public long flags() { return XrWorldMeshGetInfoML.nflags(address()); }
        /** @return the value of the {@link XrWorldMeshGetInfoML#fillHoleLength} field. */
        public float fillHoleLength() { return XrWorldMeshGetInfoML.nfillHoleLength(address()); }
        /** @return the value of the {@link XrWorldMeshGetInfoML#disconnectedComponentArea} field. */
        public float disconnectedComponentArea() { return XrWorldMeshGetInfoML.ndisconnectedComponentArea(address()); }
        /** @return the value of the {@link XrWorldMeshGetInfoML#blockCount} field. */
        @NativeType("uint32_t")
        public int blockCount() { return XrWorldMeshGetInfoML.nblockCount(address()); }
        /** @return a {@link XrWorldMeshBlockRequestML.Buffer} view of the struct array pointed to by the {@link XrWorldMeshGetInfoML#blocks} field. */
        @NativeType("XrWorldMeshBlockRequestML *")
        public XrWorldMeshBlockRequestML.Buffer blocks() { return XrWorldMeshGetInfoML.nblocks(address()); }

        /** Sets the specified value to the {@link XrWorldMeshGetInfoML#type} field. */
        public XrWorldMeshGetInfoML.Buffer type(@NativeType("XrStructureType") int value) { XrWorldMeshGetInfoML.ntype(address(), value); return this; }
        /** Sets the {@link MLWorldMeshDetection#XR_TYPE_WORLD_MESH_GET_INFO_ML TYPE_WORLD_MESH_GET_INFO_ML} value to the {@link XrWorldMeshGetInfoML#type} field. */
        public XrWorldMeshGetInfoML.Buffer type$Default() { return type(MLWorldMeshDetection.XR_TYPE_WORLD_MESH_GET_INFO_ML); }
        /** Sets the specified value to the {@link XrWorldMeshGetInfoML#next} field. */
        public XrWorldMeshGetInfoML.Buffer next(@NativeType("void const *") long value) { XrWorldMeshGetInfoML.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrWorldMeshGetInfoML#flags} field. */
        public XrWorldMeshGetInfoML.Buffer flags(@NativeType("XrWorldMeshDetectorFlagsML") long value) { XrWorldMeshGetInfoML.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link XrWorldMeshGetInfoML#fillHoleLength} field. */
        public XrWorldMeshGetInfoML.Buffer fillHoleLength(float value) { XrWorldMeshGetInfoML.nfillHoleLength(address(), value); return this; }
        /** Sets the specified value to the {@link XrWorldMeshGetInfoML#disconnectedComponentArea} field. */
        public XrWorldMeshGetInfoML.Buffer disconnectedComponentArea(float value) { XrWorldMeshGetInfoML.ndisconnectedComponentArea(address(), value); return this; }
        /** Sets the address of the specified {@link XrWorldMeshBlockRequestML.Buffer} to the {@link XrWorldMeshGetInfoML#blocks} field. */
        public XrWorldMeshGetInfoML.Buffer blocks(@NativeType("XrWorldMeshBlockRequestML *") XrWorldMeshBlockRequestML.Buffer value) { XrWorldMeshGetInfoML.nblocks(address(), value); return this; }

    }

}