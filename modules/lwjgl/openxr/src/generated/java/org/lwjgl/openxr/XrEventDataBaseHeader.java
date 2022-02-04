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
 * Base header for an event.
 * 
 * <h5>Description</h5>
 * 
 * <p>The {@link XrEventDataBaseHeader} is a generic structure used to identify the common event data elements.</p>
 * 
 * <p>Upon receipt, the {@link XrEventDataBaseHeader} pointer should be type-cast to a pointer of the appropriate event data based on the {@code type} parameter.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code type} <b>must</b> be one of the following XrStructureType values: {@link FBDisplayRefreshRate#XR_TYPE_EVENT_DATA_DISPLAY_REFRESH_RATE_CHANGED_FB TYPE_EVENT_DATA_DISPLAY_REFRESH_RATE_CHANGED_FB}, {@link XR10#XR_TYPE_EVENT_DATA_EVENTS_LOST TYPE_EVENT_DATA_EVENTS_LOST}, {@link XR10#XR_TYPE_EVENT_DATA_INSTANCE_LOSS_PENDING TYPE_EVENT_DATA_INSTANCE_LOSS_PENDING}, {@link XR10#XR_TYPE_EVENT_DATA_INTERACTION_PROFILE_CHANGED TYPE_EVENT_DATA_INTERACTION_PROFILE_CHANGED}, {@link EXTXOverlay#XR_TYPE_EVENT_DATA_MAIN_SESSION_VISIBILITY_CHANGED_EXTX TYPE_EVENT_DATA_MAIN_SESSION_VISIBILITY_CHANGED_EXTX}, {@link VARJOMarkerTracking#XR_TYPE_EVENT_DATA_MARKER_TRACKING_UPDATE_VARJO TYPE_EVENT_DATA_MARKER_TRACKING_UPDATE_VARJO}, {@link EXTPerformanceSettings#XR_TYPE_EVENT_DATA_PERF_SETTINGS_EXT TYPE_EVENT_DATA_PERF_SETTINGS_EXT}, {@link XR10#XR_TYPE_EVENT_DATA_REFERENCE_SPACE_CHANGE_PENDING TYPE_EVENT_DATA_REFERENCE_SPACE_CHANGE_PENDING}, {@link XR10#XR_TYPE_EVENT_DATA_SESSION_STATE_CHANGED TYPE_EVENT_DATA_SESSION_STATE_CHANGED}, {@link KHRVisibilityMask#XR_TYPE_EVENT_DATA_VISIBILITY_MASK_CHANGED_KHR TYPE_EVENT_DATA_VISIBILITY_MASK_CHANGED_KHR}, {@link HTCXViveTrackerInteraction#XR_TYPE_EVENT_DATA_VIVE_TRACKER_CONNECTED_HTCX TYPE_EVENT_DATA_VIVE_TRACKER_CONNECTED_HTCX}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XR10#xrPollEvent PollEvent}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrEventDataBaseHeader {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 * }</code></pre>
 */
public class XrEventDataBaseHeader extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
    }

    /**
     * Creates a {@code XrEventDataBaseHeader} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEventDataBaseHeader(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. This base structure itself has no associated {@code XrStructureType} value. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrEventDataBaseHeader type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@link #next} field. */
    public XrEventDataBaseHeader next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEventDataBaseHeader set(
        int type,
        long next
    ) {
        type(type);
        next(next);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrEventDataBaseHeader set(XrEventDataBaseHeader src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEventDataBaseHeader} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEventDataBaseHeader malloc() {
        return wrap(XrEventDataBaseHeader.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrEventDataBaseHeader} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEventDataBaseHeader calloc() {
        return wrap(XrEventDataBaseHeader.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrEventDataBaseHeader} instance allocated with {@link BufferUtils}. */
    public static XrEventDataBaseHeader create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrEventDataBaseHeader.class, memAddress(container), container);
    }

    /** Returns a new {@code XrEventDataBaseHeader} instance for the specified memory address. */
    public static XrEventDataBaseHeader create(long address) {
        return wrap(XrEventDataBaseHeader.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrEventDataBaseHeader createSafe(long address) {
        return address == NULL ? null : wrap(XrEventDataBaseHeader.class, address);
    }

    /** Upcasts the specified {@code XrEventDataEventsLost} instance to {@code XrEventDataBaseHeader}. */
    public static XrEventDataBaseHeader create(XrEventDataEventsLost value) {
        return wrap(XrEventDataBaseHeader.class, value);
    }

    /** Upcasts the specified {@code XrEventDataInstanceLossPending} instance to {@code XrEventDataBaseHeader}. */
    public static XrEventDataBaseHeader create(XrEventDataInstanceLossPending value) {
        return wrap(XrEventDataBaseHeader.class, value);
    }

    /** Upcasts the specified {@code XrEventDataSessionStateChanged} instance to {@code XrEventDataBaseHeader}. */
    public static XrEventDataBaseHeader create(XrEventDataSessionStateChanged value) {
        return wrap(XrEventDataBaseHeader.class, value);
    }

    /** Upcasts the specified {@code XrEventDataReferenceSpaceChangePending} instance to {@code XrEventDataBaseHeader}. */
    public static XrEventDataBaseHeader create(XrEventDataReferenceSpaceChangePending value) {
        return wrap(XrEventDataBaseHeader.class, value);
    }

    /** Upcasts the specified {@code XrEventDataInteractionProfileChanged} instance to {@code XrEventDataBaseHeader}. */
    public static XrEventDataBaseHeader create(XrEventDataInteractionProfileChanged value) {
        return wrap(XrEventDataBaseHeader.class, value);
    }

    /** Upcasts the specified {@code XrEventDataPerfSettingsEXT} instance to {@code XrEventDataBaseHeader}. */
    public static XrEventDataBaseHeader create(XrEventDataPerfSettingsEXT value) {
        return wrap(XrEventDataBaseHeader.class, value);
    }

    /** Upcasts the specified {@code XrEventDataVisibilityMaskChangedKHR} instance to {@code XrEventDataBaseHeader}. */
    public static XrEventDataBaseHeader create(XrEventDataVisibilityMaskChangedKHR value) {
        return wrap(XrEventDataBaseHeader.class, value);
    }

    /** Upcasts the specified {@code XrEventDataMainSessionVisibilityChangedEXTX} instance to {@code XrEventDataBaseHeader}. */
    public static XrEventDataBaseHeader create(XrEventDataMainSessionVisibilityChangedEXTX value) {
        return wrap(XrEventDataBaseHeader.class, value);
    }

    /** Upcasts the specified {@code XrEventDataDisplayRefreshRateChangedFB} instance to {@code XrEventDataBaseHeader}. */
    public static XrEventDataBaseHeader create(XrEventDataDisplayRefreshRateChangedFB value) {
        return wrap(XrEventDataBaseHeader.class, value);
    }

    /** Upcasts the specified {@code XrEventDataViveTrackerConnectedHTCX} instance to {@code XrEventDataBaseHeader}. */
    public static XrEventDataBaseHeader create(XrEventDataViveTrackerConnectedHTCX value) {
        return wrap(XrEventDataBaseHeader.class, value);
    }

    /** Upcasts the specified {@code XrEventDataMarkerTrackingUpdateVARJO} instance to {@code XrEventDataBaseHeader}. */
    public static XrEventDataBaseHeader create(XrEventDataMarkerTrackingUpdateVARJO value) {
        return wrap(XrEventDataBaseHeader.class, value);
    }

    /**
     * Returns a new {@link XrEventDataBaseHeader.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataBaseHeader.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEventDataBaseHeader.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataBaseHeader.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataBaseHeader.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataBaseHeader.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrEventDataBaseHeader.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEventDataBaseHeader.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrEventDataBaseHeader.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /** Upcasts the specified {@code XrEventDataEventsLost.Buffer} instance to {@code XrEventDataBaseHeader.Buffer}. */
    public static XrEventDataBaseHeader.Buffer create(XrEventDataEventsLost.Buffer value) {
        return wrap(Buffer.class, value);
    }

    /** Upcasts the specified {@code XrEventDataInstanceLossPending.Buffer} instance to {@code XrEventDataBaseHeader.Buffer}. */
    public static XrEventDataBaseHeader.Buffer create(XrEventDataInstanceLossPending.Buffer value) {
        return wrap(Buffer.class, value);
    }

    /** Upcasts the specified {@code XrEventDataSessionStateChanged.Buffer} instance to {@code XrEventDataBaseHeader.Buffer}. */
    public static XrEventDataBaseHeader.Buffer create(XrEventDataSessionStateChanged.Buffer value) {
        return wrap(Buffer.class, value);
    }

    /** Upcasts the specified {@code XrEventDataReferenceSpaceChangePending.Buffer} instance to {@code XrEventDataBaseHeader.Buffer}. */
    public static XrEventDataBaseHeader.Buffer create(XrEventDataReferenceSpaceChangePending.Buffer value) {
        return wrap(Buffer.class, value);
    }

    /** Upcasts the specified {@code XrEventDataInteractionProfileChanged.Buffer} instance to {@code XrEventDataBaseHeader.Buffer}. */
    public static XrEventDataBaseHeader.Buffer create(XrEventDataInteractionProfileChanged.Buffer value) {
        return wrap(Buffer.class, value);
    }

    /** Upcasts the specified {@code XrEventDataPerfSettingsEXT.Buffer} instance to {@code XrEventDataBaseHeader.Buffer}. */
    public static XrEventDataBaseHeader.Buffer create(XrEventDataPerfSettingsEXT.Buffer value) {
        return wrap(Buffer.class, value);
    }

    /** Upcasts the specified {@code XrEventDataVisibilityMaskChangedKHR.Buffer} instance to {@code XrEventDataBaseHeader.Buffer}. */
    public static XrEventDataBaseHeader.Buffer create(XrEventDataVisibilityMaskChangedKHR.Buffer value) {
        return wrap(Buffer.class, value);
    }

    /** Upcasts the specified {@code XrEventDataMainSessionVisibilityChangedEXTX.Buffer} instance to {@code XrEventDataBaseHeader.Buffer}. */
    public static XrEventDataBaseHeader.Buffer create(XrEventDataMainSessionVisibilityChangedEXTX.Buffer value) {
        return wrap(Buffer.class, value);
    }

    /** Upcasts the specified {@code XrEventDataDisplayRefreshRateChangedFB.Buffer} instance to {@code XrEventDataBaseHeader.Buffer}. */
    public static XrEventDataBaseHeader.Buffer create(XrEventDataDisplayRefreshRateChangedFB.Buffer value) {
        return wrap(Buffer.class, value);
    }

    /** Upcasts the specified {@code XrEventDataViveTrackerConnectedHTCX.Buffer} instance to {@code XrEventDataBaseHeader.Buffer}. */
    public static XrEventDataBaseHeader.Buffer create(XrEventDataViveTrackerConnectedHTCX.Buffer value) {
        return wrap(Buffer.class, value);
    }

    /** Upcasts the specified {@code XrEventDataMarkerTrackingUpdateVARJO.Buffer} instance to {@code XrEventDataBaseHeader.Buffer}. */
    public static XrEventDataBaseHeader.Buffer create(XrEventDataMarkerTrackingUpdateVARJO.Buffer value) {
        return wrap(Buffer.class, value);
    }

    /**
     * Returns a new {@code XrEventDataBaseHeader} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataBaseHeader malloc(MemoryStack stack) {
        return wrap(XrEventDataBaseHeader.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrEventDataBaseHeader} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataBaseHeader calloc(MemoryStack stack) {
        return wrap(XrEventDataBaseHeader.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrEventDataBaseHeader.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataBaseHeader.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataBaseHeader.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataBaseHeader.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrEventDataBaseHeader.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEventDataBaseHeader.NEXT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrEventDataBaseHeader.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEventDataBaseHeader.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrEventDataBaseHeader} structs. */
    public static class Buffer extends StructBuffer<XrEventDataBaseHeader, Buffer> implements NativeResource {

        private static final XrEventDataBaseHeader ELEMENT_FACTORY = XrEventDataBaseHeader.create(-1L);

        /**
         * Creates a new {@code XrEventDataBaseHeader.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEventDataBaseHeader#SIZEOF}, and its mark will be undefined.
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
        protected XrEventDataBaseHeader getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrEventDataBaseHeader#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEventDataBaseHeader.ntype(address()); }
        /** @return the value of the {@link XrEventDataBaseHeader#next} field. */
        @NativeType("void const *")
        public long next() { return XrEventDataBaseHeader.nnext(address()); }

        /** Sets the specified value to the {@link XrEventDataBaseHeader#type} field. */
        public XrEventDataBaseHeader.Buffer type(@NativeType("XrStructureType") int value) { XrEventDataBaseHeader.ntype(address(), value); return this; }
        /** Sets the specified value to the {@link XrEventDataBaseHeader#next} field. */
        public XrEventDataBaseHeader.Buffer next(@NativeType("void const *") long value) { XrEventDataBaseHeader.nnext(address(), value); return this; }

    }

}