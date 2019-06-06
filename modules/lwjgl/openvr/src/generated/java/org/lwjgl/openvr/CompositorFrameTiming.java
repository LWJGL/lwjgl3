/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Provides a single frame's timing information to the app.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code m_nSize} &ndash; Set to {@code sizeof( Compositor_FrameTiming )}</li>
 * <li>{@code m_nNumFramePresents} &ndash; number of times this frame was presented</li>
 * <li>{@code m_nNumMisPresented} &ndash; number of times this frame was presented on a vsync other than it was originally predicted to</li>
 * <li>{@code m_nNumDroppedFrames} &ndash; number of additional times previous frame was scanned out</li>
 * <li>{@code m_flSystemTimeInSeconds} &ndash; Absolute time reference for comparing frames. This aligns with the vsync that running start is relative to.</li>
 * <li>{@code m_flPreSubmitGpuMs} &ndash; time spent rendering the scene (gpu work submitted between WaitGetPoses and second Submit)</li>
 * <li>{@code m_flPostSubmitGpuMs} &ndash; additional time spent rendering by application (e.g. companion window)</li>
 * <li>{@code m_flTotalRenderGpuMs} &ndash; time between work submitted immediately after present (ideally vsync) until the end of compositor submitted work</li>
 * <li>{@code m_flCompositorRenderGpuMs} &ndash; time spend performing distortion correction, rendering chaperone, overlays, etc.</li>
 * <li>{@code m_flCompositorRenderCpuMs} &ndash; time spent on cpu submitting the above work for this frame</li>
 * <li>{@code m_flCompositorIdleCpuMs} &ndash; time spent waiting for running start (application could have used this much more time)</li>
 * <li>{@code m_flClientFrameIntervalMs} &ndash; time between calls to {@link VRCompositor#VRCompositor_WaitGetPoses WaitGetPoses}</li>
 * <li>{@code m_flPresentCallCpuMs} &ndash; time blocked on call to present (usually 0.0, but can go long)</li>
 * <li>{@code m_flWaitForPresentCpuMs} &ndash; time spent spin-waiting for frame index to change (not near-zero indicates wait object failure)</li>
 * <li>{@code m_flSubmitFrameMs} &ndash; time spent in {@link VRCompositor#VRCompositor_Submit Submit} (not near-zero indicates driver issue)</li>
 * <li>{@code m_flNewFrameReadyMs} &ndash; second call to {@link VRCompositor#VRCompositor_Submit Submit}</li>
 * <li>{@code m_HmdPose} &ndash; pose used by app to render this frame</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct Compositor_FrameTiming {
 *     uint32_t m_nSize;
 *     uint32_t m_nFrameIndex;
 *     uint32_t m_nNumFramePresents;
 *     uint32_t m_nNumMisPresented;
 *     uint32_t m_nNumDroppedFrames;
 *     uint32_t m_nReprojectionFlags;
 *     double m_flSystemTimeInSeconds;
 *     float m_flPreSubmitGpuMs;
 *     float m_flPostSubmitGpuMs;
 *     float m_flTotalRenderGpuMs;
 *     float m_flCompositorRenderGpuMs;
 *     float m_flCompositorRenderCpuMs;
 *     float m_flCompositorIdleCpuMs;
 *     float m_flClientFrameIntervalMs;
 *     float m_flPresentCallCpuMs;
 *     float m_flWaitForPresentCpuMs;
 *     float m_flSubmitFrameMs;
 *     float m_flWaitGetPosesCalledMs;
 *     float m_flNewPosesReadyMs;
 *     float m_flNewFrameReadyMs;
 *     float m_flCompositorUpdateStartMs;
 *     float m_flCompositorUpdateEndMs;
 *     float m_flCompositorRenderStartMs;
 *     {@link TrackedDevicePose TrackedDevicePose_t} m_HmdPose;
 *     uint32_t m_nNumVSyncsReadyForUse;
 *     uint32_t m_nNumVSyncsToFirstView;
 * }</code></pre>
 */
@NativeType("struct Compositor_FrameTiming")
public class CompositorFrameTiming extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        M_NSIZE,
        M_NFRAMEINDEX,
        M_NNUMFRAMEPRESENTS,
        M_NNUMMISPRESENTED,
        M_NNUMDROPPEDFRAMES,
        M_NREPROJECTIONFLAGS,
        M_FLSYSTEMTIMEINSECONDS,
        M_FLPRESUBMITGPUMS,
        M_FLPOSTSUBMITGPUMS,
        M_FLTOTALRENDERGPUMS,
        M_FLCOMPOSITORRENDERGPUMS,
        M_FLCOMPOSITORRENDERCPUMS,
        M_FLCOMPOSITORIDLECPUMS,
        M_FLCLIENTFRAMEINTERVALMS,
        M_FLPRESENTCALLCPUMS,
        M_FLWAITFORPRESENTCPUMS,
        M_FLSUBMITFRAMEMS,
        M_FLWAITGETPOSESCALLEDMS,
        M_FLNEWPOSESREADYMS,
        M_FLNEWFRAMEREADYMS,
        M_FLCOMPOSITORUPDATESTARTMS,
        M_FLCOMPOSITORUPDATEENDMS,
        M_FLCOMPOSITORRENDERSTARTMS,
        M_HMDPOSE,
        M_NNUMVSYNCSREADYFORUSE,
        M_NNUMVSYNCSTOFIRSTVIEW;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(8),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(TrackedDevicePose.SIZEOF, TrackedDevicePose.ALIGNOF),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        M_NSIZE = layout.offsetof(0);
        M_NFRAMEINDEX = layout.offsetof(1);
        M_NNUMFRAMEPRESENTS = layout.offsetof(2);
        M_NNUMMISPRESENTED = layout.offsetof(3);
        M_NNUMDROPPEDFRAMES = layout.offsetof(4);
        M_NREPROJECTIONFLAGS = layout.offsetof(5);
        M_FLSYSTEMTIMEINSECONDS = layout.offsetof(6);
        M_FLPRESUBMITGPUMS = layout.offsetof(7);
        M_FLPOSTSUBMITGPUMS = layout.offsetof(8);
        M_FLTOTALRENDERGPUMS = layout.offsetof(9);
        M_FLCOMPOSITORRENDERGPUMS = layout.offsetof(10);
        M_FLCOMPOSITORRENDERCPUMS = layout.offsetof(11);
        M_FLCOMPOSITORIDLECPUMS = layout.offsetof(12);
        M_FLCLIENTFRAMEINTERVALMS = layout.offsetof(13);
        M_FLPRESENTCALLCPUMS = layout.offsetof(14);
        M_FLWAITFORPRESENTCPUMS = layout.offsetof(15);
        M_FLSUBMITFRAMEMS = layout.offsetof(16);
        M_FLWAITGETPOSESCALLEDMS = layout.offsetof(17);
        M_FLNEWPOSESREADYMS = layout.offsetof(18);
        M_FLNEWFRAMEREADYMS = layout.offsetof(19);
        M_FLCOMPOSITORUPDATESTARTMS = layout.offsetof(20);
        M_FLCOMPOSITORUPDATEENDMS = layout.offsetof(21);
        M_FLCOMPOSITORRENDERSTARTMS = layout.offsetof(22);
        M_HMDPOSE = layout.offsetof(23);
        M_NNUMVSYNCSREADYFORUSE = layout.offsetof(24);
        M_NNUMVSYNCSTOFIRSTVIEW = layout.offsetof(25);
    }

    /**
     * Creates a {@code CompositorFrameTiming} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CompositorFrameTiming(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code m_nSize} field. */
    @NativeType("uint32_t")
    public int m_nSize() { return nm_nSize(address()); }
    /** Returns the value of the {@code m_nFrameIndex} field. */
    @NativeType("uint32_t")
    public int m_nFrameIndex() { return nm_nFrameIndex(address()); }
    /** Returns the value of the {@code m_nNumFramePresents} field. */
    @NativeType("uint32_t")
    public int m_nNumFramePresents() { return nm_nNumFramePresents(address()); }
    /** Returns the value of the {@code m_nNumMisPresented} field. */
    @NativeType("uint32_t")
    public int m_nNumMisPresented() { return nm_nNumMisPresented(address()); }
    /** Returns the value of the {@code m_nNumDroppedFrames} field. */
    @NativeType("uint32_t")
    public int m_nNumDroppedFrames() { return nm_nNumDroppedFrames(address()); }
    /** Returns the value of the {@code m_nReprojectionFlags} field. */
    @NativeType("uint32_t")
    public int m_nReprojectionFlags() { return nm_nReprojectionFlags(address()); }
    /** Returns the value of the {@code m_flSystemTimeInSeconds} field. */
    public double m_flSystemTimeInSeconds() { return nm_flSystemTimeInSeconds(address()); }
    /** Returns the value of the {@code m_flPreSubmitGpuMs} field. */
    public float m_flPreSubmitGpuMs() { return nm_flPreSubmitGpuMs(address()); }
    /** Returns the value of the {@code m_flPostSubmitGpuMs} field. */
    public float m_flPostSubmitGpuMs() { return nm_flPostSubmitGpuMs(address()); }
    /** Returns the value of the {@code m_flTotalRenderGpuMs} field. */
    public float m_flTotalRenderGpuMs() { return nm_flTotalRenderGpuMs(address()); }
    /** Returns the value of the {@code m_flCompositorRenderGpuMs} field. */
    public float m_flCompositorRenderGpuMs() { return nm_flCompositorRenderGpuMs(address()); }
    /** Returns the value of the {@code m_flCompositorRenderCpuMs} field. */
    public float m_flCompositorRenderCpuMs() { return nm_flCompositorRenderCpuMs(address()); }
    /** Returns the value of the {@code m_flCompositorIdleCpuMs} field. */
    public float m_flCompositorIdleCpuMs() { return nm_flCompositorIdleCpuMs(address()); }
    /** Returns the value of the {@code m_flClientFrameIntervalMs} field. */
    public float m_flClientFrameIntervalMs() { return nm_flClientFrameIntervalMs(address()); }
    /** Returns the value of the {@code m_flPresentCallCpuMs} field. */
    public float m_flPresentCallCpuMs() { return nm_flPresentCallCpuMs(address()); }
    /** Returns the value of the {@code m_flWaitForPresentCpuMs} field. */
    public float m_flWaitForPresentCpuMs() { return nm_flWaitForPresentCpuMs(address()); }
    /** Returns the value of the {@code m_flSubmitFrameMs} field. */
    public float m_flSubmitFrameMs() { return nm_flSubmitFrameMs(address()); }
    /** Returns the value of the {@code m_flWaitGetPosesCalledMs} field. */
    public float m_flWaitGetPosesCalledMs() { return nm_flWaitGetPosesCalledMs(address()); }
    /** Returns the value of the {@code m_flNewPosesReadyMs} field. */
    public float m_flNewPosesReadyMs() { return nm_flNewPosesReadyMs(address()); }
    /** Returns the value of the {@code m_flNewFrameReadyMs} field. */
    public float m_flNewFrameReadyMs() { return nm_flNewFrameReadyMs(address()); }
    /** Returns the value of the {@code m_flCompositorUpdateStartMs} field. */
    public float m_flCompositorUpdateStartMs() { return nm_flCompositorUpdateStartMs(address()); }
    /** Returns the value of the {@code m_flCompositorUpdateEndMs} field. */
    public float m_flCompositorUpdateEndMs() { return nm_flCompositorUpdateEndMs(address()); }
    /** Returns the value of the {@code m_flCompositorRenderStartMs} field. */
    public float m_flCompositorRenderStartMs() { return nm_flCompositorRenderStartMs(address()); }
    /** Returns a {@link TrackedDevicePose} view of the {@code m_HmdPose} field. */
    @NativeType("TrackedDevicePose_t")
    public TrackedDevicePose m_HmdPose() { return nm_HmdPose(address()); }
    /** Returns the value of the {@code m_nNumVSyncsReadyForUse} field. */
    @NativeType("uint32_t")
    public int m_nNumVSyncsReadyForUse() { return nm_nNumVSyncsReadyForUse(address()); }
    /** Returns the value of the {@code m_nNumVSyncsToFirstView} field. */
    @NativeType("uint32_t")
    public int m_nNumVSyncsToFirstView() { return nm_nNumVSyncsToFirstView(address()); }

    // -----------------------------------

    /** Returns a new {@code CompositorFrameTiming} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CompositorFrameTiming malloc() {
        return wrap(CompositorFrameTiming.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code CompositorFrameTiming} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CompositorFrameTiming calloc() {
        return wrap(CompositorFrameTiming.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code CompositorFrameTiming} instance allocated with {@link BufferUtils}. */
    public static CompositorFrameTiming create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(CompositorFrameTiming.class, memAddress(container), container);
    }

    /** Returns a new {@code CompositorFrameTiming} instance for the specified memory address. */
    public static CompositorFrameTiming create(long address) {
        return wrap(CompositorFrameTiming.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CompositorFrameTiming createSafe(long address) {
        return address == NULL ? null : wrap(CompositorFrameTiming.class, address);
    }

    /**
     * Returns a new {@link CompositorFrameTiming.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CompositorFrameTiming.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CompositorFrameTiming.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CompositorFrameTiming.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CompositorFrameTiming.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CompositorFrameTiming.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link CompositorFrameTiming.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CompositorFrameTiming.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CompositorFrameTiming.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code CompositorFrameTiming} instance allocated on the thread-local {@link MemoryStack}. */
    public static CompositorFrameTiming mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code CompositorFrameTiming} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static CompositorFrameTiming callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code CompositorFrameTiming} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CompositorFrameTiming mallocStack(MemoryStack stack) {
        return wrap(CompositorFrameTiming.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code CompositorFrameTiming} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CompositorFrameTiming callocStack(MemoryStack stack) {
        return wrap(CompositorFrameTiming.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link CompositorFrameTiming.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static CompositorFrameTiming.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link CompositorFrameTiming.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static CompositorFrameTiming.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link CompositorFrameTiming.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CompositorFrameTiming.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CompositorFrameTiming.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CompositorFrameTiming.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #m_nSize}. */
    public static int nm_nSize(long struct) { return UNSAFE.getInt(null, struct + CompositorFrameTiming.M_NSIZE); }
    /** Unsafe version of {@link #m_nFrameIndex}. */
    public static int nm_nFrameIndex(long struct) { return UNSAFE.getInt(null, struct + CompositorFrameTiming.M_NFRAMEINDEX); }
    /** Unsafe version of {@link #m_nNumFramePresents}. */
    public static int nm_nNumFramePresents(long struct) { return UNSAFE.getInt(null, struct + CompositorFrameTiming.M_NNUMFRAMEPRESENTS); }
    /** Unsafe version of {@link #m_nNumMisPresented}. */
    public static int nm_nNumMisPresented(long struct) { return UNSAFE.getInt(null, struct + CompositorFrameTiming.M_NNUMMISPRESENTED); }
    /** Unsafe version of {@link #m_nNumDroppedFrames}. */
    public static int nm_nNumDroppedFrames(long struct) { return UNSAFE.getInt(null, struct + CompositorFrameTiming.M_NNUMDROPPEDFRAMES); }
    /** Unsafe version of {@link #m_nReprojectionFlags}. */
    public static int nm_nReprojectionFlags(long struct) { return UNSAFE.getInt(null, struct + CompositorFrameTiming.M_NREPROJECTIONFLAGS); }
    /** Unsafe version of {@link #m_flSystemTimeInSeconds}. */
    public static double nm_flSystemTimeInSeconds(long struct) { return UNSAFE.getDouble(null, struct + CompositorFrameTiming.M_FLSYSTEMTIMEINSECONDS); }
    /** Unsafe version of {@link #m_flPreSubmitGpuMs}. */
    public static float nm_flPreSubmitGpuMs(long struct) { return UNSAFE.getFloat(null, struct + CompositorFrameTiming.M_FLPRESUBMITGPUMS); }
    /** Unsafe version of {@link #m_flPostSubmitGpuMs}. */
    public static float nm_flPostSubmitGpuMs(long struct) { return UNSAFE.getFloat(null, struct + CompositorFrameTiming.M_FLPOSTSUBMITGPUMS); }
    /** Unsafe version of {@link #m_flTotalRenderGpuMs}. */
    public static float nm_flTotalRenderGpuMs(long struct) { return UNSAFE.getFloat(null, struct + CompositorFrameTiming.M_FLTOTALRENDERGPUMS); }
    /** Unsafe version of {@link #m_flCompositorRenderGpuMs}. */
    public static float nm_flCompositorRenderGpuMs(long struct) { return UNSAFE.getFloat(null, struct + CompositorFrameTiming.M_FLCOMPOSITORRENDERGPUMS); }
    /** Unsafe version of {@link #m_flCompositorRenderCpuMs}. */
    public static float nm_flCompositorRenderCpuMs(long struct) { return UNSAFE.getFloat(null, struct + CompositorFrameTiming.M_FLCOMPOSITORRENDERCPUMS); }
    /** Unsafe version of {@link #m_flCompositorIdleCpuMs}. */
    public static float nm_flCompositorIdleCpuMs(long struct) { return UNSAFE.getFloat(null, struct + CompositorFrameTiming.M_FLCOMPOSITORIDLECPUMS); }
    /** Unsafe version of {@link #m_flClientFrameIntervalMs}. */
    public static float nm_flClientFrameIntervalMs(long struct) { return UNSAFE.getFloat(null, struct + CompositorFrameTiming.M_FLCLIENTFRAMEINTERVALMS); }
    /** Unsafe version of {@link #m_flPresentCallCpuMs}. */
    public static float nm_flPresentCallCpuMs(long struct) { return UNSAFE.getFloat(null, struct + CompositorFrameTiming.M_FLPRESENTCALLCPUMS); }
    /** Unsafe version of {@link #m_flWaitForPresentCpuMs}. */
    public static float nm_flWaitForPresentCpuMs(long struct) { return UNSAFE.getFloat(null, struct + CompositorFrameTiming.M_FLWAITFORPRESENTCPUMS); }
    /** Unsafe version of {@link #m_flSubmitFrameMs}. */
    public static float nm_flSubmitFrameMs(long struct) { return UNSAFE.getFloat(null, struct + CompositorFrameTiming.M_FLSUBMITFRAMEMS); }
    /** Unsafe version of {@link #m_flWaitGetPosesCalledMs}. */
    public static float nm_flWaitGetPosesCalledMs(long struct) { return UNSAFE.getFloat(null, struct + CompositorFrameTiming.M_FLWAITGETPOSESCALLEDMS); }
    /** Unsafe version of {@link #m_flNewPosesReadyMs}. */
    public static float nm_flNewPosesReadyMs(long struct) { return UNSAFE.getFloat(null, struct + CompositorFrameTiming.M_FLNEWPOSESREADYMS); }
    /** Unsafe version of {@link #m_flNewFrameReadyMs}. */
    public static float nm_flNewFrameReadyMs(long struct) { return UNSAFE.getFloat(null, struct + CompositorFrameTiming.M_FLNEWFRAMEREADYMS); }
    /** Unsafe version of {@link #m_flCompositorUpdateStartMs}. */
    public static float nm_flCompositorUpdateStartMs(long struct) { return UNSAFE.getFloat(null, struct + CompositorFrameTiming.M_FLCOMPOSITORUPDATESTARTMS); }
    /** Unsafe version of {@link #m_flCompositorUpdateEndMs}. */
    public static float nm_flCompositorUpdateEndMs(long struct) { return UNSAFE.getFloat(null, struct + CompositorFrameTiming.M_FLCOMPOSITORUPDATEENDMS); }
    /** Unsafe version of {@link #m_flCompositorRenderStartMs}. */
    public static float nm_flCompositorRenderStartMs(long struct) { return UNSAFE.getFloat(null, struct + CompositorFrameTiming.M_FLCOMPOSITORRENDERSTARTMS); }
    /** Unsafe version of {@link #m_HmdPose}. */
    public static TrackedDevicePose nm_HmdPose(long struct) { return TrackedDevicePose.create(struct + CompositorFrameTiming.M_HMDPOSE); }
    /** Unsafe version of {@link #m_nNumVSyncsReadyForUse}. */
    public static int nm_nNumVSyncsReadyForUse(long struct) { return UNSAFE.getInt(null, struct + CompositorFrameTiming.M_NNUMVSYNCSREADYFORUSE); }
    /** Unsafe version of {@link #m_nNumVSyncsToFirstView}. */
    public static int nm_nNumVSyncsToFirstView(long struct) { return UNSAFE.getInt(null, struct + CompositorFrameTiming.M_NNUMVSYNCSTOFIRSTVIEW); }

    // -----------------------------------

    /** An array of {@link CompositorFrameTiming} structs. */
    public static class Buffer extends StructBuffer<CompositorFrameTiming, Buffer> implements NativeResource {

        private static final CompositorFrameTiming ELEMENT_FACTORY = CompositorFrameTiming.create(-1L);

        /**
         * Creates a new {@code CompositorFrameTiming.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CompositorFrameTiming#SIZEOF}, and its mark will be undefined.
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
        protected CompositorFrameTiming getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code m_nSize} field. */
        @NativeType("uint32_t")
        public int m_nSize() { return CompositorFrameTiming.nm_nSize(address()); }
        /** Returns the value of the {@code m_nFrameIndex} field. */
        @NativeType("uint32_t")
        public int m_nFrameIndex() { return CompositorFrameTiming.nm_nFrameIndex(address()); }
        /** Returns the value of the {@code m_nNumFramePresents} field. */
        @NativeType("uint32_t")
        public int m_nNumFramePresents() { return CompositorFrameTiming.nm_nNumFramePresents(address()); }
        /** Returns the value of the {@code m_nNumMisPresented} field. */
        @NativeType("uint32_t")
        public int m_nNumMisPresented() { return CompositorFrameTiming.nm_nNumMisPresented(address()); }
        /** Returns the value of the {@code m_nNumDroppedFrames} field. */
        @NativeType("uint32_t")
        public int m_nNumDroppedFrames() { return CompositorFrameTiming.nm_nNumDroppedFrames(address()); }
        /** Returns the value of the {@code m_nReprojectionFlags} field. */
        @NativeType("uint32_t")
        public int m_nReprojectionFlags() { return CompositorFrameTiming.nm_nReprojectionFlags(address()); }
        /** Returns the value of the {@code m_flSystemTimeInSeconds} field. */
        public double m_flSystemTimeInSeconds() { return CompositorFrameTiming.nm_flSystemTimeInSeconds(address()); }
        /** Returns the value of the {@code m_flPreSubmitGpuMs} field. */
        public float m_flPreSubmitGpuMs() { return CompositorFrameTiming.nm_flPreSubmitGpuMs(address()); }
        /** Returns the value of the {@code m_flPostSubmitGpuMs} field. */
        public float m_flPostSubmitGpuMs() { return CompositorFrameTiming.nm_flPostSubmitGpuMs(address()); }
        /** Returns the value of the {@code m_flTotalRenderGpuMs} field. */
        public float m_flTotalRenderGpuMs() { return CompositorFrameTiming.nm_flTotalRenderGpuMs(address()); }
        /** Returns the value of the {@code m_flCompositorRenderGpuMs} field. */
        public float m_flCompositorRenderGpuMs() { return CompositorFrameTiming.nm_flCompositorRenderGpuMs(address()); }
        /** Returns the value of the {@code m_flCompositorRenderCpuMs} field. */
        public float m_flCompositorRenderCpuMs() { return CompositorFrameTiming.nm_flCompositorRenderCpuMs(address()); }
        /** Returns the value of the {@code m_flCompositorIdleCpuMs} field. */
        public float m_flCompositorIdleCpuMs() { return CompositorFrameTiming.nm_flCompositorIdleCpuMs(address()); }
        /** Returns the value of the {@code m_flClientFrameIntervalMs} field. */
        public float m_flClientFrameIntervalMs() { return CompositorFrameTiming.nm_flClientFrameIntervalMs(address()); }
        /** Returns the value of the {@code m_flPresentCallCpuMs} field. */
        public float m_flPresentCallCpuMs() { return CompositorFrameTiming.nm_flPresentCallCpuMs(address()); }
        /** Returns the value of the {@code m_flWaitForPresentCpuMs} field. */
        public float m_flWaitForPresentCpuMs() { return CompositorFrameTiming.nm_flWaitForPresentCpuMs(address()); }
        /** Returns the value of the {@code m_flSubmitFrameMs} field. */
        public float m_flSubmitFrameMs() { return CompositorFrameTiming.nm_flSubmitFrameMs(address()); }
        /** Returns the value of the {@code m_flWaitGetPosesCalledMs} field. */
        public float m_flWaitGetPosesCalledMs() { return CompositorFrameTiming.nm_flWaitGetPosesCalledMs(address()); }
        /** Returns the value of the {@code m_flNewPosesReadyMs} field. */
        public float m_flNewPosesReadyMs() { return CompositorFrameTiming.nm_flNewPosesReadyMs(address()); }
        /** Returns the value of the {@code m_flNewFrameReadyMs} field. */
        public float m_flNewFrameReadyMs() { return CompositorFrameTiming.nm_flNewFrameReadyMs(address()); }
        /** Returns the value of the {@code m_flCompositorUpdateStartMs} field. */
        public float m_flCompositorUpdateStartMs() { return CompositorFrameTiming.nm_flCompositorUpdateStartMs(address()); }
        /** Returns the value of the {@code m_flCompositorUpdateEndMs} field. */
        public float m_flCompositorUpdateEndMs() { return CompositorFrameTiming.nm_flCompositorUpdateEndMs(address()); }
        /** Returns the value of the {@code m_flCompositorRenderStartMs} field. */
        public float m_flCompositorRenderStartMs() { return CompositorFrameTiming.nm_flCompositorRenderStartMs(address()); }
        /** Returns a {@link TrackedDevicePose} view of the {@code m_HmdPose} field. */
        @NativeType("TrackedDevicePose_t")
        public TrackedDevicePose m_HmdPose() { return CompositorFrameTiming.nm_HmdPose(address()); }
        /** Returns the value of the {@code m_nNumVSyncsReadyForUse} field. */
        @NativeType("uint32_t")
        public int m_nNumVSyncsReadyForUse() { return CompositorFrameTiming.nm_nNumVSyncsReadyForUse(address()); }
        /** Returns the value of the {@code m_nNumVSyncsToFirstView} field. */
        @NativeType("uint32_t")
        public int m_nNumVSyncsToFirstView() { return CompositorFrameTiming.nm_nNumVSyncsToFirstView(address()); }

    }

}