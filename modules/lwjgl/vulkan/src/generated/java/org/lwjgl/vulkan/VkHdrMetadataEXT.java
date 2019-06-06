/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * structure to specify Hdr metadata.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTHdrMetadata#VK_STRUCTURE_TYPE_HDR_METADATA_EXT STRUCTURE_TYPE_HDR_METADATA_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * </ul>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>The validity and use of this data is outside the scope of Vulkan.</p>
 * </div>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkXYColorEXT}, {@link EXTHdrMetadata#vkSetHdrMetadataEXT SetHdrMetadataEXT}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code displayPrimaryRed} &ndash; the mastering display&#8217;s red primary in chromaticity coordinates</li>
 * <li>{@code displayPrimaryGreen} &ndash; the mastering display&#8217;s green primary in chromaticity coordinates</li>
 * <li>{@code displayPrimaryBlue} &ndash; the mastering display&#8217;s blue primary in chromaticity coordinates</li>
 * <li>{@code whitePoint} &ndash; the mastering display&#8217;s white-point in chromaticity coordinates</li>
 * <li>{@code maxLuminance} &ndash; the maximum luminance of the mastering display in nits</li>
 * <li>{@code minLuminance} &ndash; the minimum luminance of the mastering display in nits</li>
 * <li>{@code maxContentLightLevel} &ndash; content&#8217;s maximum luminance in nits</li>
 * <li>{@code maxFrameAverageLightLevel} &ndash; the maximum frame average light level in nits</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkHdrMetadataEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     {@link VkXYColorEXT VkXYColorEXT} displayPrimaryRed;
 *     {@link VkXYColorEXT VkXYColorEXT} displayPrimaryGreen;
 *     {@link VkXYColorEXT VkXYColorEXT} displayPrimaryBlue;
 *     {@link VkXYColorEXT VkXYColorEXT} whitePoint;
 *     float maxLuminance;
 *     float minLuminance;
 *     float maxContentLightLevel;
 *     float maxFrameAverageLightLevel;
 * }</code></pre>
 */
