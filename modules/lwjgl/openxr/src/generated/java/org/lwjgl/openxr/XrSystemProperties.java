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

import static org.lwjgl.openxr.XR10.*;

/**
 * Properties of a particular system.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code type} <b>must</b> be {@link XR10#XR_TYPE_SYSTEM_PROPERTIES TYPE_SYSTEM_PROPERTIES}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a>. See also: {@link XrSystemAnchorPropertiesHTC}, {@link XrSystemBodyTrackingPropertiesFB}, {@link XrSystemBodyTrackingPropertiesHTC}, {@link XrSystemColorSpacePropertiesFB}, {@link XrSystemEnvironmentDepthPropertiesMETA}, {@link XrSystemEyeGazeInteractionPropertiesEXT}, {@link XrSystemEyeTrackingPropertiesFB}, {@link XrSystemFaceTrackingProperties2FB}, {@link XrSystemFaceTrackingPropertiesFB}, {@link XrSystemFacialTrackingPropertiesHTC}, {@link XrSystemForceFeedbackCurlPropertiesMNDX}, {@link XrSystemFoveatedRenderingPropertiesVARJO}, {@link XrSystemFoveationEyeTrackedPropertiesMETA}, {@link XrSystemHandTrackingMeshPropertiesMSFT}, {@link XrSystemHandTrackingPropertiesEXT}, {@link XrSystemHeadsetIdPropertiesMETA}, {@link XrSystemKeyboardTrackingPropertiesFB}, {@link XrSystemMarkerTrackingPropertiesVARJO}, {@link XrSystemMarkerUnderstandingPropertiesML}, {@link XrSystemPassthroughColorLutPropertiesMETA}, {@link XrSystemPassthroughProperties2FB}, {@link XrSystemPassthroughPropertiesFB}, {@link XrSystemPlaneDetectionPropertiesEXT}, {@link XrSystemRenderModelPropertiesFB}, {@link XrSystemSpaceWarpPropertiesFB}, {@link XrSystemSpatialEntityPropertiesFB}, {@link XrSystemUserPresencePropertiesEXT}, {@link XrSystemVirtualKeyboardPropertiesMETA}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrSystemGraphicsProperties}, {@link XrSystemTrackingProperties}, {@link XR10#xrGetSystem GetSystem}, {@link XR10#xrGetSystemProperties GetSystemProperties}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSystemProperties {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     XrSystemId {@link #systemId};
 *     uint32_t {@link #vendorId};
 *     char {@link #systemName}[XR_MAX_SYSTEM_NAME_SIZE];
 *     {@link XrSystemGraphicsProperties XrSystemGraphicsProperties} {@link #graphicsProperties};
 *     {@link XrSystemTrackingProperties XrSystemTrackingProperties} {@link #trackingProperties};
 * }</code></pre>
 */
