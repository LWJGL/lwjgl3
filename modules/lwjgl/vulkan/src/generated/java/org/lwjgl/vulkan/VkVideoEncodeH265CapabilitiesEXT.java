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
 * Structure specifying H.265 encode capabilities.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_CAPABILITIES_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H265_CAPABILITIES_EXT}</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkVideoEncodeH265CapabilityFlagBitsEXT} values</li>
 * <li>{@code flags} <b>must</b> not be 0</li>
 * <li>{@code inputModeFlags} <b>must</b> be a valid combination of {@code VkVideoEncodeH265InputModeFlagBitsEXT} values</li>
 * <li>{@code inputModeFlags} <b>must</b> not be 0</li>
 * <li>{@code outputModeFlags} <b>must</b> be a valid combination of {@code VkVideoEncodeH265OutputModeFlagBitsEXT} values</li>
 * <li>{@code outputModeFlags} <b>must</b> not be 0</li>
 * <li>{@code ctbSizes} <b>must</b> be a valid combination of {@code VkVideoEncodeH265CtbSizeFlagBitsEXT} values</li>
 * <li>{@code ctbSizes} <b>must</b> not be 0</li>
 * <li>{@code stdExtensionVersion} <b>must</b> be a valid {@link VkExtensionProperties} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkExtensionProperties}, {@link VkExtent2D}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoEncodeH265CapabilitiesEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkVideoEncodeH265CapabilityFlagsEXT {@link #flags};
 *     VkVideoEncodeH265InputModeFlagsEXT {@link #inputModeFlags};
 *     VkVideoEncodeH265OutputModeFlagsEXT {@link #outputModeFlags};
 *     VkVideoEncodeH265CtbSizeFlagsEXT {@link #ctbSizes};
 *     {@link VkExtent2D VkExtent2D} {@link #inputImageDataAlignment};
 *     uint8_t {@link #maxNumL0ReferenceForP};
 *     uint8_t {@link #maxNumL0ReferenceForB};
 *     uint8_t {@link #maxNumL1Reference};
 *     uint8_t {@link #maxNumSubLayers};
 *     uint8_t {@link #qualityLevelCount};
 *     {@link VkExtensionProperties VkExtensionProperties} {@link #stdExtensionVersion};
 * }</code></pre>
 */
public class VkVideoEncodeH265CapabilitiesEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        INPUTMODEFLAGS,
        OUTPUTMODEFLAGS,
        CTBSIZES,
        INPUTIMAGEDATAALIGNMENT,
        MAXNUML0REFERENCEFORP,
        MAXNUML0REFERENCEFORB,
        MAXNUML1REFERENCE,
        MAXNUMSUBLAYERS,
        QUALITYLEVELCOUNT,
        STDEXTENSIONVERSION;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(VkExtensionProperties.SIZEOF, VkExtensionProperties.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        INPUTMODEFLAGS = layout.offsetof(3);
        OUTPUTMODEFLAGS = layout.offsetof(4);
        CTBSIZES = layout.offsetof(5);
        INPUTIMAGEDATAALIGNMENT = layout.offsetof(6);
        MAXNUML0REFERENCEFORP = layout.offsetof(7);
        MAXNUML0REFERENCEFORB = layout.offsetof(8);
        MAXNUML1REFERENCE = layout.offsetof(9);
        MAXNUMSUBLAYERS = layout.offsetof(10);
        QUALITYLEVELCOUNT = layout.offsetof(11);
        STDEXTENSIONVERSION = layout.offsetof(12);
    }

    /**
     * Creates a {@code VkVideoEncodeH265CapabilitiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeH265CapabilitiesEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** reserved for future use. */
    @NativeType("VkVideoEncodeH265CapabilityFlagsEXT")
    public int flags() { return nflags(address()); }
    /** a bitmask of {@code VkVideoEncodeH265InputModeFlagBitsEXT} describing the command buffer input granularities/modes supported by the implementation. */
    @NativeType("VkVideoEncodeH265InputModeFlagsEXT")
    public int inputModeFlags() { return ninputModeFlags(address()); }
    /** a bitmask of {@code VkVideoEncodeH265OutputModeFlagBitsEXT} describing the output (bitstream size reporting) granularities/modes supported by the implementation. */
    @NativeType("VkVideoEncodeH265OutputModeFlagsEXT")
    public int outputModeFlags() { return noutputModeFlags(address()); }
    /** a bitmask of {@code VkVideoEncodeH265CtbSizeFlagBitsEXT} describing the supported CTB sizes. */
    @NativeType("VkVideoEncodeH265CtbSizeFlagsEXT")
    public int ctbSizes() { return nctbSizes(address()); }
    /** reports the alignment, in pixels, for the width and height of the picture data within the images used in video encoding. */
    public VkExtent2D inputImageDataAlignment() { return ninputImageDataAlignment(address()); }
    /** reports the maximum number of reference pictures the implementation supports in the reference list L0 for P pictures. */
    @NativeType("uint8_t")
    public byte maxNumL0ReferenceForP() { return nmaxNumL0ReferenceForP(address()); }
    /** reports the maximum number of reference pictures the implementation supports in the reference list L0 for B pictures. The reported value is 0 if encoding of B pictures is not supported. */
    @NativeType("uint8_t")
    public byte maxNumL0ReferenceForB() { return nmaxNumL0ReferenceForB(address()); }
    /** reports the maximum number of reference pictures the implementation supports in the reference list L1 if encoding of B pictures is supported. The reported value is 0 if encoding of B pictures is not supported. */
    @NativeType("uint8_t")
    public byte maxNumL1Reference() { return nmaxNumL1Reference(address()); }
    /** reports the maximum number of sublayers. */
    @NativeType("uint8_t")
    public byte maxNumSubLayers() { return nmaxNumSubLayers(address()); }
    /** the number of quality levels supported. */
    @NativeType("uint8_t")
    public byte qualityLevelCount() { return nqualityLevelCount(address()); }
    /** a {@link VkExtensionProperties} structure in which the H.265 extension name and version supported by the implementation are returned. */
    public VkExtensionProperties stdExtensionVersion() { return nstdExtensionVersion(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoEncodeH265CapabilitiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_CAPABILITIES_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H265_CAPABILITIES_EXT} value to the {@link #sType} field. */
    public VkVideoEncodeH265CapabilitiesEXT sType$Default() { return sType(EXTVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_CAPABILITIES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoEncodeH265CapabilitiesEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public VkVideoEncodeH265CapabilitiesEXT flags(@NativeType("VkVideoEncodeH265CapabilityFlagsEXT") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #inputModeFlags} field. */
    public VkVideoEncodeH265CapabilitiesEXT inputModeFlags(@NativeType("VkVideoEncodeH265InputModeFlagsEXT") int value) { ninputModeFlags(address(), value); return this; }
    /** Sets the specified value to the {@link #outputModeFlags} field. */
    public VkVideoEncodeH265CapabilitiesEXT outputModeFlags(@NativeType("VkVideoEncodeH265OutputModeFlagsEXT") int value) { noutputModeFlags(address(), value); return this; }
    /** Sets the specified value to the {@link #ctbSizes} field. */
    public VkVideoEncodeH265CapabilitiesEXT ctbSizes(@NativeType("VkVideoEncodeH265CtbSizeFlagsEXT") int value) { nctbSizes(address(), value); return this; }
    /** Copies the specified {@link VkExtent2D} to the {@link #inputImageDataAlignment} field. */
    public VkVideoEncodeH265CapabilitiesEXT inputImageDataAlignment(VkExtent2D value) { ninputImageDataAlignment(address(), value); return this; }
    /** Passes the {@link #inputImageDataAlignment} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkVideoEncodeH265CapabilitiesEXT inputImageDataAlignment(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(inputImageDataAlignment()); return this; }
    /** Sets the specified value to the {@link #maxNumL0ReferenceForP} field. */
    public VkVideoEncodeH265CapabilitiesEXT maxNumL0ReferenceForP(@NativeType("uint8_t") byte value) { nmaxNumL0ReferenceForP(address(), value); return this; }
    /** Sets the specified value to the {@link #maxNumL0ReferenceForB} field. */
    public VkVideoEncodeH265CapabilitiesEXT maxNumL0ReferenceForB(@NativeType("uint8_t") byte value) { nmaxNumL0ReferenceForB(address(), value); return this; }
    /** Sets the specified value to the {@link #maxNumL1Reference} field. */
    public VkVideoEncodeH265CapabilitiesEXT maxNumL1Reference(@NativeType("uint8_t") byte value) { nmaxNumL1Reference(address(), value); return this; }
    /** Sets the specified value to the {@link #maxNumSubLayers} field. */
    public VkVideoEncodeH265CapabilitiesEXT maxNumSubLayers(@NativeType("uint8_t") byte value) { nmaxNumSubLayers(address(), value); return this; }
    /** Sets the specified value to the {@link #qualityLevelCount} field. */
    public VkVideoEncodeH265CapabilitiesEXT qualityLevelCount(@NativeType("uint8_t") byte value) { nqualityLevelCount(address(), value); return this; }
    /** Copies the specified {@link VkExtensionProperties} to the {@link #stdExtensionVersion} field. */
    public VkVideoEncodeH265CapabilitiesEXT stdExtensionVersion(VkExtensionProperties value) { nstdExtensionVersion(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH265CapabilitiesEXT set(
        int sType,
        long pNext,
        int flags,
        int inputModeFlags,
        int outputModeFlags,
        int ctbSizes,
        VkExtent2D inputImageDataAlignment,
        byte maxNumL0ReferenceForP,
        byte maxNumL0ReferenceForB,
        byte maxNumL1Reference,
        byte maxNumSubLayers,
        byte qualityLevelCount,
        VkExtensionProperties stdExtensionVersion
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        inputModeFlags(inputModeFlags);
        outputModeFlags(outputModeFlags);
        ctbSizes(ctbSizes);
        inputImageDataAlignment(inputImageDataAlignment);
        maxNumL0ReferenceForP(maxNumL0ReferenceForP);
        maxNumL0ReferenceForB(maxNumL0ReferenceForB);
        maxNumL1Reference(maxNumL1Reference);
        maxNumSubLayers(maxNumSubLayers);
        qualityLevelCount(qualityLevelCount);
        stdExtensionVersion(stdExtensionVersion);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoEncodeH265CapabilitiesEXT set(VkVideoEncodeH265CapabilitiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH265CapabilitiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265CapabilitiesEXT malloc() {
        return wrap(VkVideoEncodeH265CapabilitiesEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkVideoEncodeH265CapabilitiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265CapabilitiesEXT calloc() {
        return wrap(VkVideoEncodeH265CapabilitiesEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkVideoEncodeH265CapabilitiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH265CapabilitiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkVideoEncodeH265CapabilitiesEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH265CapabilitiesEXT} instance for the specified memory address. */
    public static VkVideoEncodeH265CapabilitiesEXT create(long address) {
        return wrap(VkVideoEncodeH265CapabilitiesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH265CapabilitiesEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkVideoEncodeH265CapabilitiesEXT.class, address);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265CapabilitiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265CapabilitiesEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265CapabilitiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265CapabilitiesEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265CapabilitiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265CapabilitiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkVideoEncodeH265CapabilitiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265CapabilitiesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH265CapabilitiesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }


    /**
     * Returns a new {@code VkVideoEncodeH265CapabilitiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265CapabilitiesEXT malloc(MemoryStack stack) {
        return wrap(VkVideoEncodeH265CapabilitiesEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkVideoEncodeH265CapabilitiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265CapabilitiesEXT calloc(MemoryStack stack) {
        return wrap(VkVideoEncodeH265CapabilitiesEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkVideoEncodeH265CapabilitiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265CapabilitiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265CapabilitiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265CapabilitiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265CapabilitiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeH265CapabilitiesEXT.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265CapabilitiesEXT.FLAGS); }
    /** Unsafe version of {@link #inputModeFlags}. */
    public static int ninputModeFlags(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265CapabilitiesEXT.INPUTMODEFLAGS); }
    /** Unsafe version of {@link #outputModeFlags}. */
    public static int noutputModeFlags(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265CapabilitiesEXT.OUTPUTMODEFLAGS); }
    /** Unsafe version of {@link #ctbSizes}. */
    public static int nctbSizes(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265CapabilitiesEXT.CTBSIZES); }
    /** Unsafe version of {@link #inputImageDataAlignment}. */
    public static VkExtent2D ninputImageDataAlignment(long struct) { return VkExtent2D.create(struct + VkVideoEncodeH265CapabilitiesEXT.INPUTIMAGEDATAALIGNMENT); }
    /** Unsafe version of {@link #maxNumL0ReferenceForP}. */
    public static byte nmaxNumL0ReferenceForP(long struct) { return UNSAFE.getByte(null, struct + VkVideoEncodeH265CapabilitiesEXT.MAXNUML0REFERENCEFORP); }
    /** Unsafe version of {@link #maxNumL0ReferenceForB}. */
    public static byte nmaxNumL0ReferenceForB(long struct) { return UNSAFE.getByte(null, struct + VkVideoEncodeH265CapabilitiesEXT.MAXNUML0REFERENCEFORB); }
    /** Unsafe version of {@link #maxNumL1Reference}. */
    public static byte nmaxNumL1Reference(long struct) { return UNSAFE.getByte(null, struct + VkVideoEncodeH265CapabilitiesEXT.MAXNUML1REFERENCE); }
    /** Unsafe version of {@link #maxNumSubLayers}. */
    public static byte nmaxNumSubLayers(long struct) { return UNSAFE.getByte(null, struct + VkVideoEncodeH265CapabilitiesEXT.MAXNUMSUBLAYERS); }
    /** Unsafe version of {@link #qualityLevelCount}. */
    public static byte nqualityLevelCount(long struct) { return UNSAFE.getByte(null, struct + VkVideoEncodeH265CapabilitiesEXT.QUALITYLEVELCOUNT); }
    /** Unsafe version of {@link #stdExtensionVersion}. */
    public static VkExtensionProperties nstdExtensionVersion(long struct) { return VkExtensionProperties.create(struct + VkVideoEncodeH265CapabilitiesEXT.STDEXTENSIONVERSION); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265CapabilitiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeH265CapabilitiesEXT.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265CapabilitiesEXT.FLAGS, value); }
    /** Unsafe version of {@link #inputModeFlags(int) inputModeFlags}. */
    public static void ninputModeFlags(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265CapabilitiesEXT.INPUTMODEFLAGS, value); }
    /** Unsafe version of {@link #outputModeFlags(int) outputModeFlags}. */
    public static void noutputModeFlags(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265CapabilitiesEXT.OUTPUTMODEFLAGS, value); }
    /** Unsafe version of {@link #ctbSizes(int) ctbSizes}. */
    public static void nctbSizes(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265CapabilitiesEXT.CTBSIZES, value); }
    /** Unsafe version of {@link #inputImageDataAlignment(VkExtent2D) inputImageDataAlignment}. */
    public static void ninputImageDataAlignment(long struct, VkExtent2D value) { memCopy(value.address(), struct + VkVideoEncodeH265CapabilitiesEXT.INPUTIMAGEDATAALIGNMENT, VkExtent2D.SIZEOF); }
    /** Unsafe version of {@link #maxNumL0ReferenceForP(byte) maxNumL0ReferenceForP}. */
    public static void nmaxNumL0ReferenceForP(long struct, byte value) { UNSAFE.putByte(null, struct + VkVideoEncodeH265CapabilitiesEXT.MAXNUML0REFERENCEFORP, value); }
    /** Unsafe version of {@link #maxNumL0ReferenceForB(byte) maxNumL0ReferenceForB}. */
    public static void nmaxNumL0ReferenceForB(long struct, byte value) { UNSAFE.putByte(null, struct + VkVideoEncodeH265CapabilitiesEXT.MAXNUML0REFERENCEFORB, value); }
    /** Unsafe version of {@link #maxNumL1Reference(byte) maxNumL1Reference}. */
    public static void nmaxNumL1Reference(long struct, byte value) { UNSAFE.putByte(null, struct + VkVideoEncodeH265CapabilitiesEXT.MAXNUML1REFERENCE, value); }
    /** Unsafe version of {@link #maxNumSubLayers(byte) maxNumSubLayers}. */
    public static void nmaxNumSubLayers(long struct, byte value) { UNSAFE.putByte(null, struct + VkVideoEncodeH265CapabilitiesEXT.MAXNUMSUBLAYERS, value); }
    /** Unsafe version of {@link #qualityLevelCount(byte) qualityLevelCount}. */
    public static void nqualityLevelCount(long struct, byte value) { UNSAFE.putByte(null, struct + VkVideoEncodeH265CapabilitiesEXT.QUALITYLEVELCOUNT, value); }
    /** Unsafe version of {@link #stdExtensionVersion(VkExtensionProperties) stdExtensionVersion}. */
    public static void nstdExtensionVersion(long struct, VkExtensionProperties value) { memCopy(value.address(), struct + VkVideoEncodeH265CapabilitiesEXT.STDEXTENSIONVERSION, VkExtensionProperties.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH265CapabilitiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH265CapabilitiesEXT, Buffer> implements NativeResource {

        private static final VkVideoEncodeH265CapabilitiesEXT ELEMENT_FACTORY = VkVideoEncodeH265CapabilitiesEXT.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH265CapabilitiesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH265CapabilitiesEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkVideoEncodeH265CapabilitiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeH265CapabilitiesEXT.nsType(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeH265CapabilitiesEXT.npNext(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesEXT#flags} field. */
        @NativeType("VkVideoEncodeH265CapabilityFlagsEXT")
        public int flags() { return VkVideoEncodeH265CapabilitiesEXT.nflags(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesEXT#inputModeFlags} field. */
        @NativeType("VkVideoEncodeH265InputModeFlagsEXT")
        public int inputModeFlags() { return VkVideoEncodeH265CapabilitiesEXT.ninputModeFlags(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesEXT#outputModeFlags} field. */
        @NativeType("VkVideoEncodeH265OutputModeFlagsEXT")
        public int outputModeFlags() { return VkVideoEncodeH265CapabilitiesEXT.noutputModeFlags(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesEXT#ctbSizes} field. */
        @NativeType("VkVideoEncodeH265CtbSizeFlagsEXT")
        public int ctbSizes() { return VkVideoEncodeH265CapabilitiesEXT.nctbSizes(address()); }
        /** @return a {@link VkExtent2D} view of the {@link VkVideoEncodeH265CapabilitiesEXT#inputImageDataAlignment} field. */
        public VkExtent2D inputImageDataAlignment() { return VkVideoEncodeH265CapabilitiesEXT.ninputImageDataAlignment(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesEXT#maxNumL0ReferenceForP} field. */
        @NativeType("uint8_t")
        public byte maxNumL0ReferenceForP() { return VkVideoEncodeH265CapabilitiesEXT.nmaxNumL0ReferenceForP(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesEXT#maxNumL0ReferenceForB} field. */
        @NativeType("uint8_t")
        public byte maxNumL0ReferenceForB() { return VkVideoEncodeH265CapabilitiesEXT.nmaxNumL0ReferenceForB(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesEXT#maxNumL1Reference} field. */
        @NativeType("uint8_t")
        public byte maxNumL1Reference() { return VkVideoEncodeH265CapabilitiesEXT.nmaxNumL1Reference(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesEXT#maxNumSubLayers} field. */
        @NativeType("uint8_t")
        public byte maxNumSubLayers() { return VkVideoEncodeH265CapabilitiesEXT.nmaxNumSubLayers(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesEXT#qualityLevelCount} field. */
        @NativeType("uint8_t")
        public byte qualityLevelCount() { return VkVideoEncodeH265CapabilitiesEXT.nqualityLevelCount(address()); }
        /** @return a {@link VkExtensionProperties} view of the {@link VkVideoEncodeH265CapabilitiesEXT#stdExtensionVersion} field. */
        public VkExtensionProperties stdExtensionVersion() { return VkVideoEncodeH265CapabilitiesEXT.nstdExtensionVersion(address()); }

        /** Sets the specified value to the {@link VkVideoEncodeH265CapabilitiesEXT#sType} field. */
        public VkVideoEncodeH265CapabilitiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH265CapabilitiesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_CAPABILITIES_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H265_CAPABILITIES_EXT} value to the {@link VkVideoEncodeH265CapabilitiesEXT#sType} field. */
        public VkVideoEncodeH265CapabilitiesEXT.Buffer sType$Default() { return sType(EXTVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_CAPABILITIES_EXT); }
        /** Sets the specified value to the {@link VkVideoEncodeH265CapabilitiesEXT#pNext} field. */
        public VkVideoEncodeH265CapabilitiesEXT.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeH265CapabilitiesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265CapabilitiesEXT#flags} field. */
        public VkVideoEncodeH265CapabilitiesEXT.Buffer flags(@NativeType("VkVideoEncodeH265CapabilityFlagsEXT") int value) { VkVideoEncodeH265CapabilitiesEXT.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265CapabilitiesEXT#inputModeFlags} field. */
        public VkVideoEncodeH265CapabilitiesEXT.Buffer inputModeFlags(@NativeType("VkVideoEncodeH265InputModeFlagsEXT") int value) { VkVideoEncodeH265CapabilitiesEXT.ninputModeFlags(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265CapabilitiesEXT#outputModeFlags} field. */
        public VkVideoEncodeH265CapabilitiesEXT.Buffer outputModeFlags(@NativeType("VkVideoEncodeH265OutputModeFlagsEXT") int value) { VkVideoEncodeH265CapabilitiesEXT.noutputModeFlags(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265CapabilitiesEXT#ctbSizes} field. */
        public VkVideoEncodeH265CapabilitiesEXT.Buffer ctbSizes(@NativeType("VkVideoEncodeH265CtbSizeFlagsEXT") int value) { VkVideoEncodeH265CapabilitiesEXT.nctbSizes(address(), value); return this; }
        /** Copies the specified {@link VkExtent2D} to the {@link VkVideoEncodeH265CapabilitiesEXT#inputImageDataAlignment} field. */
        public VkVideoEncodeH265CapabilitiesEXT.Buffer inputImageDataAlignment(VkExtent2D value) { VkVideoEncodeH265CapabilitiesEXT.ninputImageDataAlignment(address(), value); return this; }
        /** Passes the {@link VkVideoEncodeH265CapabilitiesEXT#inputImageDataAlignment} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkVideoEncodeH265CapabilitiesEXT.Buffer inputImageDataAlignment(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(inputImageDataAlignment()); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265CapabilitiesEXT#maxNumL0ReferenceForP} field. */
        public VkVideoEncodeH265CapabilitiesEXT.Buffer maxNumL0ReferenceForP(@NativeType("uint8_t") byte value) { VkVideoEncodeH265CapabilitiesEXT.nmaxNumL0ReferenceForP(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265CapabilitiesEXT#maxNumL0ReferenceForB} field. */
        public VkVideoEncodeH265CapabilitiesEXT.Buffer maxNumL0ReferenceForB(@NativeType("uint8_t") byte value) { VkVideoEncodeH265CapabilitiesEXT.nmaxNumL0ReferenceForB(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265CapabilitiesEXT#maxNumL1Reference} field. */
        public VkVideoEncodeH265CapabilitiesEXT.Buffer maxNumL1Reference(@NativeType("uint8_t") byte value) { VkVideoEncodeH265CapabilitiesEXT.nmaxNumL1Reference(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265CapabilitiesEXT#maxNumSubLayers} field. */
        public VkVideoEncodeH265CapabilitiesEXT.Buffer maxNumSubLayers(@NativeType("uint8_t") byte value) { VkVideoEncodeH265CapabilitiesEXT.nmaxNumSubLayers(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265CapabilitiesEXT#qualityLevelCount} field. */
        public VkVideoEncodeH265CapabilitiesEXT.Buffer qualityLevelCount(@NativeType("uint8_t") byte value) { VkVideoEncodeH265CapabilitiesEXT.nqualityLevelCount(address(), value); return this; }
        /** Copies the specified {@link VkExtensionProperties} to the {@link VkVideoEncodeH265CapabilitiesEXT#stdExtensionVersion} field. */
        public VkVideoEncodeH265CapabilitiesEXT.Buffer stdExtensionVersion(VkExtensionProperties value) { VkVideoEncodeH265CapabilitiesEXT.nstdExtensionVersion(address(), value); return this; }

    }

}