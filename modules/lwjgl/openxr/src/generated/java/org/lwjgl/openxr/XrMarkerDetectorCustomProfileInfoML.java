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
 * struct XrMarkerDetectorCustomProfileInfoML {
 *     XrStructureType type;
 *     void const * next;
 *     XrMarkerDetectorFpsML fpsHint;
 *     XrMarkerDetectorResolutionML resolutionHint;
 *     XrMarkerDetectorCameraML cameraHint;
 *     XrMarkerDetectorCornerRefineMethodML cornerRefineMethod;
 *     XrBool32 useEdgeRefinement;
 *     XrMarkerDetectorFullAnalysisIntervalML fullAnalysisIntervalHint;
 * }}</pre>
 */
public class XrMarkerDetectorCustomProfileInfoML extends Struct<XrMarkerDetectorCustomProfileInfoML> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        FPSHINT,
        RESOLUTIONHINT,
        CAMERAHINT,
        CORNERREFINEMETHOD,
        USEEDGEREFINEMENT,
        FULLANALYSISINTERVALHINT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        FPSHINT = layout.offsetof(2);
        RESOLUTIONHINT = layout.offsetof(3);
        CAMERAHINT = layout.offsetof(4);
        CORNERREFINEMETHOD = layout.offsetof(5);
        USEEDGEREFINEMENT = layout.offsetof(6);
        FULLANALYSISINTERVALHINT = layout.offsetof(7);
    }

    protected XrMarkerDetectorCustomProfileInfoML(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrMarkerDetectorCustomProfileInfoML create(long address, @Nullable ByteBuffer container) {
        return new XrMarkerDetectorCustomProfileInfoML(address, container);
    }

    /**
     * Creates a {@code XrMarkerDetectorCustomProfileInfoML} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrMarkerDetectorCustomProfileInfoML(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code fpsHint} field. */
    @NativeType("XrMarkerDetectorFpsML")
    public int fpsHint() { return nfpsHint(address()); }
    /** @return the value of the {@code resolutionHint} field. */
    @NativeType("XrMarkerDetectorResolutionML")
    public int resolutionHint() { return nresolutionHint(address()); }
    /** @return the value of the {@code cameraHint} field. */
    @NativeType("XrMarkerDetectorCameraML")
    public int cameraHint() { return ncameraHint(address()); }
    /** @return the value of the {@code cornerRefineMethod} field. */
    @NativeType("XrMarkerDetectorCornerRefineMethodML")
    public int cornerRefineMethod() { return ncornerRefineMethod(address()); }
    /** @return the value of the {@code useEdgeRefinement} field. */
    @NativeType("XrBool32")
    public boolean useEdgeRefinement() { return nuseEdgeRefinement(address()) != 0; }
    /** @return the value of the {@code fullAnalysisIntervalHint} field. */
    @NativeType("XrMarkerDetectorFullAnalysisIntervalML")
    public int fullAnalysisIntervalHint() { return nfullAnalysisIntervalHint(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrMarkerDetectorCustomProfileInfoML type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MLMarkerUnderstanding#XR_TYPE_MARKER_DETECTOR_CUSTOM_PROFILE_INFO_ML TYPE_MARKER_DETECTOR_CUSTOM_PROFILE_INFO_ML} value to the {@code type} field. */
    public XrMarkerDetectorCustomProfileInfoML type$Default() { return type(MLMarkerUnderstanding.XR_TYPE_MARKER_DETECTOR_CUSTOM_PROFILE_INFO_ML); }
    /** Sets the specified value to the {@code next} field. */
    public XrMarkerDetectorCustomProfileInfoML next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code fpsHint} field. */
    public XrMarkerDetectorCustomProfileInfoML fpsHint(@NativeType("XrMarkerDetectorFpsML") int value) { nfpsHint(address(), value); return this; }
    /** Sets the specified value to the {@code resolutionHint} field. */
    public XrMarkerDetectorCustomProfileInfoML resolutionHint(@NativeType("XrMarkerDetectorResolutionML") int value) { nresolutionHint(address(), value); return this; }
    /** Sets the specified value to the {@code cameraHint} field. */
    public XrMarkerDetectorCustomProfileInfoML cameraHint(@NativeType("XrMarkerDetectorCameraML") int value) { ncameraHint(address(), value); return this; }
    /** Sets the specified value to the {@code cornerRefineMethod} field. */
    public XrMarkerDetectorCustomProfileInfoML cornerRefineMethod(@NativeType("XrMarkerDetectorCornerRefineMethodML") int value) { ncornerRefineMethod(address(), value); return this; }
    /** Sets the specified value to the {@code useEdgeRefinement} field. */
    public XrMarkerDetectorCustomProfileInfoML useEdgeRefinement(@NativeType("XrBool32") boolean value) { nuseEdgeRefinement(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code fullAnalysisIntervalHint} field. */
    public XrMarkerDetectorCustomProfileInfoML fullAnalysisIntervalHint(@NativeType("XrMarkerDetectorFullAnalysisIntervalML") int value) { nfullAnalysisIntervalHint(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrMarkerDetectorCustomProfileInfoML set(
        int type,
        long next,
        int fpsHint,
        int resolutionHint,
        int cameraHint,
        int cornerRefineMethod,
        boolean useEdgeRefinement,
        int fullAnalysisIntervalHint
    ) {
        type(type);
        next(next);
        fpsHint(fpsHint);
        resolutionHint(resolutionHint);
        cameraHint(cameraHint);
        cornerRefineMethod(cornerRefineMethod);
        useEdgeRefinement(useEdgeRefinement);
        fullAnalysisIntervalHint(fullAnalysisIntervalHint);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrMarkerDetectorCustomProfileInfoML set(XrMarkerDetectorCustomProfileInfoML src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrMarkerDetectorCustomProfileInfoML} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrMarkerDetectorCustomProfileInfoML malloc() {
        return new XrMarkerDetectorCustomProfileInfoML(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrMarkerDetectorCustomProfileInfoML} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrMarkerDetectorCustomProfileInfoML calloc() {
        return new XrMarkerDetectorCustomProfileInfoML(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrMarkerDetectorCustomProfileInfoML} instance allocated with {@link BufferUtils}. */
    public static XrMarkerDetectorCustomProfileInfoML create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrMarkerDetectorCustomProfileInfoML(memAddress(container), container);
    }

    /** Returns a new {@code XrMarkerDetectorCustomProfileInfoML} instance for the specified memory address. */
    public static XrMarkerDetectorCustomProfileInfoML create(long address) {
        return new XrMarkerDetectorCustomProfileInfoML(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrMarkerDetectorCustomProfileInfoML createSafe(long address) {
        return address == NULL ? null : new XrMarkerDetectorCustomProfileInfoML(address, null);
    }

    /**
     * Returns a new {@link XrMarkerDetectorCustomProfileInfoML.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrMarkerDetectorCustomProfileInfoML.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrMarkerDetectorCustomProfileInfoML.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrMarkerDetectorCustomProfileInfoML.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrMarkerDetectorCustomProfileInfoML.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrMarkerDetectorCustomProfileInfoML.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrMarkerDetectorCustomProfileInfoML.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrMarkerDetectorCustomProfileInfoML.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrMarkerDetectorCustomProfileInfoML.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrMarkerDetectorCustomProfileInfoML} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrMarkerDetectorCustomProfileInfoML malloc(MemoryStack stack) {
        return new XrMarkerDetectorCustomProfileInfoML(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrMarkerDetectorCustomProfileInfoML} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrMarkerDetectorCustomProfileInfoML calloc(MemoryStack stack) {
        return new XrMarkerDetectorCustomProfileInfoML(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrMarkerDetectorCustomProfileInfoML.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrMarkerDetectorCustomProfileInfoML.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrMarkerDetectorCustomProfileInfoML.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrMarkerDetectorCustomProfileInfoML.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrMarkerDetectorCustomProfileInfoML.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrMarkerDetectorCustomProfileInfoML.NEXT); }
    /** Unsafe version of {@link #fpsHint}. */
    public static int nfpsHint(long struct) { return memGetInt(struct + XrMarkerDetectorCustomProfileInfoML.FPSHINT); }
    /** Unsafe version of {@link #resolutionHint}. */
    public static int nresolutionHint(long struct) { return memGetInt(struct + XrMarkerDetectorCustomProfileInfoML.RESOLUTIONHINT); }
    /** Unsafe version of {@link #cameraHint}. */
    public static int ncameraHint(long struct) { return memGetInt(struct + XrMarkerDetectorCustomProfileInfoML.CAMERAHINT); }
    /** Unsafe version of {@link #cornerRefineMethod}. */
    public static int ncornerRefineMethod(long struct) { return memGetInt(struct + XrMarkerDetectorCustomProfileInfoML.CORNERREFINEMETHOD); }
    /** Unsafe version of {@link #useEdgeRefinement}. */
    public static int nuseEdgeRefinement(long struct) { return memGetInt(struct + XrMarkerDetectorCustomProfileInfoML.USEEDGEREFINEMENT); }
    /** Unsafe version of {@link #fullAnalysisIntervalHint}. */
    public static int nfullAnalysisIntervalHint(long struct) { return memGetInt(struct + XrMarkerDetectorCustomProfileInfoML.FULLANALYSISINTERVALHINT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrMarkerDetectorCustomProfileInfoML.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrMarkerDetectorCustomProfileInfoML.NEXT, value); }
    /** Unsafe version of {@link #fpsHint(int) fpsHint}. */
    public static void nfpsHint(long struct, int value) { memPutInt(struct + XrMarkerDetectorCustomProfileInfoML.FPSHINT, value); }
    /** Unsafe version of {@link #resolutionHint(int) resolutionHint}. */
    public static void nresolutionHint(long struct, int value) { memPutInt(struct + XrMarkerDetectorCustomProfileInfoML.RESOLUTIONHINT, value); }
    /** Unsafe version of {@link #cameraHint(int) cameraHint}. */
    public static void ncameraHint(long struct, int value) { memPutInt(struct + XrMarkerDetectorCustomProfileInfoML.CAMERAHINT, value); }
    /** Unsafe version of {@link #cornerRefineMethod(int) cornerRefineMethod}. */
    public static void ncornerRefineMethod(long struct, int value) { memPutInt(struct + XrMarkerDetectorCustomProfileInfoML.CORNERREFINEMETHOD, value); }
    /** Unsafe version of {@link #useEdgeRefinement(boolean) useEdgeRefinement}. */
    public static void nuseEdgeRefinement(long struct, int value) { memPutInt(struct + XrMarkerDetectorCustomProfileInfoML.USEEDGEREFINEMENT, value); }
    /** Unsafe version of {@link #fullAnalysisIntervalHint(int) fullAnalysisIntervalHint}. */
    public static void nfullAnalysisIntervalHint(long struct, int value) { memPutInt(struct + XrMarkerDetectorCustomProfileInfoML.FULLANALYSISINTERVALHINT, value); }

    // -----------------------------------

    /** An array of {@link XrMarkerDetectorCustomProfileInfoML} structs. */
    public static class Buffer extends StructBuffer<XrMarkerDetectorCustomProfileInfoML, Buffer> implements NativeResource {

        private static final XrMarkerDetectorCustomProfileInfoML ELEMENT_FACTORY = XrMarkerDetectorCustomProfileInfoML.create(-1L);

        /**
         * Creates a new {@code XrMarkerDetectorCustomProfileInfoML.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrMarkerDetectorCustomProfileInfoML#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrMarkerDetectorCustomProfileInfoML getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrMarkerDetectorCustomProfileInfoML.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrMarkerDetectorCustomProfileInfoML.nnext(address()); }
        /** @return the value of the {@code fpsHint} field. */
        @NativeType("XrMarkerDetectorFpsML")
        public int fpsHint() { return XrMarkerDetectorCustomProfileInfoML.nfpsHint(address()); }
        /** @return the value of the {@code resolutionHint} field. */
        @NativeType("XrMarkerDetectorResolutionML")
        public int resolutionHint() { return XrMarkerDetectorCustomProfileInfoML.nresolutionHint(address()); }
        /** @return the value of the {@code cameraHint} field. */
        @NativeType("XrMarkerDetectorCameraML")
        public int cameraHint() { return XrMarkerDetectorCustomProfileInfoML.ncameraHint(address()); }
        /** @return the value of the {@code cornerRefineMethod} field. */
        @NativeType("XrMarkerDetectorCornerRefineMethodML")
        public int cornerRefineMethod() { return XrMarkerDetectorCustomProfileInfoML.ncornerRefineMethod(address()); }
        /** @return the value of the {@code useEdgeRefinement} field. */
        @NativeType("XrBool32")
        public boolean useEdgeRefinement() { return XrMarkerDetectorCustomProfileInfoML.nuseEdgeRefinement(address()) != 0; }
        /** @return the value of the {@code fullAnalysisIntervalHint} field. */
        @NativeType("XrMarkerDetectorFullAnalysisIntervalML")
        public int fullAnalysisIntervalHint() { return XrMarkerDetectorCustomProfileInfoML.nfullAnalysisIntervalHint(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrMarkerDetectorCustomProfileInfoML.Buffer type(@NativeType("XrStructureType") int value) { XrMarkerDetectorCustomProfileInfoML.ntype(address(), value); return this; }
        /** Sets the {@link MLMarkerUnderstanding#XR_TYPE_MARKER_DETECTOR_CUSTOM_PROFILE_INFO_ML TYPE_MARKER_DETECTOR_CUSTOM_PROFILE_INFO_ML} value to the {@code type} field. */
        public XrMarkerDetectorCustomProfileInfoML.Buffer type$Default() { return type(MLMarkerUnderstanding.XR_TYPE_MARKER_DETECTOR_CUSTOM_PROFILE_INFO_ML); }
        /** Sets the specified value to the {@code next} field. */
        public XrMarkerDetectorCustomProfileInfoML.Buffer next(@NativeType("void const *") long value) { XrMarkerDetectorCustomProfileInfoML.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code fpsHint} field. */
        public XrMarkerDetectorCustomProfileInfoML.Buffer fpsHint(@NativeType("XrMarkerDetectorFpsML") int value) { XrMarkerDetectorCustomProfileInfoML.nfpsHint(address(), value); return this; }
        /** Sets the specified value to the {@code resolutionHint} field. */
        public XrMarkerDetectorCustomProfileInfoML.Buffer resolutionHint(@NativeType("XrMarkerDetectorResolutionML") int value) { XrMarkerDetectorCustomProfileInfoML.nresolutionHint(address(), value); return this; }
        /** Sets the specified value to the {@code cameraHint} field. */
        public XrMarkerDetectorCustomProfileInfoML.Buffer cameraHint(@NativeType("XrMarkerDetectorCameraML") int value) { XrMarkerDetectorCustomProfileInfoML.ncameraHint(address(), value); return this; }
        /** Sets the specified value to the {@code cornerRefineMethod} field. */
        public XrMarkerDetectorCustomProfileInfoML.Buffer cornerRefineMethod(@NativeType("XrMarkerDetectorCornerRefineMethodML") int value) { XrMarkerDetectorCustomProfileInfoML.ncornerRefineMethod(address(), value); return this; }
        /** Sets the specified value to the {@code useEdgeRefinement} field. */
        public XrMarkerDetectorCustomProfileInfoML.Buffer useEdgeRefinement(@NativeType("XrBool32") boolean value) { XrMarkerDetectorCustomProfileInfoML.nuseEdgeRefinement(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code fullAnalysisIntervalHint} field. */
        public XrMarkerDetectorCustomProfileInfoML.Buffer fullAnalysisIntervalHint(@NativeType("XrMarkerDetectorFullAnalysisIntervalML") int value) { XrMarkerDetectorCustomProfileInfoML.nfullAnalysisIntervalHint(address(), value); return this; }

    }

}