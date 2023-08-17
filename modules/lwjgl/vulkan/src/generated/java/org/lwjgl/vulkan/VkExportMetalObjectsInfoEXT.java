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
 * Structure whose pNext chain identifies Vulkan objects and corresponding Metal objects.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If the {@code pNext} chain includes a {@link VkExportMetalDeviceInfoEXT} structure, the {@code VkInstance} <b>must</b> have been created with {@link EXTMetalObjects#VK_EXPORT_METAL_OBJECT_TYPE_METAL_DEVICE_BIT_EXT EXPORT_METAL_OBJECT_TYPE_METAL_DEVICE_BIT_EXT} in the {@code exportObjectType} member of a {@link VkExportMetalObjectCreateInfoEXT} structure in the {@code pNext} chain of the {@link VkInstanceCreateInfo} structure in the {@link VK10#vkCreateInstance CreateInstance} command</li>
 * <li>If the {@code pNext} chain includes a {@link VkExportMetalCommandQueueInfoEXT} structure, the {@code VkInstance} <b>must</b> have been created with {@link EXTMetalObjects#VK_EXPORT_METAL_OBJECT_TYPE_METAL_COMMAND_QUEUE_BIT_EXT EXPORT_METAL_OBJECT_TYPE_METAL_COMMAND_QUEUE_BIT_EXT} in the {@code exportObjectType} member of a {@link VkExportMetalObjectCreateInfoEXT} structure in the {@code pNext} chain of the {@link VkInstanceCreateInfo} structure in the {@link VK10#vkCreateInstance CreateInstance} command</li>
 * <li>If the {@code pNext} chain includes a {@link VkExportMetalBufferInfoEXT} structure, the {@code VkDeviceMemory} in its {@code memory} member <b>must</b> have been allocated with {@link EXTMetalObjects#VK_EXPORT_METAL_OBJECT_TYPE_METAL_BUFFER_BIT_EXT EXPORT_METAL_OBJECT_TYPE_METAL_BUFFER_BIT_EXT} in the {@code exportObjectType} member of a {@link VkExportMetalObjectCreateInfoEXT} structure in the {@code pNext} chain of the {@link VkMemoryAllocateInfo} structure in the {@link VK10#vkAllocateMemory AllocateMemory} command</li>
 * <li>If the {@code pNext} chain includes a {@link VkExportMetalTextureInfoEXT} structure, exactly one of its {@code image}, {@code imageView}, or {@code bufferView} members <b>must</b> not be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
 * <li>If the {@code pNext} chain includes a {@link VkExportMetalTextureInfoEXT} structure, and its {@code image} member is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the {@code VkImage} in its {@code image} member <b>must</b> have been created with {@link EXTMetalObjects#VK_EXPORT_METAL_OBJECT_TYPE_METAL_TEXTURE_BIT_EXT EXPORT_METAL_OBJECT_TYPE_METAL_TEXTURE_BIT_EXT} in the {@code exportObjectType} member of a {@link VkExportMetalObjectCreateInfoEXT} structure in the {@code pNext} chain of the {@link VkImageCreateInfo} structure in the {@link VK10#vkCreateImage CreateImage} command</li>
 * <li>If the {@code pNext} chain includes a {@link VkExportMetalTextureInfoEXT} structure, and its {@code imageView} member is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the {@code VkImageView} in its {@code imageView} member <b>must</b> have been created with {@link EXTMetalObjects#VK_EXPORT_METAL_OBJECT_TYPE_METAL_TEXTURE_BIT_EXT EXPORT_METAL_OBJECT_TYPE_METAL_TEXTURE_BIT_EXT} in the {@code exportObjectType} member of a {@link VkExportMetalObjectCreateInfoEXT} structure in the {@code pNext} chain of the {@link VkImageViewCreateInfo} structure in the {@link VK10#vkCreateImageView CreateImageView} command</li>
 * <li>If the {@code pNext} chain includes a {@link VkExportMetalTextureInfoEXT} structure, and its {@code bufferView} member is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the {@code VkBufferView} in its {@code bufferView} member <b>must</b> have been created with {@link EXTMetalObjects#VK_EXPORT_METAL_OBJECT_TYPE_METAL_TEXTURE_BIT_EXT EXPORT_METAL_OBJECT_TYPE_METAL_TEXTURE_BIT_EXT} in the {@code exportObjectType} member of a {@link VkExportMetalObjectCreateInfoEXT} structure in the {@code pNext} chain of the {@link VkBufferViewCreateInfo} structure in the {@link VK10#vkCreateBufferView CreateBufferView} command</li>
 * <li>If the {@code pNext} chain includes a {@link VkExportMetalTextureInfoEXT} structure, and if either its {@code image} or {@code imageView} member is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, then {@code plane} <b>must</b> be {@link VK11#VK_IMAGE_ASPECT_PLANE_0_BIT IMAGE_ASPECT_PLANE_0_BIT}, {@link VK11#VK_IMAGE_ASPECT_PLANE_1_BIT IMAGE_ASPECT_PLANE_1_BIT}, or {@link VK11#VK_IMAGE_ASPECT_PLANE_2_BIT IMAGE_ASPECT_PLANE_2_BIT}</li>
 * <li>If the {@code pNext} chain includes a {@link VkExportMetalTextureInfoEXT} structure, and if the {@code VkImage} in its {@code image} member does not have a multi-planar format, then its {@code plane} member <b>must</b> be {@link VK11#VK_IMAGE_ASPECT_PLANE_0_BIT IMAGE_ASPECT_PLANE_0_BIT}</li>
 * <li>If the {@code pNext} chain includes a {@link VkExportMetalTextureInfoEXT} structure, and if the {@code VkImage} in its {@code image} member has a multi-planar format with only two planes, then its {@code plane} member <b>must</b> not be {@link VK11#VK_IMAGE_ASPECT_PLANE_2_BIT IMAGE_ASPECT_PLANE_2_BIT}</li>
 * <li>If the {@code pNext} chain includes a {@link VkExportMetalTextureInfoEXT} structure, and if the {@code VkImageView} in its {@code imageView} member does not have a multi-planar format, then its {@code plane} member <b>must</b> be {@link VK11#VK_IMAGE_ASPECT_PLANE_0_BIT IMAGE_ASPECT_PLANE_0_BIT}</li>
 * <li>If the {@code pNext} chain includes a {@link VkExportMetalTextureInfoEXT} structure, and if the {@code VkImageView} in its {@code imageView} member has a multi-planar format with only two planes, then its {@code plane} member <b>must</b> not be {@link VK11#VK_IMAGE_ASPECT_PLANE_2_BIT IMAGE_ASPECT_PLANE_2_BIT}</li>
 * <li>If the {@code pNext} chain includes a {@link VkExportMetalIOSurfaceInfoEXT} structure, the {@code VkImage} in its {@code image} member <b>must</b> have been created with {@link EXTMetalObjects#VK_EXPORT_METAL_OBJECT_TYPE_METAL_IOSURFACE_BIT_EXT EXPORT_METAL_OBJECT_TYPE_METAL_IOSURFACE_BIT_EXT} in the {@code exportObjectType} member of a {@link VkExportMetalObjectCreateInfoEXT} structure in the {@code pNext} chain of the {@link VkImageCreateInfo} structure in the {@link VK10#vkCreateImage CreateImage} command</li>
 * <li>If the {@code pNext} chain includes a {@link VkExportMetalSharedEventInfoEXT} structure, exactly one of its {@code semaphore} or {@code event} members <b>must</b> not be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
 * <li>If the {@code pNext} chain includes a {@link VkExportMetalSharedEventInfoEXT} structure, and its {@code semaphore} member is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the {@code VkSemaphore} in its {@code semaphore} member <b>must</b> have been created with {@link EXTMetalObjects#VK_EXPORT_METAL_OBJECT_TYPE_METAL_SHARED_EVENT_BIT_EXT EXPORT_METAL_OBJECT_TYPE_METAL_SHARED_EVENT_BIT_EXT} in the {@code exportObjectType} member of a {@link VkExportMetalObjectCreateInfoEXT} structure in the {@code pNext} chain of the {@link VkSemaphoreCreateInfo} structure in the {@link VK10#vkCreateSemaphore CreateSemaphore} command</li>
 * <li>If the {@code pNext} chain includes a {@link VkExportMetalSharedEventInfoEXT} structure, and its {@code event} member is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the {@code VkEvent} in its {@code event} member <b>must</b> have been created with {@link EXTMetalObjects#VK_EXPORT_METAL_OBJECT_TYPE_METAL_SHARED_EVENT_BIT_EXT EXPORT_METAL_OBJECT_TYPE_METAL_SHARED_EVENT_BIT_EXT} in the {@code exportObjectType} member of a {@link VkExportMetalObjectCreateInfoEXT} structure in the {@code pNext} chain of the {@link VkEventCreateInfo} structure in the {@link VK10#vkCreateEvent CreateEvent} command</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTMetalObjects#VK_STRUCTURE_TYPE_EXPORT_METAL_OBJECTS_INFO_EXT STRUCTURE_TYPE_EXPORT_METAL_OBJECTS_INFO_EXT}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkExportMetalBufferInfoEXT}, {@link VkExportMetalCommandQueueInfoEXT}, {@link VkExportMetalDeviceInfoEXT}, {@link VkExportMetalIOSurfaceInfoEXT}, {@link VkExportMetalSharedEventInfoEXT}, or {@link VkExportMetalTextureInfoEXT}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique, with the exception of structures of type {@link VkExportMetalBufferInfoEXT}, {@link VkExportMetalCommandQueueInfoEXT}, {@link VkExportMetalIOSurfaceInfoEXT}, {@link VkExportMetalSharedEventInfoEXT}, or {@link VkExportMetalTextureInfoEXT}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link EXTMetalObjects#vkExportMetalObjectsEXT ExportMetalObjectsEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkExportMetalObjectsInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 * }</code></pre>
 */
public class VkExportMetalObjectsInfoEXT extends Struct<VkExportMetalObjectsInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
    }

    protected VkExportMetalObjectsInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkExportMetalObjectsInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkExportMetalObjectsInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkExportMetalObjectsInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkExportMetalObjectsInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkExportMetalObjectsInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTMetalObjects#VK_STRUCTURE_TYPE_EXPORT_METAL_OBJECTS_INFO_EXT STRUCTURE_TYPE_EXPORT_METAL_OBJECTS_INFO_EXT} value to the {@link #sType} field. */
    public VkExportMetalObjectsInfoEXT sType$Default() { return sType(EXTMetalObjects.VK_STRUCTURE_TYPE_EXPORT_METAL_OBJECTS_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkExportMetalObjectsInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkExportMetalBufferInfoEXT} value to the {@code pNext} chain. */
    public VkExportMetalObjectsInfoEXT pNext(VkExportMetalBufferInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkExportMetalCommandQueueInfoEXT} value to the {@code pNext} chain. */
    public VkExportMetalObjectsInfoEXT pNext(VkExportMetalCommandQueueInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkExportMetalDeviceInfoEXT} value to the {@code pNext} chain. */
    public VkExportMetalObjectsInfoEXT pNext(VkExportMetalDeviceInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkExportMetalIOSurfaceInfoEXT} value to the {@code pNext} chain. */
    public VkExportMetalObjectsInfoEXT pNext(VkExportMetalIOSurfaceInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkExportMetalSharedEventInfoEXT} value to the {@code pNext} chain. */
    public VkExportMetalObjectsInfoEXT pNext(VkExportMetalSharedEventInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkExportMetalTextureInfoEXT} value to the {@code pNext} chain. */
    public VkExportMetalObjectsInfoEXT pNext(VkExportMetalTextureInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }

    /** Initializes this struct with the specified values. */
    public VkExportMetalObjectsInfoEXT set(
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
    public VkExportMetalObjectsInfoEXT set(VkExportMetalObjectsInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkExportMetalObjectsInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkExportMetalObjectsInfoEXT malloc() {
        return new VkExportMetalObjectsInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkExportMetalObjectsInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkExportMetalObjectsInfoEXT calloc() {
        return new VkExportMetalObjectsInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkExportMetalObjectsInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkExportMetalObjectsInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkExportMetalObjectsInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkExportMetalObjectsInfoEXT} instance for the specified memory address. */
    public static VkExportMetalObjectsInfoEXT create(long address) {
        return new VkExportMetalObjectsInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkExportMetalObjectsInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkExportMetalObjectsInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkExportMetalObjectsInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExportMetalObjectsInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkExportMetalObjectsInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExportMetalObjectsInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExportMetalObjectsInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkExportMetalObjectsInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkExportMetalObjectsInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkExportMetalObjectsInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkExportMetalObjectsInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkExportMetalObjectsInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExportMetalObjectsInfoEXT malloc(MemoryStack stack) {
        return new VkExportMetalObjectsInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkExportMetalObjectsInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExportMetalObjectsInfoEXT calloc(MemoryStack stack) {
        return new VkExportMetalObjectsInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkExportMetalObjectsInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExportMetalObjectsInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExportMetalObjectsInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExportMetalObjectsInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkExportMetalObjectsInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkExportMetalObjectsInfoEXT.PNEXT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkExportMetalObjectsInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkExportMetalObjectsInfoEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkExportMetalObjectsInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkExportMetalObjectsInfoEXT, Buffer> implements NativeResource {

        private static final VkExportMetalObjectsInfoEXT ELEMENT_FACTORY = VkExportMetalObjectsInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkExportMetalObjectsInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkExportMetalObjectsInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkExportMetalObjectsInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkExportMetalObjectsInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkExportMetalObjectsInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkExportMetalObjectsInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkExportMetalObjectsInfoEXT.npNext(address()); }

        /** Sets the specified value to the {@link VkExportMetalObjectsInfoEXT#sType} field. */
        public VkExportMetalObjectsInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkExportMetalObjectsInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTMetalObjects#VK_STRUCTURE_TYPE_EXPORT_METAL_OBJECTS_INFO_EXT STRUCTURE_TYPE_EXPORT_METAL_OBJECTS_INFO_EXT} value to the {@link VkExportMetalObjectsInfoEXT#sType} field. */
        public VkExportMetalObjectsInfoEXT.Buffer sType$Default() { return sType(EXTMetalObjects.VK_STRUCTURE_TYPE_EXPORT_METAL_OBJECTS_INFO_EXT); }
        /** Sets the specified value to the {@link VkExportMetalObjectsInfoEXT#pNext} field. */
        public VkExportMetalObjectsInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkExportMetalObjectsInfoEXT.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkExportMetalBufferInfoEXT} value to the {@code pNext} chain. */
        public VkExportMetalObjectsInfoEXT.Buffer pNext(VkExportMetalBufferInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkExportMetalCommandQueueInfoEXT} value to the {@code pNext} chain. */
        public VkExportMetalObjectsInfoEXT.Buffer pNext(VkExportMetalCommandQueueInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkExportMetalDeviceInfoEXT} value to the {@code pNext} chain. */
        public VkExportMetalObjectsInfoEXT.Buffer pNext(VkExportMetalDeviceInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkExportMetalIOSurfaceInfoEXT} value to the {@code pNext} chain. */
        public VkExportMetalObjectsInfoEXT.Buffer pNext(VkExportMetalIOSurfaceInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkExportMetalSharedEventInfoEXT} value to the {@code pNext} chain. */
        public VkExportMetalObjectsInfoEXT.Buffer pNext(VkExportMetalSharedEventInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkExportMetalTextureInfoEXT} value to the {@code pNext} chain. */
        public VkExportMetalObjectsInfoEXT.Buffer pNext(VkExportMetalTextureInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }

    }

}