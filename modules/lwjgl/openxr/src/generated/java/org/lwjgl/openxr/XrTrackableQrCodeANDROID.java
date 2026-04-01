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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre><code>
 * struct XrTrackableQrCodeANDROID {
 *     XrStructureType type;
 *     void * next;
 *     XrTrackingStateANDROID trackingState;
 *     XrTime lastUpdatedTime;
 *     {@link XrPosef XrPosef} centerPose;
 *     {@link XrExtent2Df XrExtent2Df} extents;
 *     uint32_t bufferCapacityInput;
 *     uint32_t bufferCountOutput;
 *     char * buffer;
 * }</code></pre>
 */
public class XrTrackableQrCodeANDROID extends Struct<XrTrackableQrCodeANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        TRACKINGSTATE,
        LASTUPDATEDTIME,
        CENTERPOSE,
        EXTENTS,
        BUFFERCAPACITYINPUT,
        BUFFERCOUNTOUTPUT,
        BUFFER;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF),
            __member(XrExtent2Df.SIZEOF, XrExtent2Df.ALIGNOF),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        TRACKINGSTATE = layout.offsetof(2);
        LASTUPDATEDTIME = layout.offsetof(3);
        CENTERPOSE = layout.offsetof(4);
        EXTENTS = layout.offsetof(5);
        BUFFERCAPACITYINPUT = layout.offsetof(6);
        BUFFERCOUNTOUTPUT = layout.offsetof(7);
        BUFFER = layout.offsetof(8);
    }

    protected XrTrackableQrCodeANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrTrackableQrCodeANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrTrackableQrCodeANDROID(address, container);
    }

    /**
     * Creates a {@code XrTrackableQrCodeANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrTrackableQrCodeANDROID(ByteBuffer container) {
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
    /** @return the value of the {@code trackingState} field. */
    @NativeType("XrTrackingStateANDROID")
    public int trackingState() { return ntrackingState(address()); }
    /** @return the value of the {@code lastUpdatedTime} field. */
    @NativeType("XrTime")
    public long lastUpdatedTime() { return nlastUpdatedTime(address()); }
    /** @return a {@link XrPosef} view of the {@code centerPose} field. */
    public XrPosef centerPose() { return ncenterPose(address()); }
    /** @return a {@link XrExtent2Df} view of the {@code extents} field. */
    public XrExtent2Df extents() { return nextents(address()); }
    /** @return the value of the {@code bufferCapacityInput} field. */
    @NativeType("uint32_t")
    public int bufferCapacityInput() { return nbufferCapacityInput(address()); }
    /** @return the value of the {@code bufferCountOutput} field. */
    @NativeType("uint32_t")
    public int bufferCountOutput() { return nbufferCountOutput(address()); }
    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code buffer} field. */
    @NativeType("char *")
    public @Nullable ByteBuffer buffer() { return nbuffer(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrTrackableQrCodeANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDTrackablesQrCode#XR_TYPE_TRACKABLE_QR_CODE_ANDROID TYPE_TRACKABLE_QR_CODE_ANDROID} value to the {@code type} field. */
    public XrTrackableQrCodeANDROID type$Default() { return type(ANDROIDTrackablesQrCode.XR_TYPE_TRACKABLE_QR_CODE_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrTrackableQrCodeANDROID next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code trackingState} field. */
    public XrTrackableQrCodeANDROID trackingState(@NativeType("XrTrackingStateANDROID") int value) { ntrackingState(address(), value); return this; }
    /** Sets the specified value to the {@code lastUpdatedTime} field. */
    public XrTrackableQrCodeANDROID lastUpdatedTime(@NativeType("XrTime") long value) { nlastUpdatedTime(address(), value); return this; }
    /** Copies the specified {@link XrPosef} to the {@code centerPose} field. */
    public XrTrackableQrCodeANDROID centerPose(XrPosef value) { ncenterPose(address(), value); return this; }
    /** Passes the {@code centerPose} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrTrackableQrCodeANDROID centerPose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(centerPose()); return this; }
    /** Copies the specified {@link XrExtent2Df} to the {@code extents} field. */
    public XrTrackableQrCodeANDROID extents(XrExtent2Df value) { nextents(address(), value); return this; }
    /** Passes the {@code extents} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrTrackableQrCodeANDROID extents(java.util.function.Consumer<XrExtent2Df> consumer) { consumer.accept(extents()); return this; }
    /** Sets the specified value to the {@code bufferCapacityInput} field. */
    public XrTrackableQrCodeANDROID bufferCapacityInput(@NativeType("uint32_t") int value) { nbufferCapacityInput(address(), value); return this; }
    /** Sets the specified value to the {@code bufferCountOutput} field. */
    public XrTrackableQrCodeANDROID bufferCountOutput(@NativeType("uint32_t") int value) { nbufferCountOutput(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code buffer} field. */
    public XrTrackableQrCodeANDROID buffer(@Nullable @NativeType("char *") ByteBuffer value) { nbuffer(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrTrackableQrCodeANDROID set(
        int type,
        long next,
        int trackingState,
        long lastUpdatedTime,
        XrPosef centerPose,
        XrExtent2Df extents,
        int bufferCapacityInput,
        int bufferCountOutput,
        @Nullable ByteBuffer buffer
    ) {
        type(type);
        next(next);
        trackingState(trackingState);
        lastUpdatedTime(lastUpdatedTime);
        centerPose(centerPose);
        extents(extents);
        bufferCapacityInput(bufferCapacityInput);
        bufferCountOutput(bufferCountOutput);
        buffer(buffer);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrTrackableQrCodeANDROID set(XrTrackableQrCodeANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrTrackableQrCodeANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrTrackableQrCodeANDROID malloc() {
        return new XrTrackableQrCodeANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrTrackableQrCodeANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrTrackableQrCodeANDROID calloc() {
        return new XrTrackableQrCodeANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrTrackableQrCodeANDROID} instance allocated with {@link BufferUtils}. */
    public static XrTrackableQrCodeANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrTrackableQrCodeANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrTrackableQrCodeANDROID} instance for the specified memory address. */
    public static XrTrackableQrCodeANDROID create(long address) {
        return new XrTrackableQrCodeANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrTrackableQrCodeANDROID createSafe(long address) {
        return address == NULL ? null : new XrTrackableQrCodeANDROID(address, null);
    }

    /**
     * Returns a new {@link XrTrackableQrCodeANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrTrackableQrCodeANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrTrackableQrCodeANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrTrackableQrCodeANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrTrackableQrCodeANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrTrackableQrCodeANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrTrackableQrCodeANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrTrackableQrCodeANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrTrackableQrCodeANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrTrackableQrCodeANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrTrackableQrCodeANDROID malloc(MemoryStack stack) {
        return new XrTrackableQrCodeANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrTrackableQrCodeANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrTrackableQrCodeANDROID calloc(MemoryStack stack) {
        return new XrTrackableQrCodeANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrTrackableQrCodeANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrTrackableQrCodeANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrTrackableQrCodeANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrTrackableQrCodeANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrTrackableQrCodeANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrTrackableQrCodeANDROID.NEXT); }
    /** Unsafe version of {@link #trackingState}. */
    public static int ntrackingState(long struct) { return memGetInt(struct + XrTrackableQrCodeANDROID.TRACKINGSTATE); }
    /** Unsafe version of {@link #lastUpdatedTime}. */
    public static long nlastUpdatedTime(long struct) { return memGetLong(struct + XrTrackableQrCodeANDROID.LASTUPDATEDTIME); }
    /** Unsafe version of {@link #centerPose}. */
    public static XrPosef ncenterPose(long struct) { return XrPosef.create(struct + XrTrackableQrCodeANDROID.CENTERPOSE); }
    /** Unsafe version of {@link #extents}. */
    public static XrExtent2Df nextents(long struct) { return XrExtent2Df.create(struct + XrTrackableQrCodeANDROID.EXTENTS); }
    /** Unsafe version of {@link #bufferCapacityInput}. */
    public static int nbufferCapacityInput(long struct) { return memGetInt(struct + XrTrackableQrCodeANDROID.BUFFERCAPACITYINPUT); }
    /** Unsafe version of {@link #bufferCountOutput}. */
    public static int nbufferCountOutput(long struct) { return memGetInt(struct + XrTrackableQrCodeANDROID.BUFFERCOUNTOUTPUT); }
    /** Unsafe version of {@link #buffer() buffer}. */
    public static @Nullable ByteBuffer nbuffer(long struct) { return memByteBufferSafe(memGetAddress(struct + XrTrackableQrCodeANDROID.BUFFER), nbufferCapacityInput(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrTrackableQrCodeANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrTrackableQrCodeANDROID.NEXT, value); }
    /** Unsafe version of {@link #trackingState(int) trackingState}. */
    public static void ntrackingState(long struct, int value) { memPutInt(struct + XrTrackableQrCodeANDROID.TRACKINGSTATE, value); }
    /** Unsafe version of {@link #lastUpdatedTime(long) lastUpdatedTime}. */
    public static void nlastUpdatedTime(long struct, long value) { memPutLong(struct + XrTrackableQrCodeANDROID.LASTUPDATEDTIME, value); }
    /** Unsafe version of {@link #centerPose(XrPosef) centerPose}. */
    public static void ncenterPose(long struct, XrPosef value) { memCopy(value.address(), struct + XrTrackableQrCodeANDROID.CENTERPOSE, XrPosef.SIZEOF); }
    /** Unsafe version of {@link #extents(XrExtent2Df) extents}. */
    public static void nextents(long struct, XrExtent2Df value) { memCopy(value.address(), struct + XrTrackableQrCodeANDROID.EXTENTS, XrExtent2Df.SIZEOF); }
    /** Sets the specified value to the {@code bufferCapacityInput} field of the specified {@code struct}. */
    public static void nbufferCapacityInput(long struct, int value) { memPutInt(struct + XrTrackableQrCodeANDROID.BUFFERCAPACITYINPUT, value); }
    /** Unsafe version of {@link #bufferCountOutput(int) bufferCountOutput}. */
    public static void nbufferCountOutput(long struct, int value) { memPutInt(struct + XrTrackableQrCodeANDROID.BUFFERCOUNTOUTPUT, value); }
    /** Unsafe version of {@link #buffer(ByteBuffer) buffer}. */
    public static void nbuffer(long struct, @Nullable ByteBuffer value) { memPutAddress(struct + XrTrackableQrCodeANDROID.BUFFER, memAddressSafe(value)); if (value != null) { nbufferCapacityInput(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link XrTrackableQrCodeANDROID} structs. */
    public static class Buffer extends StructBuffer<XrTrackableQrCodeANDROID, Buffer> implements NativeResource {

        private static final XrTrackableQrCodeANDROID ELEMENT_FACTORY = XrTrackableQrCodeANDROID.create(-1L);

        /**
         * Creates a new {@code XrTrackableQrCodeANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrTrackableQrCodeANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrTrackableQrCodeANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrTrackableQrCodeANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrTrackableQrCodeANDROID.nnext(address()); }
        /** @return the value of the {@code trackingState} field. */
        @NativeType("XrTrackingStateANDROID")
        public int trackingState() { return XrTrackableQrCodeANDROID.ntrackingState(address()); }
        /** @return the value of the {@code lastUpdatedTime} field. */
        @NativeType("XrTime")
        public long lastUpdatedTime() { return XrTrackableQrCodeANDROID.nlastUpdatedTime(address()); }
        /** @return a {@link XrPosef} view of the {@code centerPose} field. */
        public XrPosef centerPose() { return XrTrackableQrCodeANDROID.ncenterPose(address()); }
        /** @return a {@link XrExtent2Df} view of the {@code extents} field. */
        public XrExtent2Df extents() { return XrTrackableQrCodeANDROID.nextents(address()); }
        /** @return the value of the {@code bufferCapacityInput} field. */
        @NativeType("uint32_t")
        public int bufferCapacityInput() { return XrTrackableQrCodeANDROID.nbufferCapacityInput(address()); }
        /** @return the value of the {@code bufferCountOutput} field. */
        @NativeType("uint32_t")
        public int bufferCountOutput() { return XrTrackableQrCodeANDROID.nbufferCountOutput(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code buffer} field. */
        @NativeType("char *")
        public @Nullable ByteBuffer buffer() { return XrTrackableQrCodeANDROID.nbuffer(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrTrackableQrCodeANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrTrackableQrCodeANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDTrackablesQrCode#XR_TYPE_TRACKABLE_QR_CODE_ANDROID TYPE_TRACKABLE_QR_CODE_ANDROID} value to the {@code type} field. */
        public XrTrackableQrCodeANDROID.Buffer type$Default() { return type(ANDROIDTrackablesQrCode.XR_TYPE_TRACKABLE_QR_CODE_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrTrackableQrCodeANDROID.Buffer next(@NativeType("void *") long value) { XrTrackableQrCodeANDROID.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code trackingState} field. */
        public XrTrackableQrCodeANDROID.Buffer trackingState(@NativeType("XrTrackingStateANDROID") int value) { XrTrackableQrCodeANDROID.ntrackingState(address(), value); return this; }
        /** Sets the specified value to the {@code lastUpdatedTime} field. */
        public XrTrackableQrCodeANDROID.Buffer lastUpdatedTime(@NativeType("XrTime") long value) { XrTrackableQrCodeANDROID.nlastUpdatedTime(address(), value); return this; }
        /** Copies the specified {@link XrPosef} to the {@code centerPose} field. */
        public XrTrackableQrCodeANDROID.Buffer centerPose(XrPosef value) { XrTrackableQrCodeANDROID.ncenterPose(address(), value); return this; }
        /** Passes the {@code centerPose} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrTrackableQrCodeANDROID.Buffer centerPose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(centerPose()); return this; }
        /** Copies the specified {@link XrExtent2Df} to the {@code extents} field. */
        public XrTrackableQrCodeANDROID.Buffer extents(XrExtent2Df value) { XrTrackableQrCodeANDROID.nextents(address(), value); return this; }
        /** Passes the {@code extents} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrTrackableQrCodeANDROID.Buffer extents(java.util.function.Consumer<XrExtent2Df> consumer) { consumer.accept(extents()); return this; }
        /** Sets the specified value to the {@code bufferCapacityInput} field. */
        public XrTrackableQrCodeANDROID.Buffer bufferCapacityInput(@NativeType("uint32_t") int value) { XrTrackableQrCodeANDROID.nbufferCapacityInput(address(), value); return this; }
        /** Sets the specified value to the {@code bufferCountOutput} field. */
        public XrTrackableQrCodeANDROID.Buffer bufferCountOutput(@NativeType("uint32_t") int value) { XrTrackableQrCodeANDROID.nbufferCountOutput(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code buffer} field. */
        public XrTrackableQrCodeANDROID.Buffer buffer(@Nullable @NativeType("char *") ByteBuffer value) { XrTrackableQrCodeANDROID.nbuffer(address(), value); return this; }

    }

}