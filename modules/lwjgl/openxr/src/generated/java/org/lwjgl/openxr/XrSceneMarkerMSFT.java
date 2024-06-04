/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * The properties of a scene marker.
 * 
 * <h5>Description</h5>
 * 
 * <p>The {@link XrSceneMarkerMSFT} structure is an element in the array of {@link XrSceneMarkersMSFT}{@code ::sceneMarkers}.</p>
 * 
 * <p>Refer to the <a href="https://registry.khronos.org/OpenXR/specs/1.1/html/xrspec.html#msft_scene_marker-qr-code-convention">QR code convention</a> for an example of marker’s center and size in the context of a QR code.</p>
 * 
 * <p>When the runtime updates the location or properties of an observed marker, the runtime <b>must</b> set the {@link XrSceneMarkerMSFT}{@code ::lastSeenTime} to the new timestamp of the update.</p>
 * 
 * <p>When the runtime cannot observe a previously observed {@link XrSceneMarkerMSFT}, the runtime <b>must</b> keep the previous {@code lastSeenTime} for the marker. Hence, the application <b>can</b> use the {@code lastSeenTime} to know how fresh the tracking information is for a given marker.</p>
 * 
 * <p>The {@code center} and {@code size} are measured in meters, relative to the {@link XrPosef} of the marker for the visual bound of the marker in XY plane, regardless of the marker type.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link MSFTSceneMarker XR_MSFT_scene_marker} extension <b>must</b> be enabled prior to using {@link XrSceneMarkerMSFT}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrExtent2Df}, {@link XrOffset2Df}, {@link XrSceneMarkersMSFT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSceneMarkerMSFT {
 *     XrSceneMarkerTypeMSFT {@link #markerType};
 *     XrTime {@link #lastSeenTime};
 *     {@link XrOffset2Df XrOffset2Df} {@link #center};
 *     {@link XrExtent2Df XrExtent2Df} {@link #size};
 * }</code></pre>
 */
public class XrSceneMarkerMSFT extends Struct<XrSceneMarkerMSFT> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MARKERTYPE,
        LASTSEENTIME,
        CENTER,
        SIZE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(8),
            __member(XrOffset2Df.SIZEOF, XrOffset2Df.ALIGNOF),
            __member(XrExtent2Df.SIZEOF, XrExtent2Df.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MARKERTYPE = layout.offsetof(0);
        LASTSEENTIME = layout.offsetof(1);
        CENTER = layout.offsetof(2);
        SIZE = layout.offsetof(3);
    }

    protected XrSceneMarkerMSFT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSceneMarkerMSFT create(long address, @Nullable ByteBuffer container) {
        return new XrSceneMarkerMSFT(address, container);
    }

    /**
     * Creates a {@code XrSceneMarkerMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSceneMarkerMSFT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** an {@code XrSceneMarkerTypeMSFT} indicating the type of the marker. */
    @NativeType("XrSceneMarkerTypeMSFT")
    public int markerType() { return nmarkerType(address()); }
    /** an {@code XrTime} indicating when the marker was seen last. */
    @NativeType("XrTime")
    public long lastSeenTime() { return nlastSeenTime(address()); }
    /** an {@link XrOffset2Df} structure representing the location of the center of the axis-aligned bounding box of the marker in the XY plane of the marker’s coordinate system. */
    public XrOffset2Df center() { return ncenter(address()); }
    /** an {@link XrExtent2Df} structure representing the width and height of the axis-aligned bounding box of the marker in the XY plane of the marker’s coordinate system. */
    public XrExtent2Df size() { return nsize(address()); }

    // -----------------------------------

    /** Returns a new {@code XrSceneMarkerMSFT} instance for the specified memory address. */
    public static XrSceneMarkerMSFT create(long address) {
        return new XrSceneMarkerMSFT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSceneMarkerMSFT createSafe(long address) {
        return address == NULL ? null : new XrSceneMarkerMSFT(address, null);
    }

    /**
     * Create a {@link XrSceneMarkerMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSceneMarkerMSFT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSceneMarkerMSFT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #markerType}. */
    public static int nmarkerType(long struct) { return UNSAFE.getInt(null, struct + XrSceneMarkerMSFT.MARKERTYPE); }
    /** Unsafe version of {@link #lastSeenTime}. */
    public static long nlastSeenTime(long struct) { return UNSAFE.getLong(null, struct + XrSceneMarkerMSFT.LASTSEENTIME); }
    /** Unsafe version of {@link #center}. */
    public static XrOffset2Df ncenter(long struct) { return XrOffset2Df.create(struct + XrSceneMarkerMSFT.CENTER); }
    /** Unsafe version of {@link #size}. */
    public static XrExtent2Df nsize(long struct) { return XrExtent2Df.create(struct + XrSceneMarkerMSFT.SIZE); }

    // -----------------------------------

    /** An array of {@link XrSceneMarkerMSFT} structs. */
    public static class Buffer extends StructBuffer<XrSceneMarkerMSFT, Buffer> {

        private static final XrSceneMarkerMSFT ELEMENT_FACTORY = XrSceneMarkerMSFT.create(-1L);

        /**
         * Creates a new {@code XrSceneMarkerMSFT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSceneMarkerMSFT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSceneMarkerMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSceneMarkerMSFT#markerType} field. */
        @NativeType("XrSceneMarkerTypeMSFT")
        public int markerType() { return XrSceneMarkerMSFT.nmarkerType(address()); }
        /** @return the value of the {@link XrSceneMarkerMSFT#lastSeenTime} field. */
        @NativeType("XrTime")
        public long lastSeenTime() { return XrSceneMarkerMSFT.nlastSeenTime(address()); }
        /** @return a {@link XrOffset2Df} view of the {@link XrSceneMarkerMSFT#center} field. */
        public XrOffset2Df center() { return XrSceneMarkerMSFT.ncenter(address()); }
        /** @return a {@link XrExtent2Df} view of the {@link XrSceneMarkerMSFT#size} field. */
        public XrExtent2Df size() { return XrSceneMarkerMSFT.nsize(address()); }

    }

}