public class VkHdrMetadataEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DISPLAYPRIMARYRED,
        DISPLAYPRIMARYGREEN,
        DISPLAYPRIMARYBLUE,
        WHITEPOINT,
        MAXLUMINANCE,
        MINLUMINANCE,
        MAXCONTENTLIGHTLEVEL,
        MAXFRAMEAVERAGELIGHTLEVEL;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(VkXYColorEXT.SIZEOF, VkXYColorEXT.ALIGNOF),
            __member(VkXYColorEXT.SIZEOF, VkXYColorEXT.ALIGNOF),
            __member(VkXYColorEXT.SIZEOF, VkXYColorEXT.ALIGNOF),
            __member(VkXYColorEXT.SIZEOF, VkXYColorEXT.ALIGNOF),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DISPLAYPRIMARYRED = layout.offsetof(2);
        DISPLAYPRIMARYGREEN = layout.offsetof(3);
        DISPLAYPRIMARYBLUE = layout.offsetof(4);
        WHITEPOINT = layout.offsetof(5);
        MAXLUMINANCE = layout.offsetof(6);
        MINLUMINANCE = layout.offsetof(7);
        MAXCONTENTLIGHTLEVEL = layout.offsetof(8);
        MAXFRAMEAVERAGELIGHTLEVEL = layout.offsetof(9);
    }

    /**
     * Creates a {@code VkHdrMetadataEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkHdrMetadataEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns a {@link VkXYColorEXT} view of the {@code displayPrimaryRed} field. */
    public VkXYColorEXT displayPrimaryRed() { return ndisplayPrimaryRed(address()); }
    /** Returns a {@link VkXYColorEXT} view of the {@code displayPrimaryGreen} field. */
    public VkXYColorEXT displayPrimaryGreen() { return ndisplayPrimaryGreen(address()); }
    /** Returns a {@link VkXYColorEXT} view of the {@code displayPrimaryBlue} field. */
    public VkXYColorEXT displayPrimaryBlue() { return ndisplayPrimaryBlue(address()); }
    /** Returns a {@link VkXYColorEXT} view of the {@code whitePoint} field. */
    public VkXYColorEXT whitePoint() { return nwhitePoint(address()); }
    /** Returns the value of the {@code maxLuminance} field. */
    public float maxLuminance() { return nmaxLuminance(address()); }
    /** Returns the value of the {@code minLuminance} field. */
    public float minLuminance() { return nminLuminance(address()); }
    /** Returns the value of the {@code maxContentLightLevel} field. */
    public float maxContentLightLevel() { return nmaxContentLightLevel(address()); }
    /** Returns the value of the {@code maxFrameAverageLightLevel} field. */
    public float maxFrameAverageLightLevel() { return nmaxFrameAverageLightLevel(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkHdrMetadataEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkHdrMetadataEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Copies the specified {@link VkXYColorEXT} to the {@code displayPrimaryRed} field. */
    public VkHdrMetadataEXT displayPrimaryRed(VkXYColorEXT value) { ndisplayPrimaryRed(address(), value); return this; }
    /** Passes the {@code displayPrimaryRed} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkHdrMetadataEXT displayPrimaryRed(java.util.function.Consumer<VkXYColorEXT> consumer) { consumer.accept(displayPrimaryRed()); return this; }
    /** Copies the specified {@link VkXYColorEXT} to the {@code displayPrimaryGreen} field. */
    public VkHdrMetadataEXT displayPrimaryGreen(VkXYColorEXT value) { ndisplayPrimaryGreen(address(), value); return this; }
    /** Passes the {@code displayPrimaryGreen} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkHdrMetadataEXT displayPrimaryGreen(java.util.function.Consumer<VkXYColorEXT> consumer) { consumer.accept(displayPrimaryGreen()); return this; }
    /** Copies the specified {@link VkXYColorEXT} to the {@code displayPrimaryBlue} field. */
    public VkHdrMetadataEXT displayPrimaryBlue(VkXYColorEXT value) { ndisplayPrimaryBlue(address(), value); return this; }
    /** Passes the {@code displayPrimaryBlue} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkHdrMetadataEXT displayPrimaryBlue(java.util.function.Consumer<VkXYColorEXT> consumer) { consumer.accept(displayPrimaryBlue()); return this; }
    /** Copies the specified {@link VkXYColorEXT} to the {@code whitePoint} field. */
    public VkHdrMetadataEXT whitePoint(VkXYColorEXT value) { nwhitePoint(address(), value); return this; }
    /** Passes the {@code whitePoint} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkHdrMetadataEXT whitePoint(java.util.function.Consumer<VkXYColorEXT> consumer) { consumer.accept(whitePoint()); return this; }
    /** Sets the specified value to the {@code maxLuminance} field. */
    public VkHdrMetadataEXT maxLuminance(float value) { nmaxLuminance(address(), value); return this; }
    /** Sets the specified value to the {@code minLuminance} field. */
    public VkHdrMetadataEXT minLuminance(float value) { nminLuminance(address(), value); return this; }
    /** Sets the specified value to the {@code maxContentLightLevel} field. */
    public VkHdrMetadataEXT maxContentLightLevel(float value) { nmaxContentLightLevel(address(), value); return this; }
    /** Sets the specified value to the {@code maxFrameAverageLightLevel} field. */
    public VkHdrMetadataEXT maxFrameAverageLightLevel(float value) { nmaxFrameAverageLightLevel(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkHdrMetadataEXT set(
        int sType,
        long pNext,
        VkXYColorEXT displayPrimaryRed,
        VkXYColorEXT displayPrimaryGreen,
        VkXYColorEXT displayPrimaryBlue,
        VkXYColorEXT whitePoint,
        float maxLuminance,
        float minLuminance,
        float maxContentLightLevel,
        float maxFrameAverageLightLevel
    ) {
        sType(sType);
        pNext(pNext);
        displayPrimaryRed(displayPrimaryRed);
        displayPrimaryGreen(displayPrimaryGreen);
        displayPrimaryBlue(displayPrimaryBlue);
        whitePoint(whitePoint);
        maxLuminance(maxLuminance);
        minLuminance(minLuminance);
        maxContentLightLevel(maxContentLightLevel);
        maxFrameAverageLightLevel(maxFrameAverageLightLevel);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkHdrMetadataEXT set(VkHdrMetadataEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkHdrMetadataEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkHdrMetadataEXT malloc() {
        return wrap(VkHdrMetadataEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkHdrMetadataEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkHdrMetadataEXT calloc() {
        return wrap(VkHdrMetadataEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkHdrMetadataEXT} instance allocated with {@link BufferUtils}. */
    public static VkHdrMetadataEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkHdrMetadataEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkHdrMetadataEXT} instance for the specified memory address. */
    public static VkHdrMetadataEXT create(long address) {
        return wrap(VkHdrMetadataEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkHdrMetadataEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkHdrMetadataEXT.class, address);
    }

    /**
     * Returns a new {@link VkHdrMetadataEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkHdrMetadataEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkHdrMetadataEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkHdrMetadataEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkHdrMetadataEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkHdrMetadataEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkHdrMetadataEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkHdrMetadataEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkHdrMetadataEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkHdrMetadataEXT} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkHdrMetadataEXT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkHdrMetadataEXT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkHdrMetadataEXT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkHdrMetadataEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkHdrMetadataEXT mallocStack(MemoryStack stack) {
        return wrap(VkHdrMetadataEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkHdrMetadataEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkHdrMetadataEXT callocStack(MemoryStack stack) {
        return wrap(VkHdrMetadataEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkHdrMetadataEXT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkHdrMetadataEXT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkHdrMetadataEXT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkHdrMetadataEXT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkHdrMetadataEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkHdrMetadataEXT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkHdrMetadataEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkHdrMetadataEXT.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkHdrMetadataEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkHdrMetadataEXT.PNEXT); }
    /** Unsafe version of {@link #displayPrimaryRed}. */
    public static VkXYColorEXT ndisplayPrimaryRed(long struct) { return VkXYColorEXT.create(struct + VkHdrMetadataEXT.DISPLAYPRIMARYRED); }
    /** Unsafe version of {@link #displayPrimaryGreen}. */
    public static VkXYColorEXT ndisplayPrimaryGreen(long struct) { return VkXYColorEXT.create(struct + VkHdrMetadataEXT.DISPLAYPRIMARYGREEN); }
    /** Unsafe version of {@link #displayPrimaryBlue}. */
    public static VkXYColorEXT ndisplayPrimaryBlue(long struct) { return VkXYColorEXT.create(struct + VkHdrMetadataEXT.DISPLAYPRIMARYBLUE); }
    /** Unsafe version of {@link #whitePoint}. */
    public static VkXYColorEXT nwhitePoint(long struct) { return VkXYColorEXT.create(struct + VkHdrMetadataEXT.WHITEPOINT); }
    /** Unsafe version of {@link #maxLuminance}. */
    public static float nmaxLuminance(long struct) { return UNSAFE.getFloat(null, struct + VkHdrMetadataEXT.MAXLUMINANCE); }
    /** Unsafe version of {@link #minLuminance}. */
    public static float nminLuminance(long struct) { return UNSAFE.getFloat(null, struct + VkHdrMetadataEXT.MINLUMINANCE); }
    /** Unsafe version of {@link #maxContentLightLevel}. */
    public static float nmaxContentLightLevel(long struct) { return UNSAFE.getFloat(null, struct + VkHdrMetadataEXT.MAXCONTENTLIGHTLEVEL); }
    /** Unsafe version of {@link #maxFrameAverageLightLevel}. */
    public static float nmaxFrameAverageLightLevel(long struct) { return UNSAFE.getFloat(null, struct + VkHdrMetadataEXT.MAXFRAMEAVERAGELIGHTLEVEL); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkHdrMetadataEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkHdrMetadataEXT.PNEXT, value); }
    /** Unsafe version of {@link #displayPrimaryRed(VkXYColorEXT) displayPrimaryRed}. */
    public static void ndisplayPrimaryRed(long struct, VkXYColorEXT value) { memCopy(value.address(), struct + VkHdrMetadataEXT.DISPLAYPRIMARYRED, VkXYColorEXT.SIZEOF); }
    /** Unsafe version of {@link #displayPrimaryGreen(VkXYColorEXT) displayPrimaryGreen}. */
    public static void ndisplayPrimaryGreen(long struct, VkXYColorEXT value) { memCopy(value.address(), struct + VkHdrMetadataEXT.DISPLAYPRIMARYGREEN, VkXYColorEXT.SIZEOF); }
    /** Unsafe version of {@link #displayPrimaryBlue(VkXYColorEXT) displayPrimaryBlue}. */
    public static void ndisplayPrimaryBlue(long struct, VkXYColorEXT value) { memCopy(value.address(), struct + VkHdrMetadataEXT.DISPLAYPRIMARYBLUE, VkXYColorEXT.SIZEOF); }
    /** Unsafe version of {@link #whitePoint(VkXYColorEXT) whitePoint}. */
    public static void nwhitePoint(long struct, VkXYColorEXT value) { memCopy(value.address(), struct + VkHdrMetadataEXT.WHITEPOINT, VkXYColorEXT.SIZEOF); }
    /** Unsafe version of {@link #maxLuminance(float) maxLuminance}. */
    public static void nmaxLuminance(long struct, float value) { UNSAFE.putFloat(null, struct + VkHdrMetadataEXT.MAXLUMINANCE, value); }
    /** Unsafe version of {@link #minLuminance(float) minLuminance}. */
    public static void nminLuminance(long struct, float value) { UNSAFE.putFloat(null, struct + VkHdrMetadataEXT.MINLUMINANCE, value); }
    /** Unsafe version of {@link #maxContentLightLevel(float) maxContentLightLevel}. */
    public static void nmaxContentLightLevel(long struct, float value) { UNSAFE.putFloat(null, struct + VkHdrMetadataEXT.MAXCONTENTLIGHTLEVEL, value); }
    /** Unsafe version of {@link #maxFrameAverageLightLevel(float) maxFrameAverageLightLevel}. */
    public static void nmaxFrameAverageLightLevel(long struct, float value) { UNSAFE.putFloat(null, struct + VkHdrMetadataEXT.MAXFRAMEAVERAGELIGHTLEVEL, value); }

    // -----------------------------------

    /** An array of {@link VkHdrMetadataEXT} structs. */
    public static class Buffer extends StructBuffer<VkHdrMetadataEXT, Buffer> implements NativeResource {

        private static final VkHdrMetadataEXT ELEMENT_FACTORY = VkHdrMetadataEXT.create(-1L);

        /**
         * Creates a new {@code VkHdrMetadataEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkHdrMetadataEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkHdrMetadataEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkHdrMetadataEXT.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkHdrMetadataEXT.npNext(address()); }
        /** Returns a {@link VkXYColorEXT} view of the {@code displayPrimaryRed} field. */
        public VkXYColorEXT displayPrimaryRed() { return VkHdrMetadataEXT.ndisplayPrimaryRed(address()); }
        /** Returns a {@link VkXYColorEXT} view of the {@code displayPrimaryGreen} field. */
        public VkXYColorEXT displayPrimaryGreen() { return VkHdrMetadataEXT.ndisplayPrimaryGreen(address()); }
        /** Returns a {@link VkXYColorEXT} view of the {@code displayPrimaryBlue} field. */
        public VkXYColorEXT displayPrimaryBlue() { return VkHdrMetadataEXT.ndisplayPrimaryBlue(address()); }
        /** Returns a {@link VkXYColorEXT} view of the {@code whitePoint} field. */
        public VkXYColorEXT whitePoint() { return VkHdrMetadataEXT.nwhitePoint(address()); }
        /** Returns the value of the {@code maxLuminance} field. */
        public float maxLuminance() { return VkHdrMetadataEXT.nmaxLuminance(address()); }
        /** Returns the value of the {@code minLuminance} field. */
        public float minLuminance() { return VkHdrMetadataEXT.nminLuminance(address()); }
        /** Returns the value of the {@code maxContentLightLevel} field. */
        public float maxContentLightLevel() { return VkHdrMetadataEXT.nmaxContentLightLevel(address()); }
        /** Returns the value of the {@code maxFrameAverageLightLevel} field. */
        public float maxFrameAverageLightLevel() { return VkHdrMetadataEXT.nmaxFrameAverageLightLevel(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkHdrMetadataEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkHdrMetadataEXT.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkHdrMetadataEXT.Buffer pNext(@NativeType("void const *") long value) { VkHdrMetadataEXT.npNext(address(), value); return this; }
        /** Copies the specified {@link VkXYColorEXT} to the {@code displayPrimaryRed} field. */
        public VkHdrMetadataEXT.Buffer displayPrimaryRed(VkXYColorEXT value) { VkHdrMetadataEXT.ndisplayPrimaryRed(address(), value); return this; }
        /** Passes the {@code displayPrimaryRed} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkHdrMetadataEXT.Buffer displayPrimaryRed(java.util.function.Consumer<VkXYColorEXT> consumer) { consumer.accept(displayPrimaryRed()); return this; }
        /** Copies the specified {@link VkXYColorEXT} to the {@code displayPrimaryGreen} field. */
        public VkHdrMetadataEXT.Buffer displayPrimaryGreen(VkXYColorEXT value) { VkHdrMetadataEXT.ndisplayPrimaryGreen(address(), value); return this; }
        /** Passes the {@code displayPrimaryGreen} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkHdrMetadataEXT.Buffer displayPrimaryGreen(java.util.function.Consumer<VkXYColorEXT> consumer) { consumer.accept(displayPrimaryGreen()); return this; }
        /** Copies the specified {@link VkXYColorEXT} to the {@code displayPrimaryBlue} field. */
        public VkHdrMetadataEXT.Buffer displayPrimaryBlue(VkXYColorEXT value) { VkHdrMetadataEXT.ndisplayPrimaryBlue(address(), value); return this; }
        /** Passes the {@code displayPrimaryBlue} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkHdrMetadataEXT.Buffer displayPrimaryBlue(java.util.function.Consumer<VkXYColorEXT> consumer) { consumer.accept(displayPrimaryBlue()); return this; }
        /** Copies the specified {@link VkXYColorEXT} to the {@code whitePoint} field. */
        public VkHdrMetadataEXT.Buffer whitePoint(VkXYColorEXT value) { VkHdrMetadataEXT.nwhitePoint(address(), value); return this; }
        /** Passes the {@code whitePoint} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkHdrMetadataEXT.Buffer whitePoint(java.util.function.Consumer<VkXYColorEXT> consumer) { consumer.accept(whitePoint()); return this; }
        /** Sets the specified value to the {@code maxLuminance} field. */
        public VkHdrMetadataEXT.Buffer maxLuminance(float value) { VkHdrMetadataEXT.nmaxLuminance(address(), value); return this; }
        /** Sets the specified value to the {@code minLuminance} field. */
        public VkHdrMetadataEXT.Buffer minLuminance(float value) { VkHdrMetadataEXT.nminLuminance(address(), value); return this; }
        /** Sets the specified value to the {@code maxContentLightLevel} field. */
        public VkHdrMetadataEXT.Buffer maxContentLightLevel(float value) { VkHdrMetadataEXT.nmaxContentLightLevel(address(), value); return this; }
        /** Sets the specified value to the {@code maxFrameAverageLightLevel} field. */
        public VkHdrMetadataEXT.Buffer maxFrameAverageLightLevel(float value) { VkHdrMetadataEXT.nmaxFrameAverageLightLevel(address(), value); return this; }

    }

}