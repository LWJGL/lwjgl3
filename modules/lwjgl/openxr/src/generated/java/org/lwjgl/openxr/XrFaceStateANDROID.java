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
 * <pre>{@code
 * struct XrFaceStateANDROID {
 *     XrStructureType type;
 *     void * next;
 *     uint32_t parametersCapacityInput;
 *     uint32_t parametersCountOutput;
 *     float * parameters;
 *     XrFaceTrackingStateANDROID faceTrackingState;
 *     XrTime sampleTime;
 *     XrBool32 isValid;
 *     uint32_t regionConfidencesCapacityInput;
 *     uint32_t regionConfidencesCountOutput;
 *     float * regionConfidences;
 * }}</pre>
 */
public class XrFaceStateANDROID extends Struct<XrFaceStateANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        PARAMETERSCAPACITYINPUT,
        PARAMETERSCOUNTOUTPUT,
        PARAMETERS,
        FACETRACKINGSTATE,
        SAMPLETIME,
        ISVALID,
        REGIONCONFIDENCESCAPACITYINPUT,
        REGIONCONFIDENCESCOUNTOUTPUT,
        REGIONCONFIDENCES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
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
        PARAMETERSCAPACITYINPUT = layout.offsetof(2);
        PARAMETERSCOUNTOUTPUT = layout.offsetof(3);
        PARAMETERS = layout.offsetof(4);
        FACETRACKINGSTATE = layout.offsetof(5);
        SAMPLETIME = layout.offsetof(6);
        ISVALID = layout.offsetof(7);
        REGIONCONFIDENCESCAPACITYINPUT = layout.offsetof(8);
        REGIONCONFIDENCESCOUNTOUTPUT = layout.offsetof(9);
        REGIONCONFIDENCES = layout.offsetof(10);
    }

    protected XrFaceStateANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrFaceStateANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrFaceStateANDROID(address, container);
    }

    /**
     * Creates a {@code XrFaceStateANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrFaceStateANDROID(ByteBuffer container) {
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
    /** @return the value of the {@code parametersCapacityInput} field. */
    @NativeType("uint32_t")
    public int parametersCapacityInput() { return nparametersCapacityInput(address()); }
    /** @return the value of the {@code parametersCountOutput} field. */
    @NativeType("uint32_t")
    public int parametersCountOutput() { return nparametersCountOutput(address()); }
    /** @return a {@link FloatBuffer} view of the data pointed to by the {@code parameters} field. */
    @NativeType("float *")
    public @Nullable FloatBuffer parameters() { return nparameters(address()); }
    /** @return the value of the {@code faceTrackingState} field. */
    @NativeType("XrFaceTrackingStateANDROID")
    public int faceTrackingState() { return nfaceTrackingState(address()); }
    /** @return the value of the {@code sampleTime} field. */
    @NativeType("XrTime")
    public long sampleTime() { return nsampleTime(address()); }
    /** @return the value of the {@code isValid} field. */
    @NativeType("XrBool32")
    public boolean isValid() { return nisValid(address()) != 0; }
    /** @return the value of the {@code regionConfidencesCapacityInput} field. */
    @NativeType("uint32_t")
    public int regionConfidencesCapacityInput() { return nregionConfidencesCapacityInput(address()); }
    /** @return the value of the {@code regionConfidencesCountOutput} field. */
    @NativeType("uint32_t")
    public int regionConfidencesCountOutput() { return nregionConfidencesCountOutput(address()); }
    /** @return a {@link FloatBuffer} view of the data pointed to by the {@code regionConfidences} field. */
    @NativeType("float *")
    public @Nullable FloatBuffer regionConfidences() { return nregionConfidences(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrFaceStateANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDFaceTracking#XR_TYPE_FACE_STATE_ANDROID TYPE_FACE_STATE_ANDROID} value to the {@code type} field. */
    public XrFaceStateANDROID type$Default() { return type(ANDROIDFaceTracking.XR_TYPE_FACE_STATE_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrFaceStateANDROID next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code parametersCapacityInput} field. */
    public XrFaceStateANDROID parametersCapacityInput(@NativeType("uint32_t") int value) { nparametersCapacityInput(address(), value); return this; }
    /** Sets the specified value to the {@code parametersCountOutput} field. */
    public XrFaceStateANDROID parametersCountOutput(@NativeType("uint32_t") int value) { nparametersCountOutput(address(), value); return this; }
    /** Sets the address of the specified {@link FloatBuffer} to the {@code parameters} field. */
    public XrFaceStateANDROID parameters(@Nullable @NativeType("float *") FloatBuffer value) { nparameters(address(), value); return this; }
    /** Sets the specified value to the {@code faceTrackingState} field. */
    public XrFaceStateANDROID faceTrackingState(@NativeType("XrFaceTrackingStateANDROID") int value) { nfaceTrackingState(address(), value); return this; }
    /** Sets the specified value to the {@code sampleTime} field. */
    public XrFaceStateANDROID sampleTime(@NativeType("XrTime") long value) { nsampleTime(address(), value); return this; }
    /** Sets the specified value to the {@code isValid} field. */
    public XrFaceStateANDROID isValid(@NativeType("XrBool32") boolean value) { nisValid(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code regionConfidencesCapacityInput} field. */
    public XrFaceStateANDROID regionConfidencesCapacityInput(@NativeType("uint32_t") int value) { nregionConfidencesCapacityInput(address(), value); return this; }
    /** Sets the specified value to the {@code regionConfidencesCountOutput} field. */
    public XrFaceStateANDROID regionConfidencesCountOutput(@NativeType("uint32_t") int value) { nregionConfidencesCountOutput(address(), value); return this; }
    /** Sets the address of the specified {@link FloatBuffer} to the {@code regionConfidences} field. */
    public XrFaceStateANDROID regionConfidences(@Nullable @NativeType("float *") FloatBuffer value) { nregionConfidences(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrFaceStateANDROID set(
        int type,
        long next,
        int parametersCapacityInput,
        int parametersCountOutput,
        @Nullable FloatBuffer parameters,
        int faceTrackingState,
        long sampleTime,
        boolean isValid,
        int regionConfidencesCapacityInput,
        int regionConfidencesCountOutput,
        @Nullable FloatBuffer regionConfidences
    ) {
        type(type);
        next(next);
        parametersCapacityInput(parametersCapacityInput);
        parametersCountOutput(parametersCountOutput);
        parameters(parameters);
        faceTrackingState(faceTrackingState);
        sampleTime(sampleTime);
        isValid(isValid);
        regionConfidencesCapacityInput(regionConfidencesCapacityInput);
        regionConfidencesCountOutput(regionConfidencesCountOutput);
        regionConfidences(regionConfidences);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrFaceStateANDROID set(XrFaceStateANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrFaceStateANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrFaceStateANDROID malloc() {
        return new XrFaceStateANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrFaceStateANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrFaceStateANDROID calloc() {
        return new XrFaceStateANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrFaceStateANDROID} instance allocated with {@link BufferUtils}. */
    public static XrFaceStateANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrFaceStateANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrFaceStateANDROID} instance for the specified memory address. */
    public static XrFaceStateANDROID create(long address) {
        return new XrFaceStateANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrFaceStateANDROID createSafe(long address) {
        return address == NULL ? null : new XrFaceStateANDROID(address, null);
    }

    /**
     * Returns a new {@link XrFaceStateANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFaceStateANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrFaceStateANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFaceStateANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFaceStateANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrFaceStateANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrFaceStateANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrFaceStateANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrFaceStateANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrFaceStateANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFaceStateANDROID malloc(MemoryStack stack) {
        return new XrFaceStateANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrFaceStateANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFaceStateANDROID calloc(MemoryStack stack) {
        return new XrFaceStateANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrFaceStateANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFaceStateANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFaceStateANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFaceStateANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrFaceStateANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrFaceStateANDROID.NEXT); }
    /** Unsafe version of {@link #parametersCapacityInput}. */
    public static int nparametersCapacityInput(long struct) { return memGetInt(struct + XrFaceStateANDROID.PARAMETERSCAPACITYINPUT); }
    /** Unsafe version of {@link #parametersCountOutput}. */
    public static int nparametersCountOutput(long struct) { return memGetInt(struct + XrFaceStateANDROID.PARAMETERSCOUNTOUTPUT); }
    /** Unsafe version of {@link #parameters() parameters}. */
    public static @Nullable FloatBuffer nparameters(long struct) { return memFloatBufferSafe(memGetAddress(struct + XrFaceStateANDROID.PARAMETERS), nparametersCapacityInput(struct)); }
    /** Unsafe version of {@link #faceTrackingState}. */
    public static int nfaceTrackingState(long struct) { return memGetInt(struct + XrFaceStateANDROID.FACETRACKINGSTATE); }
    /** Unsafe version of {@link #sampleTime}. */
    public static long nsampleTime(long struct) { return memGetLong(struct + XrFaceStateANDROID.SAMPLETIME); }
    /** Unsafe version of {@link #isValid}. */
    public static int nisValid(long struct) { return memGetInt(struct + XrFaceStateANDROID.ISVALID); }
    /** Unsafe version of {@link #regionConfidencesCapacityInput}. */
    public static int nregionConfidencesCapacityInput(long struct) { return memGetInt(struct + XrFaceStateANDROID.REGIONCONFIDENCESCAPACITYINPUT); }
    /** Unsafe version of {@link #regionConfidencesCountOutput}. */
    public static int nregionConfidencesCountOutput(long struct) { return memGetInt(struct + XrFaceStateANDROID.REGIONCONFIDENCESCOUNTOUTPUT); }
    /** Unsafe version of {@link #regionConfidences() regionConfidences}. */
    public static @Nullable FloatBuffer nregionConfidences(long struct) { return memFloatBufferSafe(memGetAddress(struct + XrFaceStateANDROID.REGIONCONFIDENCES), nregionConfidencesCapacityInput(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrFaceStateANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrFaceStateANDROID.NEXT, value); }
    /** Sets the specified value to the {@code parametersCapacityInput} field of the specified {@code struct}. */
    public static void nparametersCapacityInput(long struct, int value) { memPutInt(struct + XrFaceStateANDROID.PARAMETERSCAPACITYINPUT, value); }
    /** Unsafe version of {@link #parametersCountOutput(int) parametersCountOutput}. */
    public static void nparametersCountOutput(long struct, int value) { memPutInt(struct + XrFaceStateANDROID.PARAMETERSCOUNTOUTPUT, value); }
    /** Unsafe version of {@link #parameters(FloatBuffer) parameters}. */
    public static void nparameters(long struct, @Nullable FloatBuffer value) { memPutAddress(struct + XrFaceStateANDROID.PARAMETERS, memAddressSafe(value)); if (value != null) { nparametersCapacityInput(struct, value.remaining()); } }
    /** Unsafe version of {@link #faceTrackingState(int) faceTrackingState}. */
    public static void nfaceTrackingState(long struct, int value) { memPutInt(struct + XrFaceStateANDROID.FACETRACKINGSTATE, value); }
    /** Unsafe version of {@link #sampleTime(long) sampleTime}. */
    public static void nsampleTime(long struct, long value) { memPutLong(struct + XrFaceStateANDROID.SAMPLETIME, value); }
    /** Unsafe version of {@link #isValid(boolean) isValid}. */
    public static void nisValid(long struct, int value) { memPutInt(struct + XrFaceStateANDROID.ISVALID, value); }
    /** Sets the specified value to the {@code regionConfidencesCapacityInput} field of the specified {@code struct}. */
    public static void nregionConfidencesCapacityInput(long struct, int value) { memPutInt(struct + XrFaceStateANDROID.REGIONCONFIDENCESCAPACITYINPUT, value); }
    /** Unsafe version of {@link #regionConfidencesCountOutput(int) regionConfidencesCountOutput}. */
    public static void nregionConfidencesCountOutput(long struct, int value) { memPutInt(struct + XrFaceStateANDROID.REGIONCONFIDENCESCOUNTOUTPUT, value); }
    /** Unsafe version of {@link #regionConfidences(FloatBuffer) regionConfidences}. */
    public static void nregionConfidences(long struct, @Nullable FloatBuffer value) { memPutAddress(struct + XrFaceStateANDROID.REGIONCONFIDENCES, memAddressSafe(value)); if (value != null) { nregionConfidencesCapacityInput(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link XrFaceStateANDROID} structs. */
    public static class Buffer extends StructBuffer<XrFaceStateANDROID, Buffer> implements NativeResource {

        private static final XrFaceStateANDROID ELEMENT_FACTORY = XrFaceStateANDROID.create(-1L);

        /**
         * Creates a new {@code XrFaceStateANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrFaceStateANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrFaceStateANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrFaceStateANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrFaceStateANDROID.nnext(address()); }
        /** @return the value of the {@code parametersCapacityInput} field. */
        @NativeType("uint32_t")
        public int parametersCapacityInput() { return XrFaceStateANDROID.nparametersCapacityInput(address()); }
        /** @return the value of the {@code parametersCountOutput} field. */
        @NativeType("uint32_t")
        public int parametersCountOutput() { return XrFaceStateANDROID.nparametersCountOutput(address()); }
        /** @return a {@link FloatBuffer} view of the data pointed to by the {@code parameters} field. */
        @NativeType("float *")
        public @Nullable FloatBuffer parameters() { return XrFaceStateANDROID.nparameters(address()); }
        /** @return the value of the {@code faceTrackingState} field. */
        @NativeType("XrFaceTrackingStateANDROID")
        public int faceTrackingState() { return XrFaceStateANDROID.nfaceTrackingState(address()); }
        /** @return the value of the {@code sampleTime} field. */
        @NativeType("XrTime")
        public long sampleTime() { return XrFaceStateANDROID.nsampleTime(address()); }
        /** @return the value of the {@code isValid} field. */
        @NativeType("XrBool32")
        public boolean isValid() { return XrFaceStateANDROID.nisValid(address()) != 0; }
        /** @return the value of the {@code regionConfidencesCapacityInput} field. */
        @NativeType("uint32_t")
        public int regionConfidencesCapacityInput() { return XrFaceStateANDROID.nregionConfidencesCapacityInput(address()); }
        /** @return the value of the {@code regionConfidencesCountOutput} field. */
        @NativeType("uint32_t")
        public int regionConfidencesCountOutput() { return XrFaceStateANDROID.nregionConfidencesCountOutput(address()); }
        /** @return a {@link FloatBuffer} view of the data pointed to by the {@code regionConfidences} field. */
        @NativeType("float *")
        public @Nullable FloatBuffer regionConfidences() { return XrFaceStateANDROID.nregionConfidences(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrFaceStateANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrFaceStateANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDFaceTracking#XR_TYPE_FACE_STATE_ANDROID TYPE_FACE_STATE_ANDROID} value to the {@code type} field. */
        public XrFaceStateANDROID.Buffer type$Default() { return type(ANDROIDFaceTracking.XR_TYPE_FACE_STATE_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrFaceStateANDROID.Buffer next(@NativeType("void *") long value) { XrFaceStateANDROID.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code parametersCapacityInput} field. */
        public XrFaceStateANDROID.Buffer parametersCapacityInput(@NativeType("uint32_t") int value) { XrFaceStateANDROID.nparametersCapacityInput(address(), value); return this; }
        /** Sets the specified value to the {@code parametersCountOutput} field. */
        public XrFaceStateANDROID.Buffer parametersCountOutput(@NativeType("uint32_t") int value) { XrFaceStateANDROID.nparametersCountOutput(address(), value); return this; }
        /** Sets the address of the specified {@link FloatBuffer} to the {@code parameters} field. */
        public XrFaceStateANDROID.Buffer parameters(@Nullable @NativeType("float *") FloatBuffer value) { XrFaceStateANDROID.nparameters(address(), value); return this; }
        /** Sets the specified value to the {@code faceTrackingState} field. */
        public XrFaceStateANDROID.Buffer faceTrackingState(@NativeType("XrFaceTrackingStateANDROID") int value) { XrFaceStateANDROID.nfaceTrackingState(address(), value); return this; }
        /** Sets the specified value to the {@code sampleTime} field. */
        public XrFaceStateANDROID.Buffer sampleTime(@NativeType("XrTime") long value) { XrFaceStateANDROID.nsampleTime(address(), value); return this; }
        /** Sets the specified value to the {@code isValid} field. */
        public XrFaceStateANDROID.Buffer isValid(@NativeType("XrBool32") boolean value) { XrFaceStateANDROID.nisValid(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code regionConfidencesCapacityInput} field. */
        public XrFaceStateANDROID.Buffer regionConfidencesCapacityInput(@NativeType("uint32_t") int value) { XrFaceStateANDROID.nregionConfidencesCapacityInput(address(), value); return this; }
        /** Sets the specified value to the {@code regionConfidencesCountOutput} field. */
        public XrFaceStateANDROID.Buffer regionConfidencesCountOutput(@NativeType("uint32_t") int value) { XrFaceStateANDROID.nregionConfidencesCountOutput(address(), value); return this; }
        /** Sets the address of the specified {@link FloatBuffer} to the {@code regionConfidences} field. */
        public XrFaceStateANDROID.Buffer regionConfidences(@Nullable @NativeType("float *") FloatBuffer value) { XrFaceStateANDROID.nregionConfidences(address(), value); return this; }

    }

}