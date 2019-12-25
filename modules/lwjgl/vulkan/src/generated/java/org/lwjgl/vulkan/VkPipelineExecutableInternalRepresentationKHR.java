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

import static org.lwjgl.vulkan.VK10.*;

/**
 * Structure describing the textual form of a pipeline executable internal representation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If {@code pData} is {@code NULL}, then the size, in bytes, of the internal representation data is returned in {@code dataSize}. Otherwise, {@code dataSize} must be the size of the buffer, in bytes, pointed to by {@code pData} and on return {@code dataSize} is overwritten with the number of bytes of data actually written to {@code pData} including any trailing null character. If {@code dataSize} is less than the size, in bytes, of the internal representation data, at most {@code dataSize} bytes of data will be written to {@code pData} and {@code vkGetPipelineExecutableInternalRepresentationsKHR} will return {@link VK10#VK_INCOMPLETE INCOMPLETE}. If {@code isText} is {@link VK10#VK_TRUE TRUE} and {@code pData} is not {@code NULL} and {@code dataSize} is not zero, the last byte written to {@code pData} will be a null character.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRPipelineExecutableProperties#VK_STRUCTURE_TYPE_PIPELINE_EXECUTABLE_INTERNAL_REPRESENTATION_KHR STRUCTURE_TYPE_PIPELINE_EXECUTABLE_INTERNAL_REPRESENTATION_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link KHRPipelineExecutableProperties#vkGetPipelineExecutableInternalRepresentationsKHR GetPipelineExecutableInternalRepresentationsKHR}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code name[VK_MAX_DESCRIPTION_SIZE]} &ndash; an array of {@link VK10#VK_MAX_DESCRIPTION_SIZE MAX_DESCRIPTION_SIZE} {@code char} containing a null-terminated UTF-8 string which is a short human readable name for this internal representation.</li>
 * <li>{@code description[VK_MAX_DESCRIPTION_SIZE]} &ndash; an array of {@link VK10#VK_MAX_DESCRIPTION_SIZE MAX_DESCRIPTION_SIZE} {@code char} containing a null-terminated UTF-8 string which is a human readable description for this internal representation.</li>
 * <li>{@code isText} &ndash; specifies whether the returned data is text or opaque data. If {@code isText} is {@link VK10#VK_TRUE TRUE} then the data returned in {@code pData} is text and is guaranteed to be a null-terminated UTF-8 string.</li>
 * <li>{@code dataSize} &ndash; an integer related to the size, in bytes, of the internal representation data, as described below.</li>
 * <li>{@code pData} &ndash; either {@code NULL} or a pointer to an block of data into which the implementation will write the textual form of the internal representation.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPipelineExecutableInternalRepresentationKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     char name[VK_MAX_DESCRIPTION_SIZE];
 *     char description[VK_MAX_DESCRIPTION_SIZE];
 *     VkBool32 isText;
 *     size_t dataSize;
 *     void * pData;
 * }</code></pre>
 */
public class VkPipelineExecutableInternalRepresentationKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        NAME,
        DESCRIPTION,
        ISTEXT,
        DATASIZE,
        PDATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __array(1, VK_MAX_DESCRIPTION_SIZE),
            __array(1, VK_MAX_DESCRIPTION_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        NAME = layout.offsetof(2);
        DESCRIPTION = layout.offsetof(3);
        ISTEXT = layout.offsetof(4);
        DATASIZE = layout.offsetof(5);
        PDATA = layout.offsetof(6);
    }

    /**
     * Creates a {@code VkPipelineExecutableInternalRepresentationKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineExecutableInternalRepresentationKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** Returns a {@link ByteBuffer} view of the {@code name} field. */
    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public ByteBuffer name() { return nname(address()); }
    /** Decodes the null-terminated string stored in the {@code name} field. */
    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public String nameString() { return nnameString(address()); }
    /** Returns a {@link ByteBuffer} view of the {@code description} field. */
    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public ByteBuffer description() { return ndescription(address()); }
    /** Decodes the null-terminated string stored in the {@code description} field. */
    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public String descriptionString() { return ndescriptionString(address()); }
    /** Returns the value of the {@code isText} field. */
    @NativeType("VkBool32")
    public boolean isText() { return nisText(address()) != 0; }
    /** Returns the value of the {@code dataSize} field. */
    @NativeType("size_t")
    public long dataSize() { return ndataSize(address()); }
    /** Returns a {@link ByteBuffer} view of the data pointed to by the {@code pData} field. */
    @Nullable
    @NativeType("void *")
    public ByteBuffer pData() { return npData(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPipelineExecutableInternalRepresentationKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPipelineExecutableInternalRepresentationKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineExecutableInternalRepresentationKHR set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineExecutableInternalRepresentationKHR set(VkPipelineExecutableInternalRepresentationKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineExecutableInternalRepresentationKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineExecutableInternalRepresentationKHR malloc() {
        return wrap(VkPipelineExecutableInternalRepresentationKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPipelineExecutableInternalRepresentationKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineExecutableInternalRepresentationKHR calloc() {
        return wrap(VkPipelineExecutableInternalRepresentationKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPipelineExecutableInternalRepresentationKHR} instance allocated with {@link BufferUtils}. */
    public static VkPipelineExecutableInternalRepresentationKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPipelineExecutableInternalRepresentationKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineExecutableInternalRepresentationKHR} instance for the specified memory address. */
    public static VkPipelineExecutableInternalRepresentationKHR create(long address) {
        return wrap(VkPipelineExecutableInternalRepresentationKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineExecutableInternalRepresentationKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkPipelineExecutableInternalRepresentationKHR.class, address);
    }

    /**
     * Returns a new {@link VkPipelineExecutableInternalRepresentationKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineExecutableInternalRepresentationKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineExecutableInternalRepresentationKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineExecutableInternalRepresentationKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineExecutableInternalRepresentationKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineExecutableInternalRepresentationKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPipelineExecutableInternalRepresentationKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineExecutableInternalRepresentationKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineExecutableInternalRepresentationKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineExecutableInternalRepresentationKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPipelineExecutableInternalRepresentationKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkPipelineExecutableInternalRepresentationKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPipelineExecutableInternalRepresentationKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkPipelineExecutableInternalRepresentationKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineExecutableInternalRepresentationKHR mallocStack(MemoryStack stack) {
        return wrap(VkPipelineExecutableInternalRepresentationKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPipelineExecutableInternalRepresentationKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineExecutableInternalRepresentationKHR callocStack(MemoryStack stack) {
        return wrap(VkPipelineExecutableInternalRepresentationKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPipelineExecutableInternalRepresentationKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineExecutableInternalRepresentationKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPipelineExecutableInternalRepresentationKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineExecutableInternalRepresentationKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPipelineExecutableInternalRepresentationKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineExecutableInternalRepresentationKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineExecutableInternalRepresentationKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineExecutableInternalRepresentationKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPipelineExecutableInternalRepresentationKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineExecutableInternalRepresentationKHR.PNEXT); }
    /** Unsafe version of {@link #name}. */
    public static ByteBuffer nname(long struct) { return memByteBuffer(struct + VkPipelineExecutableInternalRepresentationKHR.NAME, VK_MAX_DESCRIPTION_SIZE); }
    /** Unsafe version of {@link #nameString}. */
    public static String nnameString(long struct) { return memUTF8(struct + VkPipelineExecutableInternalRepresentationKHR.NAME); }
    /** Unsafe version of {@link #description}. */
    public static ByteBuffer ndescription(long struct) { return memByteBuffer(struct + VkPipelineExecutableInternalRepresentationKHR.DESCRIPTION, VK_MAX_DESCRIPTION_SIZE); }
    /** Unsafe version of {@link #descriptionString}. */
    public static String ndescriptionString(long struct) { return memUTF8(struct + VkPipelineExecutableInternalRepresentationKHR.DESCRIPTION); }
    /** Unsafe version of {@link #isText}. */
    public static int nisText(long struct) { return UNSAFE.getInt(null, struct + VkPipelineExecutableInternalRepresentationKHR.ISTEXT); }
    /** Unsafe version of {@link #dataSize}. */
    public static long ndataSize(long struct) { return memGetAddress(struct + VkPipelineExecutableInternalRepresentationKHR.DATASIZE); }
    /** Unsafe version of {@link #pData() pData}. */
    @Nullable public static ByteBuffer npData(long struct) { return memByteBufferSafe(memGetAddress(struct + VkPipelineExecutableInternalRepresentationKHR.PDATA), (int)ndataSize(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineExecutableInternalRepresentationKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineExecutableInternalRepresentationKHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPipelineExecutableInternalRepresentationKHR} structs. */
    public static class Buffer extends StructBuffer<VkPipelineExecutableInternalRepresentationKHR, Buffer> implements NativeResource {

        private static final VkPipelineExecutableInternalRepresentationKHR ELEMENT_FACTORY = VkPipelineExecutableInternalRepresentationKHR.create(-1L);

        /**
         * Creates a new {@code VkPipelineExecutableInternalRepresentationKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineExecutableInternalRepresentationKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkPipelineExecutableInternalRepresentationKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineExecutableInternalRepresentationKHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPipelineExecutableInternalRepresentationKHR.npNext(address()); }
        /** Returns a {@link ByteBuffer} view of the {@code name} field. */
        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public ByteBuffer name() { return VkPipelineExecutableInternalRepresentationKHR.nname(address()); }
        /** Decodes the null-terminated string stored in the {@code name} field. */
        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public String nameString() { return VkPipelineExecutableInternalRepresentationKHR.nnameString(address()); }
        /** Returns a {@link ByteBuffer} view of the {@code description} field. */
        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public ByteBuffer description() { return VkPipelineExecutableInternalRepresentationKHR.ndescription(address()); }
        /** Decodes the null-terminated string stored in the {@code description} field. */
        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public String descriptionString() { return VkPipelineExecutableInternalRepresentationKHR.ndescriptionString(address()); }
        /** Returns the value of the {@code isText} field. */
        @NativeType("VkBool32")
        public boolean isText() { return VkPipelineExecutableInternalRepresentationKHR.nisText(address()) != 0; }
        /** Returns the value of the {@code dataSize} field. */
        @NativeType("size_t")
        public long dataSize() { return VkPipelineExecutableInternalRepresentationKHR.ndataSize(address()); }
        /** Returns a {@link ByteBuffer} view of the data pointed to by the {@code pData} field. */
        @Nullable
        @NativeType("void *")
        public ByteBuffer pData() { return VkPipelineExecutableInternalRepresentationKHR.npData(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPipelineExecutableInternalRepresentationKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineExecutableInternalRepresentationKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPipelineExecutableInternalRepresentationKHR.Buffer pNext(@NativeType("void *") long value) { VkPipelineExecutableInternalRepresentationKHR.npNext(address(), value); return this; }

    }

}