public class XrSystemProperties extends Struct<XrSystemProperties> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SYSTEMID,
        VENDORID,
        SYSTEMNAME,
        GRAPHICSPROPERTIES,
        TRACKINGPROPERTIES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __array(1, XR_MAX_SYSTEM_NAME_SIZE),
            __member(XrSystemGraphicsProperties.SIZEOF, XrSystemGraphicsProperties.ALIGNOF),
            __member(XrSystemTrackingProperties.SIZEOF, XrSystemTrackingProperties.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SYSTEMID = layout.offsetof(2);
        VENDORID = layout.offsetof(3);
        SYSTEMNAME = layout.offsetof(4);
        GRAPHICSPROPERTIES = layout.offsetof(5);
        TRACKINGPROPERTIES = layout.offsetof(6);
    }

    protected XrSystemProperties(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSystemProperties create(long address, @Nullable ByteBuffer container) {
        return new XrSystemProperties(address, container);
    }

    /**
     * Creates a {@code XrSystemProperties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSystemProperties(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** the {@code XrSystemId} identifying the system. */
    @NativeType("XrSystemId")
    public long systemId() { return nsystemId(address()); }
    /** a unique identifier for the vendor of the system. */
    @NativeType("uint32_t")
    public int vendorId() { return nvendorId(address()); }
    /** a string containing the name of the system. */
    @NativeType("char[XR_MAX_SYSTEM_NAME_SIZE]")
    public ByteBuffer systemName() { return nsystemName(address()); }
    /** a string containing the name of the system. */
    @NativeType("char[XR_MAX_SYSTEM_NAME_SIZE]")
    public String systemNameString() { return nsystemNameString(address()); }
    /** an {@link XrSystemGraphicsProperties} structure specifying the system graphics properties. */
    public XrSystemGraphicsProperties graphicsProperties() { return ngraphicsProperties(address()); }
    /** an {@link XrSystemTrackingProperties} structure specifying system tracking properties. */
    public XrSystemTrackingProperties trackingProperties() { return ntrackingProperties(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrSystemProperties type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link XR10#XR_TYPE_SYSTEM_PROPERTIES TYPE_SYSTEM_PROPERTIES} value to the {@link #type} field. */
    public XrSystemProperties type$Default() { return type(XR10.XR_TYPE_SYSTEM_PROPERTIES); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSystemProperties next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Prepends the specified {@link XrSystemAnchorPropertiesHTC} value to the {@code next} chain. */
    public XrSystemProperties next(XrSystemAnchorPropertiesHTC value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrSystemBodyTrackingPropertiesFB} value to the {@code next} chain. */
    public XrSystemProperties next(XrSystemBodyTrackingPropertiesFB value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrSystemBodyTrackingPropertiesHTC} value to the {@code next} chain. */
    public XrSystemProperties next(XrSystemBodyTrackingPropertiesHTC value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrSystemColorSpacePropertiesFB} value to the {@code next} chain. */
    public XrSystemProperties next(XrSystemColorSpacePropertiesFB value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrSystemEnvironmentDepthPropertiesMETA} value to the {@code next} chain. */
    public XrSystemProperties next(XrSystemEnvironmentDepthPropertiesMETA value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrSystemEyeGazeInteractionPropertiesEXT} value to the {@code next} chain. */
    public XrSystemProperties next(XrSystemEyeGazeInteractionPropertiesEXT value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrSystemEyeTrackingPropertiesFB} value to the {@code next} chain. */
    public XrSystemProperties next(XrSystemEyeTrackingPropertiesFB value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrSystemFaceTrackingProperties2FB} value to the {@code next} chain. */
    public XrSystemProperties next(XrSystemFaceTrackingProperties2FB value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrSystemFaceTrackingPropertiesFB} value to the {@code next} chain. */
    public XrSystemProperties next(XrSystemFaceTrackingPropertiesFB value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrSystemFacialTrackingPropertiesHTC} value to the {@code next} chain. */
    public XrSystemProperties next(XrSystemFacialTrackingPropertiesHTC value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrSystemForceFeedbackCurlPropertiesMNDX} value to the {@code next} chain. */
    public XrSystemProperties next(XrSystemForceFeedbackCurlPropertiesMNDX value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrSystemFoveatedRenderingPropertiesVARJO} value to the {@code next} chain. */
    public XrSystemProperties next(XrSystemFoveatedRenderingPropertiesVARJO value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrSystemFoveationEyeTrackedPropertiesMETA} value to the {@code next} chain. */
    public XrSystemProperties next(XrSystemFoveationEyeTrackedPropertiesMETA value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrSystemHandTrackingMeshPropertiesMSFT} value to the {@code next} chain. */
    public XrSystemProperties next(XrSystemHandTrackingMeshPropertiesMSFT value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrSystemHandTrackingPropertiesEXT} value to the {@code next} chain. */
    public XrSystemProperties next(XrSystemHandTrackingPropertiesEXT value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrSystemHeadsetIdPropertiesMETA} value to the {@code next} chain. */
    public XrSystemProperties next(XrSystemHeadsetIdPropertiesMETA value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrSystemKeyboardTrackingPropertiesFB} value to the {@code next} chain. */
    public XrSystemProperties next(XrSystemKeyboardTrackingPropertiesFB value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrSystemMarkerTrackingPropertiesVARJO} value to the {@code next} chain. */
    public XrSystemProperties next(XrSystemMarkerTrackingPropertiesVARJO value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrSystemMarkerUnderstandingPropertiesML} value to the {@code next} chain. */
    public XrSystemProperties next(XrSystemMarkerUnderstandingPropertiesML value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrSystemPassthroughColorLutPropertiesMETA} value to the {@code next} chain. */
    public XrSystemProperties next(XrSystemPassthroughColorLutPropertiesMETA value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrSystemPassthroughProperties2FB} value to the {@code next} chain. */
    public XrSystemProperties next(XrSystemPassthroughProperties2FB value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrSystemPassthroughPropertiesFB} value to the {@code next} chain. */
    public XrSystemProperties next(XrSystemPassthroughPropertiesFB value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrSystemPlaneDetectionPropertiesEXT} value to the {@code next} chain. */
    public XrSystemProperties next(XrSystemPlaneDetectionPropertiesEXT value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrSystemRenderModelPropertiesFB} value to the {@code next} chain. */
    public XrSystemProperties next(XrSystemRenderModelPropertiesFB value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrSystemSpaceWarpPropertiesFB} value to the {@code next} chain. */
    public XrSystemProperties next(XrSystemSpaceWarpPropertiesFB value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrSystemSpatialEntityPropertiesFB} value to the {@code next} chain. */
    public XrSystemProperties next(XrSystemSpatialEntityPropertiesFB value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrSystemUserPresencePropertiesEXT} value to the {@code next} chain. */
    public XrSystemProperties next(XrSystemUserPresencePropertiesEXT value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrSystemVirtualKeyboardPropertiesMETA} value to the {@code next} chain. */
    public XrSystemProperties next(XrSystemVirtualKeyboardPropertiesMETA value) { return this.next(value.next(this.next()).address()); }

    /** Initializes this struct with the specified values. */
    public XrSystemProperties set(
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
    public XrSystemProperties set(XrSystemProperties src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSystemProperties} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSystemProperties malloc() {
        return new XrSystemProperties(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSystemProperties} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSystemProperties calloc() {
        return new XrSystemProperties(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSystemProperties} instance allocated with {@link BufferUtils}. */
    public static XrSystemProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSystemProperties(memAddress(container), container);
    }

    /** Returns a new {@code XrSystemProperties} instance for the specified memory address. */
    public static XrSystemProperties create(long address) {
        return new XrSystemProperties(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSystemProperties createSafe(long address) {
        return address == NULL ? null : new XrSystemProperties(address, null);
    }

    /**
     * Returns a new {@link XrSystemProperties.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemProperties.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSystemProperties.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemProperties.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemProperties.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemProperties.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSystemProperties.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSystemProperties.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSystemProperties.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSystemProperties} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemProperties malloc(MemoryStack stack) {
        return new XrSystemProperties(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSystemProperties} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemProperties calloc(MemoryStack stack) {
        return new XrSystemProperties(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSystemProperties.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemProperties.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemProperties.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemProperties.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSystemProperties.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSystemProperties.NEXT); }
    /** Unsafe version of {@link #systemId}. */
    public static long nsystemId(long struct) { return memGetLong(struct + XrSystemProperties.SYSTEMID); }
    /** Unsafe version of {@link #vendorId}. */
    public static int nvendorId(long struct) { return memGetInt(struct + XrSystemProperties.VENDORID); }
    /** Unsafe version of {@link #systemName}. */
    public static ByteBuffer nsystemName(long struct) { return memByteBuffer(struct + XrSystemProperties.SYSTEMNAME, XR_MAX_SYSTEM_NAME_SIZE); }
    /** Unsafe version of {@link #systemNameString}. */
    public static String nsystemNameString(long struct) { return memUTF8(struct + XrSystemProperties.SYSTEMNAME); }
    /** Unsafe version of {@link #graphicsProperties}. */
    public static XrSystemGraphicsProperties ngraphicsProperties(long struct) { return XrSystemGraphicsProperties.create(struct + XrSystemProperties.GRAPHICSPROPERTIES); }
    /** Unsafe version of {@link #trackingProperties}. */
    public static XrSystemTrackingProperties ntrackingProperties(long struct) { return XrSystemTrackingProperties.create(struct + XrSystemProperties.TRACKINGPROPERTIES); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSystemProperties.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSystemProperties.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSystemProperties} structs. */
    public static class Buffer extends StructBuffer<XrSystemProperties, Buffer> implements NativeResource {

        private static final XrSystemProperties ELEMENT_FACTORY = XrSystemProperties.create(-1L);

        /**
         * Creates a new {@code XrSystemProperties.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSystemProperties#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSystemProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSystemProperties#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSystemProperties.ntype(address()); }
        /** @return the value of the {@link XrSystemProperties#next} field. */
        @NativeType("void *")
        public long next() { return XrSystemProperties.nnext(address()); }
        /** @return the value of the {@link XrSystemProperties#systemId} field. */
        @NativeType("XrSystemId")
        public long systemId() { return XrSystemProperties.nsystemId(address()); }
        /** @return the value of the {@link XrSystemProperties#vendorId} field. */
        @NativeType("uint32_t")
        public int vendorId() { return XrSystemProperties.nvendorId(address()); }
        /** @return a {@link ByteBuffer} view of the {@link XrSystemProperties#systemName} field. */
        @NativeType("char[XR_MAX_SYSTEM_NAME_SIZE]")
        public ByteBuffer systemName() { return XrSystemProperties.nsystemName(address()); }
        /** @return the null-terminated string stored in the {@link XrSystemProperties#systemName} field. */
        @NativeType("char[XR_MAX_SYSTEM_NAME_SIZE]")
        public String systemNameString() { return XrSystemProperties.nsystemNameString(address()); }
        /** @return a {@link XrSystemGraphicsProperties} view of the {@link XrSystemProperties#graphicsProperties} field. */
        public XrSystemGraphicsProperties graphicsProperties() { return XrSystemProperties.ngraphicsProperties(address()); }
        /** @return a {@link XrSystemTrackingProperties} view of the {@link XrSystemProperties#trackingProperties} field. */
        public XrSystemTrackingProperties trackingProperties() { return XrSystemProperties.ntrackingProperties(address()); }

        /** Sets the specified value to the {@link XrSystemProperties#type} field. */
        public XrSystemProperties.Buffer type(@NativeType("XrStructureType") int value) { XrSystemProperties.ntype(address(), value); return this; }
        /** Sets the {@link XR10#XR_TYPE_SYSTEM_PROPERTIES TYPE_SYSTEM_PROPERTIES} value to the {@link XrSystemProperties#type} field. */
        public XrSystemProperties.Buffer type$Default() { return type(XR10.XR_TYPE_SYSTEM_PROPERTIES); }
        /** Sets the specified value to the {@link XrSystemProperties#next} field. */
        public XrSystemProperties.Buffer next(@NativeType("void *") long value) { XrSystemProperties.nnext(address(), value); return this; }
        /** Prepends the specified {@link XrSystemAnchorPropertiesHTC} value to the {@code next} chain. */
        public XrSystemProperties.Buffer next(XrSystemAnchorPropertiesHTC value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrSystemBodyTrackingPropertiesFB} value to the {@code next} chain. */
        public XrSystemProperties.Buffer next(XrSystemBodyTrackingPropertiesFB value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrSystemBodyTrackingPropertiesHTC} value to the {@code next} chain. */
        public XrSystemProperties.Buffer next(XrSystemBodyTrackingPropertiesHTC value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrSystemColorSpacePropertiesFB} value to the {@code next} chain. */
        public XrSystemProperties.Buffer next(XrSystemColorSpacePropertiesFB value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrSystemEnvironmentDepthPropertiesMETA} value to the {@code next} chain. */
        public XrSystemProperties.Buffer next(XrSystemEnvironmentDepthPropertiesMETA value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrSystemEyeGazeInteractionPropertiesEXT} value to the {@code next} chain. */
        public XrSystemProperties.Buffer next(XrSystemEyeGazeInteractionPropertiesEXT value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrSystemEyeTrackingPropertiesFB} value to the {@code next} chain. */
        public XrSystemProperties.Buffer next(XrSystemEyeTrackingPropertiesFB value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrSystemFaceTrackingProperties2FB} value to the {@code next} chain. */
        public XrSystemProperties.Buffer next(XrSystemFaceTrackingProperties2FB value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrSystemFaceTrackingPropertiesFB} value to the {@code next} chain. */
        public XrSystemProperties.Buffer next(XrSystemFaceTrackingPropertiesFB value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrSystemFacialTrackingPropertiesHTC} value to the {@code next} chain. */
        public XrSystemProperties.Buffer next(XrSystemFacialTrackingPropertiesHTC value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrSystemForceFeedbackCurlPropertiesMNDX} value to the {@code next} chain. */
        public XrSystemProperties.Buffer next(XrSystemForceFeedbackCurlPropertiesMNDX value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrSystemFoveatedRenderingPropertiesVARJO} value to the {@code next} chain. */
        public XrSystemProperties.Buffer next(XrSystemFoveatedRenderingPropertiesVARJO value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrSystemFoveationEyeTrackedPropertiesMETA} value to the {@code next} chain. */
        public XrSystemProperties.Buffer next(XrSystemFoveationEyeTrackedPropertiesMETA value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrSystemHandTrackingMeshPropertiesMSFT} value to the {@code next} chain. */
        public XrSystemProperties.Buffer next(XrSystemHandTrackingMeshPropertiesMSFT value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrSystemHandTrackingPropertiesEXT} value to the {@code next} chain. */
        public XrSystemProperties.Buffer next(XrSystemHandTrackingPropertiesEXT value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrSystemHeadsetIdPropertiesMETA} value to the {@code next} chain. */
        public XrSystemProperties.Buffer next(XrSystemHeadsetIdPropertiesMETA value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrSystemKeyboardTrackingPropertiesFB} value to the {@code next} chain. */
        public XrSystemProperties.Buffer next(XrSystemKeyboardTrackingPropertiesFB value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrSystemMarkerTrackingPropertiesVARJO} value to the {@code next} chain. */
        public XrSystemProperties.Buffer next(XrSystemMarkerTrackingPropertiesVARJO value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrSystemMarkerUnderstandingPropertiesML} value to the {@code next} chain. */
        public XrSystemProperties.Buffer next(XrSystemMarkerUnderstandingPropertiesML value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrSystemPassthroughColorLutPropertiesMETA} value to the {@code next} chain. */
        public XrSystemProperties.Buffer next(XrSystemPassthroughColorLutPropertiesMETA value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrSystemPassthroughProperties2FB} value to the {@code next} chain. */
        public XrSystemProperties.Buffer next(XrSystemPassthroughProperties2FB value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrSystemPassthroughPropertiesFB} value to the {@code next} chain. */
        public XrSystemProperties.Buffer next(XrSystemPassthroughPropertiesFB value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrSystemPlaneDetectionPropertiesEXT} value to the {@code next} chain. */
        public XrSystemProperties.Buffer next(XrSystemPlaneDetectionPropertiesEXT value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrSystemRenderModelPropertiesFB} value to the {@code next} chain. */
        public XrSystemProperties.Buffer next(XrSystemRenderModelPropertiesFB value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrSystemSpaceWarpPropertiesFB} value to the {@code next} chain. */
        public XrSystemProperties.Buffer next(XrSystemSpaceWarpPropertiesFB value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrSystemSpatialEntityPropertiesFB} value to the {@code next} chain. */
        public XrSystemProperties.Buffer next(XrSystemSpatialEntityPropertiesFB value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrSystemUserPresencePropertiesEXT} value to the {@code next} chain. */
        public XrSystemProperties.Buffer next(XrSystemUserPresencePropertiesEXT value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrSystemVirtualKeyboardPropertiesMETA} value to the {@code next} chain. */
        public XrSystemProperties.Buffer next(XrSystemVirtualKeyboardPropertiesMETA value) { return this.next(value.next(this.next()).address()); }

    }

}