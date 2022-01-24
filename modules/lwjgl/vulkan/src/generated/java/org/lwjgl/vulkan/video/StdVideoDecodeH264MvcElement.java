/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.video;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import static org.lwjgl.vulkan.video.STDVulkanVideoCodecH264.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct StdVideoDecodeH264MvcElement {
 *     {@link StdVideoDecodeH264MvcElementFlags StdVideoDecodeH264MvcElementFlags} flags;
 *     uint16_t viewOrderIndex;
 *     uint16_t viewId;
 *     uint16_t {@link #temporalId};
 *     uint16_t {@link #priorityId};
 *     uint16_t numOfAnchorRefsInL0;
 *     uint16_t viewIdOfAnchorRefsInL0[STD_VIDEO_DECODE_H264_MVC_REF_LIST_SIZE];
 *     uint16_t numOfAnchorRefsInL1;
 *     uint16_t viewIdOfAnchorRefsInL1[STD_VIDEO_DECODE_H264_MVC_REF_LIST_SIZE];
 *     uint16_t numOfNonAnchorRefsInL0;
 *     uint16_t viewIdOfNonAnchorRefsInL0[STD_VIDEO_DECODE_H264_MVC_REF_LIST_SIZE];
 *     uint16_t numOfNonAnchorRefsInL1;
 *     uint16_t viewIdOfNonAnchorRefsInL1[STD_VIDEO_DECODE_H264_MVC_REF_LIST_SIZE];
 * }</code></pre>
 */
public class StdVideoDecodeH264MvcElement extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLAGS,
        VIEWORDERINDEX,
        VIEWID,
        TEMPORALID,
        PRIORITYID,
        NUMOFANCHORREFSINL0,
        VIEWIDOFANCHORREFSINL0,
        NUMOFANCHORREFSINL1,
        VIEWIDOFANCHORREFSINL1,
        NUMOFNONANCHORREFSINL0,
        VIEWIDOFNONANCHORREFSINL0,
        NUMOFNONANCHORREFSINL1,
        VIEWIDOFNONANCHORREFSINL1;

    static {
        Layout layout = __struct(
            __member(StdVideoDecodeH264MvcElementFlags.SIZEOF, StdVideoDecodeH264MvcElementFlags.ALIGNOF),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __array(2, STD_VIDEO_DECODE_H264_MVC_REF_LIST_SIZE),
            __member(2),
            __array(2, STD_VIDEO_DECODE_H264_MVC_REF_LIST_SIZE),
            __member(2),
            __array(2, STD_VIDEO_DECODE_H264_MVC_REF_LIST_SIZE),
            __member(2),
            __array(2, STD_VIDEO_DECODE_H264_MVC_REF_LIST_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FLAGS = layout.offsetof(0);
        VIEWORDERINDEX = layout.offsetof(1);
        VIEWID = layout.offsetof(2);
        TEMPORALID = layout.offsetof(3);
        PRIORITYID = layout.offsetof(4);
        NUMOFANCHORREFSINL0 = layout.offsetof(5);
        VIEWIDOFANCHORREFSINL0 = layout.offsetof(6);
        NUMOFANCHORREFSINL1 = layout.offsetof(7);
        VIEWIDOFANCHORREFSINL1 = layout.offsetof(8);
        NUMOFNONANCHORREFSINL0 = layout.offsetof(9);
        VIEWIDOFNONANCHORREFSINL0 = layout.offsetof(10);
        NUMOFNONANCHORREFSINL1 = layout.offsetof(11);
        VIEWIDOFNONANCHORREFSINL1 = layout.offsetof(12);
    }

    /**
     * Creates a {@code StdVideoDecodeH264MvcElement} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoDecodeH264MvcElement(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link StdVideoDecodeH264MvcElementFlags} view of the {@code flags} field. */
    public StdVideoDecodeH264MvcElementFlags flags() { return nflags(address()); }
    /** @return the value of the {@code viewOrderIndex} field. */
    @NativeType("uint16_t")
    public short viewOrderIndex() { return nviewOrderIndex(address()); }
    /** @return the value of the {@code viewId} field. */
    @NativeType("uint16_t")
    public short viewId() { return nviewId(address()); }
    /** move out? */
    @NativeType("uint16_t")
    public short temporalId() { return ntemporalId(address()); }
    /** move out? */
    @NativeType("uint16_t")
    public short priorityId() { return npriorityId(address()); }
    /** @return the value of the {@code numOfAnchorRefsInL0} field. */
    @NativeType("uint16_t")
    public short numOfAnchorRefsInL0() { return nnumOfAnchorRefsInL0(address()); }
    /** @return a {@link ShortBuffer} view of the {@code viewIdOfAnchorRefsInL0} field. */
    @NativeType("uint16_t[STD_VIDEO_DECODE_H264_MVC_REF_LIST_SIZE]")
    public ShortBuffer viewIdOfAnchorRefsInL0() { return nviewIdOfAnchorRefsInL0(address()); }
    /** @return the value at the specified index of the {@code viewIdOfAnchorRefsInL0} field. */
    @NativeType("uint16_t")
    public short viewIdOfAnchorRefsInL0(int index) { return nviewIdOfAnchorRefsInL0(address(), index); }
    /** @return the value of the {@code numOfAnchorRefsInL1} field. */
    @NativeType("uint16_t")
    public short numOfAnchorRefsInL1() { return nnumOfAnchorRefsInL1(address()); }
    /** @return a {@link ShortBuffer} view of the {@code viewIdOfAnchorRefsInL1} field. */
    @NativeType("uint16_t[STD_VIDEO_DECODE_H264_MVC_REF_LIST_SIZE]")
    public ShortBuffer viewIdOfAnchorRefsInL1() { return nviewIdOfAnchorRefsInL1(address()); }
    /** @return the value at the specified index of the {@code viewIdOfAnchorRefsInL1} field. */
    @NativeType("uint16_t")
    public short viewIdOfAnchorRefsInL1(int index) { return nviewIdOfAnchorRefsInL1(address(), index); }
    /** @return the value of the {@code numOfNonAnchorRefsInL0} field. */
    @NativeType("uint16_t")
    public short numOfNonAnchorRefsInL0() { return nnumOfNonAnchorRefsInL0(address()); }
    /** @return a {@link ShortBuffer} view of the {@code viewIdOfNonAnchorRefsInL0} field. */
    @NativeType("uint16_t[STD_VIDEO_DECODE_H264_MVC_REF_LIST_SIZE]")
    public ShortBuffer viewIdOfNonAnchorRefsInL0() { return nviewIdOfNonAnchorRefsInL0(address()); }
    /** @return the value at the specified index of the {@code viewIdOfNonAnchorRefsInL0} field. */
    @NativeType("uint16_t")
    public short viewIdOfNonAnchorRefsInL0(int index) { return nviewIdOfNonAnchorRefsInL0(address(), index); }
    /** @return the value of the {@code numOfNonAnchorRefsInL1} field. */
    @NativeType("uint16_t")
    public short numOfNonAnchorRefsInL1() { return nnumOfNonAnchorRefsInL1(address()); }
    /** @return a {@link ShortBuffer} view of the {@code viewIdOfNonAnchorRefsInL1} field. */
    @NativeType("uint16_t[STD_VIDEO_DECODE_H264_MVC_REF_LIST_SIZE]")
    public ShortBuffer viewIdOfNonAnchorRefsInL1() { return nviewIdOfNonAnchorRefsInL1(address()); }
    /** @return the value at the specified index of the {@code viewIdOfNonAnchorRefsInL1} field. */
    @NativeType("uint16_t")
    public short viewIdOfNonAnchorRefsInL1(int index) { return nviewIdOfNonAnchorRefsInL1(address(), index); }

    /** Copies the specified {@link StdVideoDecodeH264MvcElementFlags} to the {@code flags} field. */
    public StdVideoDecodeH264MvcElement flags(StdVideoDecodeH264MvcElementFlags value) { nflags(address(), value); return this; }
    /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
    public StdVideoDecodeH264MvcElement flags(java.util.function.Consumer<StdVideoDecodeH264MvcElementFlags> consumer) { consumer.accept(flags()); return this; }
    /** Sets the specified value to the {@code viewOrderIndex} field. */
    public StdVideoDecodeH264MvcElement viewOrderIndex(@NativeType("uint16_t") short value) { nviewOrderIndex(address(), value); return this; }
    /** Sets the specified value to the {@code viewId} field. */
    public StdVideoDecodeH264MvcElement viewId(@NativeType("uint16_t") short value) { nviewId(address(), value); return this; }
    /** Sets the specified value to the {@link #temporalId} field. */
    public StdVideoDecodeH264MvcElement temporalId(@NativeType("uint16_t") short value) { ntemporalId(address(), value); return this; }
    /** Sets the specified value to the {@link #priorityId} field. */
    public StdVideoDecodeH264MvcElement priorityId(@NativeType("uint16_t") short value) { npriorityId(address(), value); return this; }
    /** Sets the specified value to the {@code numOfAnchorRefsInL0} field. */
    public StdVideoDecodeH264MvcElement numOfAnchorRefsInL0(@NativeType("uint16_t") short value) { nnumOfAnchorRefsInL0(address(), value); return this; }
    /** Copies the specified {@link ShortBuffer} to the {@code viewIdOfAnchorRefsInL0} field. */
    public StdVideoDecodeH264MvcElement viewIdOfAnchorRefsInL0(@NativeType("uint16_t[STD_VIDEO_DECODE_H264_MVC_REF_LIST_SIZE]") ShortBuffer value) { nviewIdOfAnchorRefsInL0(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code viewIdOfAnchorRefsInL0} field. */
    public StdVideoDecodeH264MvcElement viewIdOfAnchorRefsInL0(int index, @NativeType("uint16_t") short value) { nviewIdOfAnchorRefsInL0(address(), index, value); return this; }
    /** Sets the specified value to the {@code numOfAnchorRefsInL1} field. */
    public StdVideoDecodeH264MvcElement numOfAnchorRefsInL1(@NativeType("uint16_t") short value) { nnumOfAnchorRefsInL1(address(), value); return this; }
    /** Copies the specified {@link ShortBuffer} to the {@code viewIdOfAnchorRefsInL1} field. */
    public StdVideoDecodeH264MvcElement viewIdOfAnchorRefsInL1(@NativeType("uint16_t[STD_VIDEO_DECODE_H264_MVC_REF_LIST_SIZE]") ShortBuffer value) { nviewIdOfAnchorRefsInL1(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code viewIdOfAnchorRefsInL1} field. */
    public StdVideoDecodeH264MvcElement viewIdOfAnchorRefsInL1(int index, @NativeType("uint16_t") short value) { nviewIdOfAnchorRefsInL1(address(), index, value); return this; }
    /** Sets the specified value to the {@code numOfNonAnchorRefsInL0} field. */
    public StdVideoDecodeH264MvcElement numOfNonAnchorRefsInL0(@NativeType("uint16_t") short value) { nnumOfNonAnchorRefsInL0(address(), value); return this; }
    /** Copies the specified {@link ShortBuffer} to the {@code viewIdOfNonAnchorRefsInL0} field. */
    public StdVideoDecodeH264MvcElement viewIdOfNonAnchorRefsInL0(@NativeType("uint16_t[STD_VIDEO_DECODE_H264_MVC_REF_LIST_SIZE]") ShortBuffer value) { nviewIdOfNonAnchorRefsInL0(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code viewIdOfNonAnchorRefsInL0} field. */
    public StdVideoDecodeH264MvcElement viewIdOfNonAnchorRefsInL0(int index, @NativeType("uint16_t") short value) { nviewIdOfNonAnchorRefsInL0(address(), index, value); return this; }
    /** Sets the specified value to the {@code numOfNonAnchorRefsInL1} field. */
    public StdVideoDecodeH264MvcElement numOfNonAnchorRefsInL1(@NativeType("uint16_t") short value) { nnumOfNonAnchorRefsInL1(address(), value); return this; }
    /** Copies the specified {@link ShortBuffer} to the {@code viewIdOfNonAnchorRefsInL1} field. */
    public StdVideoDecodeH264MvcElement viewIdOfNonAnchorRefsInL1(@NativeType("uint16_t[STD_VIDEO_DECODE_H264_MVC_REF_LIST_SIZE]") ShortBuffer value) { nviewIdOfNonAnchorRefsInL1(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code viewIdOfNonAnchorRefsInL1} field. */
    public StdVideoDecodeH264MvcElement viewIdOfNonAnchorRefsInL1(int index, @NativeType("uint16_t") short value) { nviewIdOfNonAnchorRefsInL1(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoDecodeH264MvcElement set(
        StdVideoDecodeH264MvcElementFlags flags,
        short viewOrderIndex,
        short viewId,
        short temporalId,
        short priorityId,
        short numOfAnchorRefsInL0,
        ShortBuffer viewIdOfAnchorRefsInL0,
        short numOfAnchorRefsInL1,
        ShortBuffer viewIdOfAnchorRefsInL1,
        short numOfNonAnchorRefsInL0,
        ShortBuffer viewIdOfNonAnchorRefsInL0,
        short numOfNonAnchorRefsInL1,
        ShortBuffer viewIdOfNonAnchorRefsInL1
    ) {
        flags(flags);
        viewOrderIndex(viewOrderIndex);
        viewId(viewId);
        temporalId(temporalId);
        priorityId(priorityId);
        numOfAnchorRefsInL0(numOfAnchorRefsInL0);
        viewIdOfAnchorRefsInL0(viewIdOfAnchorRefsInL0);
        numOfAnchorRefsInL1(numOfAnchorRefsInL1);
        viewIdOfAnchorRefsInL1(viewIdOfAnchorRefsInL1);
        numOfNonAnchorRefsInL0(numOfNonAnchorRefsInL0);
        viewIdOfNonAnchorRefsInL0(viewIdOfNonAnchorRefsInL0);
        numOfNonAnchorRefsInL1(numOfNonAnchorRefsInL1);
        viewIdOfNonAnchorRefsInL1(viewIdOfNonAnchorRefsInL1);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoDecodeH264MvcElement set(StdVideoDecodeH264MvcElement src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoDecodeH264MvcElement} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoDecodeH264MvcElement malloc() {
        return wrap(StdVideoDecodeH264MvcElement.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code StdVideoDecodeH264MvcElement} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoDecodeH264MvcElement calloc() {
        return wrap(StdVideoDecodeH264MvcElement.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code StdVideoDecodeH264MvcElement} instance allocated with {@link BufferUtils}. */
    public static StdVideoDecodeH264MvcElement create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(StdVideoDecodeH264MvcElement.class, memAddress(container), container);
    }

    /** Returns a new {@code StdVideoDecodeH264MvcElement} instance for the specified memory address. */
    public static StdVideoDecodeH264MvcElement create(long address) {
        return wrap(StdVideoDecodeH264MvcElement.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoDecodeH264MvcElement createSafe(long address) {
        return address == NULL ? null : wrap(StdVideoDecodeH264MvcElement.class, address);
    }

    /**
     * Returns a new {@link StdVideoDecodeH264MvcElement.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeH264MvcElement.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoDecodeH264MvcElement.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeH264MvcElement.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoDecodeH264MvcElement.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeH264MvcElement.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link StdVideoDecodeH264MvcElement.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeH264MvcElement.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoDecodeH264MvcElement.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code StdVideoDecodeH264MvcElement} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoDecodeH264MvcElement malloc(MemoryStack stack) {
        return wrap(StdVideoDecodeH264MvcElement.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code StdVideoDecodeH264MvcElement} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoDecodeH264MvcElement calloc(MemoryStack stack) {
        return wrap(StdVideoDecodeH264MvcElement.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link StdVideoDecodeH264MvcElement.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeH264MvcElement.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoDecodeH264MvcElement.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeH264MvcElement.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #flags}. */
    public static StdVideoDecodeH264MvcElementFlags nflags(long struct) { return StdVideoDecodeH264MvcElementFlags.create(struct + StdVideoDecodeH264MvcElement.FLAGS); }
    /** Unsafe version of {@link #viewOrderIndex}. */
    public static short nviewOrderIndex(long struct) { return UNSAFE.getShort(null, struct + StdVideoDecodeH264MvcElement.VIEWORDERINDEX); }
    /** Unsafe version of {@link #viewId}. */
    public static short nviewId(long struct) { return UNSAFE.getShort(null, struct + StdVideoDecodeH264MvcElement.VIEWID); }
    /** Unsafe version of {@link #temporalId}. */
    public static short ntemporalId(long struct) { return UNSAFE.getShort(null, struct + StdVideoDecodeH264MvcElement.TEMPORALID); }
    /** Unsafe version of {@link #priorityId}. */
    public static short npriorityId(long struct) { return UNSAFE.getShort(null, struct + StdVideoDecodeH264MvcElement.PRIORITYID); }
    /** Unsafe version of {@link #numOfAnchorRefsInL0}. */
    public static short nnumOfAnchorRefsInL0(long struct) { return UNSAFE.getShort(null, struct + StdVideoDecodeH264MvcElement.NUMOFANCHORREFSINL0); }
    /** Unsafe version of {@link #viewIdOfAnchorRefsInL0}. */
    public static ShortBuffer nviewIdOfAnchorRefsInL0(long struct) { return memShortBuffer(struct + StdVideoDecodeH264MvcElement.VIEWIDOFANCHORREFSINL0, STD_VIDEO_DECODE_H264_MVC_REF_LIST_SIZE); }
    /** Unsafe version of {@link #viewIdOfAnchorRefsInL0(int) viewIdOfAnchorRefsInL0}. */
    public static short nviewIdOfAnchorRefsInL0(long struct, int index) {
        return UNSAFE.getShort(null, struct + StdVideoDecodeH264MvcElement.VIEWIDOFANCHORREFSINL0 + check(index, STD_VIDEO_DECODE_H264_MVC_REF_LIST_SIZE) * 2);
    }
    /** Unsafe version of {@link #numOfAnchorRefsInL1}. */
    public static short nnumOfAnchorRefsInL1(long struct) { return UNSAFE.getShort(null, struct + StdVideoDecodeH264MvcElement.NUMOFANCHORREFSINL1); }
    /** Unsafe version of {@link #viewIdOfAnchorRefsInL1}. */
    public static ShortBuffer nviewIdOfAnchorRefsInL1(long struct) { return memShortBuffer(struct + StdVideoDecodeH264MvcElement.VIEWIDOFANCHORREFSINL1, STD_VIDEO_DECODE_H264_MVC_REF_LIST_SIZE); }
    /** Unsafe version of {@link #viewIdOfAnchorRefsInL1(int) viewIdOfAnchorRefsInL1}. */
    public static short nviewIdOfAnchorRefsInL1(long struct, int index) {
        return UNSAFE.getShort(null, struct + StdVideoDecodeH264MvcElement.VIEWIDOFANCHORREFSINL1 + check(index, STD_VIDEO_DECODE_H264_MVC_REF_LIST_SIZE) * 2);
    }
    /** Unsafe version of {@link #numOfNonAnchorRefsInL0}. */
    public static short nnumOfNonAnchorRefsInL0(long struct) { return UNSAFE.getShort(null, struct + StdVideoDecodeH264MvcElement.NUMOFNONANCHORREFSINL0); }
    /** Unsafe version of {@link #viewIdOfNonAnchorRefsInL0}. */
    public static ShortBuffer nviewIdOfNonAnchorRefsInL0(long struct) { return memShortBuffer(struct + StdVideoDecodeH264MvcElement.VIEWIDOFNONANCHORREFSINL0, STD_VIDEO_DECODE_H264_MVC_REF_LIST_SIZE); }
    /** Unsafe version of {@link #viewIdOfNonAnchorRefsInL0(int) viewIdOfNonAnchorRefsInL0}. */
    public static short nviewIdOfNonAnchorRefsInL0(long struct, int index) {
        return UNSAFE.getShort(null, struct + StdVideoDecodeH264MvcElement.VIEWIDOFNONANCHORREFSINL0 + check(index, STD_VIDEO_DECODE_H264_MVC_REF_LIST_SIZE) * 2);
    }
    /** Unsafe version of {@link #numOfNonAnchorRefsInL1}. */
    public static short nnumOfNonAnchorRefsInL1(long struct) { return UNSAFE.getShort(null, struct + StdVideoDecodeH264MvcElement.NUMOFNONANCHORREFSINL1); }
    /** Unsafe version of {@link #viewIdOfNonAnchorRefsInL1}. */
    public static ShortBuffer nviewIdOfNonAnchorRefsInL1(long struct) { return memShortBuffer(struct + StdVideoDecodeH264MvcElement.VIEWIDOFNONANCHORREFSINL1, STD_VIDEO_DECODE_H264_MVC_REF_LIST_SIZE); }
    /** Unsafe version of {@link #viewIdOfNonAnchorRefsInL1(int) viewIdOfNonAnchorRefsInL1}. */
    public static short nviewIdOfNonAnchorRefsInL1(long struct, int index) {
        return UNSAFE.getShort(null, struct + StdVideoDecodeH264MvcElement.VIEWIDOFNONANCHORREFSINL1 + check(index, STD_VIDEO_DECODE_H264_MVC_REF_LIST_SIZE) * 2);
    }

    /** Unsafe version of {@link #flags(StdVideoDecodeH264MvcElementFlags) flags}. */
    public static void nflags(long struct, StdVideoDecodeH264MvcElementFlags value) { memCopy(value.address(), struct + StdVideoDecodeH264MvcElement.FLAGS, StdVideoDecodeH264MvcElementFlags.SIZEOF); }
    /** Unsafe version of {@link #viewOrderIndex(short) viewOrderIndex}. */
    public static void nviewOrderIndex(long struct, short value) { UNSAFE.putShort(null, struct + StdVideoDecodeH264MvcElement.VIEWORDERINDEX, value); }
    /** Unsafe version of {@link #viewId(short) viewId}. */
    public static void nviewId(long struct, short value) { UNSAFE.putShort(null, struct + StdVideoDecodeH264MvcElement.VIEWID, value); }
    /** Unsafe version of {@link #temporalId(short) temporalId}. */
    public static void ntemporalId(long struct, short value) { UNSAFE.putShort(null, struct + StdVideoDecodeH264MvcElement.TEMPORALID, value); }
    /** Unsafe version of {@link #priorityId(short) priorityId}. */
    public static void npriorityId(long struct, short value) { UNSAFE.putShort(null, struct + StdVideoDecodeH264MvcElement.PRIORITYID, value); }
    /** Unsafe version of {@link #numOfAnchorRefsInL0(short) numOfAnchorRefsInL0}. */
    public static void nnumOfAnchorRefsInL0(long struct, short value) { UNSAFE.putShort(null, struct + StdVideoDecodeH264MvcElement.NUMOFANCHORREFSINL0, value); }
    /** Unsafe version of {@link #viewIdOfAnchorRefsInL0(ShortBuffer) viewIdOfAnchorRefsInL0}. */
    public static void nviewIdOfAnchorRefsInL0(long struct, ShortBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_DECODE_H264_MVC_REF_LIST_SIZE); }
        memCopy(memAddress(value), struct + StdVideoDecodeH264MvcElement.VIEWIDOFANCHORREFSINL0, value.remaining() * 2);
    }
    /** Unsafe version of {@link #viewIdOfAnchorRefsInL0(int, short) viewIdOfAnchorRefsInL0}. */
    public static void nviewIdOfAnchorRefsInL0(long struct, int index, short value) {
        UNSAFE.putShort(null, struct + StdVideoDecodeH264MvcElement.VIEWIDOFANCHORREFSINL0 + check(index, STD_VIDEO_DECODE_H264_MVC_REF_LIST_SIZE) * 2, value);
    }
    /** Unsafe version of {@link #numOfAnchorRefsInL1(short) numOfAnchorRefsInL1}. */
    public static void nnumOfAnchorRefsInL1(long struct, short value) { UNSAFE.putShort(null, struct + StdVideoDecodeH264MvcElement.NUMOFANCHORREFSINL1, value); }
    /** Unsafe version of {@link #viewIdOfAnchorRefsInL1(ShortBuffer) viewIdOfAnchorRefsInL1}. */
    public static void nviewIdOfAnchorRefsInL1(long struct, ShortBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_DECODE_H264_MVC_REF_LIST_SIZE); }
        memCopy(memAddress(value), struct + StdVideoDecodeH264MvcElement.VIEWIDOFANCHORREFSINL1, value.remaining() * 2);
    }
    /** Unsafe version of {@link #viewIdOfAnchorRefsInL1(int, short) viewIdOfAnchorRefsInL1}. */
    public static void nviewIdOfAnchorRefsInL1(long struct, int index, short value) {
        UNSAFE.putShort(null, struct + StdVideoDecodeH264MvcElement.VIEWIDOFANCHORREFSINL1 + check(index, STD_VIDEO_DECODE_H264_MVC_REF_LIST_SIZE) * 2, value);
    }
    /** Unsafe version of {@link #numOfNonAnchorRefsInL0(short) numOfNonAnchorRefsInL0}. */
    public static void nnumOfNonAnchorRefsInL0(long struct, short value) { UNSAFE.putShort(null, struct + StdVideoDecodeH264MvcElement.NUMOFNONANCHORREFSINL0, value); }
    /** Unsafe version of {@link #viewIdOfNonAnchorRefsInL0(ShortBuffer) viewIdOfNonAnchorRefsInL0}. */
    public static void nviewIdOfNonAnchorRefsInL0(long struct, ShortBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_DECODE_H264_MVC_REF_LIST_SIZE); }
        memCopy(memAddress(value), struct + StdVideoDecodeH264MvcElement.VIEWIDOFNONANCHORREFSINL0, value.remaining() * 2);
    }
    /** Unsafe version of {@link #viewIdOfNonAnchorRefsInL0(int, short) viewIdOfNonAnchorRefsInL0}. */
    public static void nviewIdOfNonAnchorRefsInL0(long struct, int index, short value) {
        UNSAFE.putShort(null, struct + StdVideoDecodeH264MvcElement.VIEWIDOFNONANCHORREFSINL0 + check(index, STD_VIDEO_DECODE_H264_MVC_REF_LIST_SIZE) * 2, value);
    }
    /** Unsafe version of {@link #numOfNonAnchorRefsInL1(short) numOfNonAnchorRefsInL1}. */
    public static void nnumOfNonAnchorRefsInL1(long struct, short value) { UNSAFE.putShort(null, struct + StdVideoDecodeH264MvcElement.NUMOFNONANCHORREFSINL1, value); }
    /** Unsafe version of {@link #viewIdOfNonAnchorRefsInL1(ShortBuffer) viewIdOfNonAnchorRefsInL1}. */
    public static void nviewIdOfNonAnchorRefsInL1(long struct, ShortBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_DECODE_H264_MVC_REF_LIST_SIZE); }
        memCopy(memAddress(value), struct + StdVideoDecodeH264MvcElement.VIEWIDOFNONANCHORREFSINL1, value.remaining() * 2);
    }
    /** Unsafe version of {@link #viewIdOfNonAnchorRefsInL1(int, short) viewIdOfNonAnchorRefsInL1}. */
    public static void nviewIdOfNonAnchorRefsInL1(long struct, int index, short value) {
        UNSAFE.putShort(null, struct + StdVideoDecodeH264MvcElement.VIEWIDOFNONANCHORREFSINL1 + check(index, STD_VIDEO_DECODE_H264_MVC_REF_LIST_SIZE) * 2, value);
    }

    // -----------------------------------

    /** An array of {@link StdVideoDecodeH264MvcElement} structs. */
    public static class Buffer extends StructBuffer<StdVideoDecodeH264MvcElement, Buffer> implements NativeResource {

        private static final StdVideoDecodeH264MvcElement ELEMENT_FACTORY = StdVideoDecodeH264MvcElement.create(-1L);

        /**
         * Creates a new {@code StdVideoDecodeH264MvcElement.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoDecodeH264MvcElement#SIZEOF}, and its mark will be undefined.
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
        protected StdVideoDecodeH264MvcElement getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link StdVideoDecodeH264MvcElementFlags} view of the {@code flags} field. */
        public StdVideoDecodeH264MvcElementFlags flags() { return StdVideoDecodeH264MvcElement.nflags(address()); }
        /** @return the value of the {@code viewOrderIndex} field. */
        @NativeType("uint16_t")
        public short viewOrderIndex() { return StdVideoDecodeH264MvcElement.nviewOrderIndex(address()); }
        /** @return the value of the {@code viewId} field. */
        @NativeType("uint16_t")
        public short viewId() { return StdVideoDecodeH264MvcElement.nviewId(address()); }
        /** @return the value of the {@link StdVideoDecodeH264MvcElement#temporalId} field. */
        @NativeType("uint16_t")
        public short temporalId() { return StdVideoDecodeH264MvcElement.ntemporalId(address()); }
        /** @return the value of the {@link StdVideoDecodeH264MvcElement#priorityId} field. */
        @NativeType("uint16_t")
        public short priorityId() { return StdVideoDecodeH264MvcElement.npriorityId(address()); }
        /** @return the value of the {@code numOfAnchorRefsInL0} field. */
        @NativeType("uint16_t")
        public short numOfAnchorRefsInL0() { return StdVideoDecodeH264MvcElement.nnumOfAnchorRefsInL0(address()); }
        /** @return a {@link ShortBuffer} view of the {@code viewIdOfAnchorRefsInL0} field. */
        @NativeType("uint16_t[STD_VIDEO_DECODE_H264_MVC_REF_LIST_SIZE]")
        public ShortBuffer viewIdOfAnchorRefsInL0() { return StdVideoDecodeH264MvcElement.nviewIdOfAnchorRefsInL0(address()); }
        /** @return the value at the specified index of the {@code viewIdOfAnchorRefsInL0} field. */
        @NativeType("uint16_t")
        public short viewIdOfAnchorRefsInL0(int index) { return StdVideoDecodeH264MvcElement.nviewIdOfAnchorRefsInL0(address(), index); }
        /** @return the value of the {@code numOfAnchorRefsInL1} field. */
        @NativeType("uint16_t")
        public short numOfAnchorRefsInL1() { return StdVideoDecodeH264MvcElement.nnumOfAnchorRefsInL1(address()); }
        /** @return a {@link ShortBuffer} view of the {@code viewIdOfAnchorRefsInL1} field. */
        @NativeType("uint16_t[STD_VIDEO_DECODE_H264_MVC_REF_LIST_SIZE]")
        public ShortBuffer viewIdOfAnchorRefsInL1() { return StdVideoDecodeH264MvcElement.nviewIdOfAnchorRefsInL1(address()); }
        /** @return the value at the specified index of the {@code viewIdOfAnchorRefsInL1} field. */
        @NativeType("uint16_t")
        public short viewIdOfAnchorRefsInL1(int index) { return StdVideoDecodeH264MvcElement.nviewIdOfAnchorRefsInL1(address(), index); }
        /** @return the value of the {@code numOfNonAnchorRefsInL0} field. */
        @NativeType("uint16_t")
        public short numOfNonAnchorRefsInL0() { return StdVideoDecodeH264MvcElement.nnumOfNonAnchorRefsInL0(address()); }
        /** @return a {@link ShortBuffer} view of the {@code viewIdOfNonAnchorRefsInL0} field. */
        @NativeType("uint16_t[STD_VIDEO_DECODE_H264_MVC_REF_LIST_SIZE]")
        public ShortBuffer viewIdOfNonAnchorRefsInL0() { return StdVideoDecodeH264MvcElement.nviewIdOfNonAnchorRefsInL0(address()); }
        /** @return the value at the specified index of the {@code viewIdOfNonAnchorRefsInL0} field. */
        @NativeType("uint16_t")
        public short viewIdOfNonAnchorRefsInL0(int index) { return StdVideoDecodeH264MvcElement.nviewIdOfNonAnchorRefsInL0(address(), index); }
        /** @return the value of the {@code numOfNonAnchorRefsInL1} field. */
        @NativeType("uint16_t")
        public short numOfNonAnchorRefsInL1() { return StdVideoDecodeH264MvcElement.nnumOfNonAnchorRefsInL1(address()); }
        /** @return a {@link ShortBuffer} view of the {@code viewIdOfNonAnchorRefsInL1} field. */
        @NativeType("uint16_t[STD_VIDEO_DECODE_H264_MVC_REF_LIST_SIZE]")
        public ShortBuffer viewIdOfNonAnchorRefsInL1() { return StdVideoDecodeH264MvcElement.nviewIdOfNonAnchorRefsInL1(address()); }
        /** @return the value at the specified index of the {@code viewIdOfNonAnchorRefsInL1} field. */
        @NativeType("uint16_t")
        public short viewIdOfNonAnchorRefsInL1(int index) { return StdVideoDecodeH264MvcElement.nviewIdOfNonAnchorRefsInL1(address(), index); }

        /** Copies the specified {@link StdVideoDecodeH264MvcElementFlags} to the {@code flags} field. */
        public StdVideoDecodeH264MvcElement.Buffer flags(StdVideoDecodeH264MvcElementFlags value) { StdVideoDecodeH264MvcElement.nflags(address(), value); return this; }
        /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
        public StdVideoDecodeH264MvcElement.Buffer flags(java.util.function.Consumer<StdVideoDecodeH264MvcElementFlags> consumer) { consumer.accept(flags()); return this; }
        /** Sets the specified value to the {@code viewOrderIndex} field. */
        public StdVideoDecodeH264MvcElement.Buffer viewOrderIndex(@NativeType("uint16_t") short value) { StdVideoDecodeH264MvcElement.nviewOrderIndex(address(), value); return this; }
        /** Sets the specified value to the {@code viewId} field. */
        public StdVideoDecodeH264MvcElement.Buffer viewId(@NativeType("uint16_t") short value) { StdVideoDecodeH264MvcElement.nviewId(address(), value); return this; }
        /** Sets the specified value to the {@link StdVideoDecodeH264MvcElement#temporalId} field. */
        public StdVideoDecodeH264MvcElement.Buffer temporalId(@NativeType("uint16_t") short value) { StdVideoDecodeH264MvcElement.ntemporalId(address(), value); return this; }
        /** Sets the specified value to the {@link StdVideoDecodeH264MvcElement#priorityId} field. */
        public StdVideoDecodeH264MvcElement.Buffer priorityId(@NativeType("uint16_t") short value) { StdVideoDecodeH264MvcElement.npriorityId(address(), value); return this; }
        /** Sets the specified value to the {@code numOfAnchorRefsInL0} field. */
        public StdVideoDecodeH264MvcElement.Buffer numOfAnchorRefsInL0(@NativeType("uint16_t") short value) { StdVideoDecodeH264MvcElement.nnumOfAnchorRefsInL0(address(), value); return this; }
        /** Copies the specified {@link ShortBuffer} to the {@code viewIdOfAnchorRefsInL0} field. */
        public StdVideoDecodeH264MvcElement.Buffer viewIdOfAnchorRefsInL0(@NativeType("uint16_t[STD_VIDEO_DECODE_H264_MVC_REF_LIST_SIZE]") ShortBuffer value) { StdVideoDecodeH264MvcElement.nviewIdOfAnchorRefsInL0(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code viewIdOfAnchorRefsInL0} field. */
        public StdVideoDecodeH264MvcElement.Buffer viewIdOfAnchorRefsInL0(int index, @NativeType("uint16_t") short value) { StdVideoDecodeH264MvcElement.nviewIdOfAnchorRefsInL0(address(), index, value); return this; }
        /** Sets the specified value to the {@code numOfAnchorRefsInL1} field. */
        public StdVideoDecodeH264MvcElement.Buffer numOfAnchorRefsInL1(@NativeType("uint16_t") short value) { StdVideoDecodeH264MvcElement.nnumOfAnchorRefsInL1(address(), value); return this; }
        /** Copies the specified {@link ShortBuffer} to the {@code viewIdOfAnchorRefsInL1} field. */
        public StdVideoDecodeH264MvcElement.Buffer viewIdOfAnchorRefsInL1(@NativeType("uint16_t[STD_VIDEO_DECODE_H264_MVC_REF_LIST_SIZE]") ShortBuffer value) { StdVideoDecodeH264MvcElement.nviewIdOfAnchorRefsInL1(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code viewIdOfAnchorRefsInL1} field. */
        public StdVideoDecodeH264MvcElement.Buffer viewIdOfAnchorRefsInL1(int index, @NativeType("uint16_t") short value) { StdVideoDecodeH264MvcElement.nviewIdOfAnchorRefsInL1(address(), index, value); return this; }
        /** Sets the specified value to the {@code numOfNonAnchorRefsInL0} field. */
        public StdVideoDecodeH264MvcElement.Buffer numOfNonAnchorRefsInL0(@NativeType("uint16_t") short value) { StdVideoDecodeH264MvcElement.nnumOfNonAnchorRefsInL0(address(), value); return this; }
        /** Copies the specified {@link ShortBuffer} to the {@code viewIdOfNonAnchorRefsInL0} field. */
        public StdVideoDecodeH264MvcElement.Buffer viewIdOfNonAnchorRefsInL0(@NativeType("uint16_t[STD_VIDEO_DECODE_H264_MVC_REF_LIST_SIZE]") ShortBuffer value) { StdVideoDecodeH264MvcElement.nviewIdOfNonAnchorRefsInL0(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code viewIdOfNonAnchorRefsInL0} field. */
        public StdVideoDecodeH264MvcElement.Buffer viewIdOfNonAnchorRefsInL0(int index, @NativeType("uint16_t") short value) { StdVideoDecodeH264MvcElement.nviewIdOfNonAnchorRefsInL0(address(), index, value); return this; }
        /** Sets the specified value to the {@code numOfNonAnchorRefsInL1} field. */
        public StdVideoDecodeH264MvcElement.Buffer numOfNonAnchorRefsInL1(@NativeType("uint16_t") short value) { StdVideoDecodeH264MvcElement.nnumOfNonAnchorRefsInL1(address(), value); return this; }
        /** Copies the specified {@link ShortBuffer} to the {@code viewIdOfNonAnchorRefsInL1} field. */
        public StdVideoDecodeH264MvcElement.Buffer viewIdOfNonAnchorRefsInL1(@NativeType("uint16_t[STD_VIDEO_DECODE_H264_MVC_REF_LIST_SIZE]") ShortBuffer value) { StdVideoDecodeH264MvcElement.nviewIdOfNonAnchorRefsInL1(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code viewIdOfNonAnchorRefsInL1} field. */
        public StdVideoDecodeH264MvcElement.Buffer viewIdOfNonAnchorRefsInL1(int index, @NativeType("uint16_t") short value) { StdVideoDecodeH264MvcElement.nviewIdOfNonAnchorRefsInL1(address(), index, value); return this; }

    }

}