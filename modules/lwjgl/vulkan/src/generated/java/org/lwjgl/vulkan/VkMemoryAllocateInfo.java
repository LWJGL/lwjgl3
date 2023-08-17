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
 * Structure containing parameters of a memory allocation.
 * 
 * <h5>Description</h5>
 * 
 * <p>The internal data of an allocated device memory object <b>must</b> include a reference to implementation-specific resources, referred to as the memory object’s <em>payload</em>. Applications <b>can</b> also import and export that internal data to and from device memory objects to share data between Vulkan instances and other compatible APIs. A {@link VkMemoryAllocateInfo} structure defines a memory import operation if its {@code pNext} chain includes one of the following structures:</p>
 * 
 * <ul>
 * <li>{@link VkImportMemoryWin32HandleInfoKHR} with a non-zero {@code handleType} value</li>
 * <li>{@link VkImportMemoryFdInfoKHR} with a non-zero {@code handleType} value</li>
 * <li>{@link VkImportMemoryHostPointerInfoEXT} with a non-zero {@code handleType} value</li>
 * <li>{@link VkImportAndroidHardwareBufferInfoANDROID} with a non-{@code NULL} {@code buffer} value</li>
 * </ul>
 * 
 * <p>If the parameters define an import operation and the external handle type is {@link VK11#VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT}, {@link VK11#VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT}, or {@link VK11#VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT}, {@code allocationSize} is ignored. The implementation <b>must</b> query the size of these allocations from the OS.</p>
 * 
 * <p>Whether device memory objects constructed via a memory import operation hold a reference to their payload depends on the properties of the handle type used to perform the import, as defined below for each valid handle type. Importing memory <b>must</b> not modify the content of the memory. Implementations <b>must</b> ensure that importing memory does not enable the importing Vulkan instance to access any memory or resources in other Vulkan instances other than that corresponding to the memory object imported. Implementations <b>must</b> also ensure accessing imported memory which has not been initialized does not allow the importing Vulkan instance to obtain data from the exporting Vulkan instance or vice-versa.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>How exported and imported memory is isolated is left to the implementation, but applications should be aware that such isolation <b>may</b> prevent implementations from placing multiple exportable memory objects in the same physical or virtual page. Hence, applications <b>should</b> avoid creating many small external memory objects whenever possible.</p>
 * </div>
 * 
 * <p>Importing memory <b>must</b> not increase overall heap usage within a system. However, it <b>must</b> affect the following per-process values:</p>
 * 
 * <ul>
 * <li>{@link VkPhysicalDeviceMaintenance3Properties}{@code ::maxMemoryAllocationCount}</li>
 * <li>{@link VkPhysicalDeviceMemoryBudgetPropertiesEXT}{@code ::heapUsage}</li>
 * </ul>
 * 
 * <p>When performing a memory import operation, it is the responsibility of the application to ensure the external handles and their associated payloads meet all valid usage requirements. However, implementations <b>must</b> perform sufficient validation of external handles and payloads to ensure that the operation results in a valid memory object which will not cause program termination, device loss, queue stalls, or corruption of other resources when used as allowed according to its allocation parameters. If the external handle provided does not meet these requirements, the implementation <b>must</b> fail the memory import operation with the error code {@link VK11#VK_ERROR_INVALID_EXTERNAL_HANDLE ERROR_INVALID_EXTERNAL_HANDLE}. If the parameters define an export operation and the external handle type is {@link ANDROIDExternalMemoryAndroidHardwareBuffer#VK_EXTERNAL_MEMORY_HANDLE_TYPE_ANDROID_HARDWARE_BUFFER_BIT_ANDROID EXTERNAL_MEMORY_HANDLE_TYPE_ANDROID_HARDWARE_BUFFER_BIT_ANDROID}, implementations <b>should</b> not strictly follow {@code memoryTypeIndex}. Instead, they <b>should</b> modify the allocation internally to use the required memory type for the application’s given usage. This is because for an export operation, there is currently no way for the client to know the memory type index before allocating.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>The parameters <b>must</b> not define more than one <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#memory-import-operation">import operation</a></li>
 * <li>If the parameters do not define an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#memory-import-operation">import or export operation</a>, {@code allocationSize} <b>must</b> be greater than 0</li>
 * <li>If the parameters define an export operation and the handle type is not {@link ANDROIDExternalMemoryAndroidHardwareBuffer#VK_EXTERNAL_MEMORY_HANDLE_TYPE_ANDROID_HARDWARE_BUFFER_BIT_ANDROID EXTERNAL_MEMORY_HANDLE_TYPE_ANDROID_HARDWARE_BUFFER_BIT_ANDROID}, {@code allocationSize} <b>must</b> be greater than 0</li>
 * <li>If the {@code pNext} chain includes a {@link VkExportMemoryAllocateInfo} structure, and any of the handle types specified in {@link VkExportMemoryAllocateInfo}{@code ::handleTypes} require a dedicated allocation, as reported by {@link VK11#vkGetPhysicalDeviceImageFormatProperties2 GetPhysicalDeviceImageFormatProperties2} in {@link VkExternalImageFormatProperties}{@code ::externalMemoryProperties.externalMemoryFeatures}, or by {@link VK11#vkGetPhysicalDeviceExternalBufferProperties GetPhysicalDeviceExternalBufferProperties} in {@link VkExternalBufferProperties}{@code ::externalMemoryProperties.externalMemoryFeatures}, the {@code pNext} chain <b>must</b> include a {@link VkMemoryDedicatedAllocateInfo} or {@link VkDedicatedAllocationMemoryAllocateInfoNV} structure with either its {@code image} or {@code buffer} member set to a value other than {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
 * <li>If the {@code pNext} chain includes a {@link VkExportMemoryAllocateInfo} structure, it <b>must</b> not include a {@link VkExportMemoryAllocateInfoNV} or {@link VkExportMemoryWin32HandleInfoNV} structure</li>
 * <li>If the {@code pNext} chain includes a {@link VkImportMemoryWin32HandleInfoKHR} structure, it <b>must</b> not include a {@link VkImportMemoryWin32HandleInfoNV} structure</li>
 * <li>If the parameters define an import operation, the external handle specified was created by the Vulkan API, and the external handle type is {@link VK11#VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD_BIT EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD_BIT}, then the values of {@code allocationSize} and {@code memoryTypeIndex} <b>must</b> match those specified when the payload being imported was created</li>
 * <li>If the parameters define an import operation and the external handle specified was created by the Vulkan API, the device mask specified by {@link VkMemoryAllocateFlagsInfo} <b>must</b> match the mask specified when the payload being imported was allocated</li>
 * <li>If the parameters define an import operation and the external handle specified was created by the Vulkan API, the list of physical devices that comprise the logical device passed to {@link VK10#vkAllocateMemory AllocateMemory} <b>must</b> match the list of physical devices that comprise the logical device on which the payload was originally allocated</li>
 * <li>If the parameters define an import operation and the external handle is an NT handle or a global share handle created outside of the Vulkan API, the value of {@code memoryTypeIndex} <b>must</b> be one of those returned by {@link KHRExternalMemoryWin32#vkGetMemoryWin32HandlePropertiesKHR GetMemoryWin32HandlePropertiesKHR}</li>
 * <li>If the parameters define an import operation, the external handle was created by the Vulkan API, and the external handle type is {@link VK11#VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT} or {@link VK11#VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT}, then the values of {@code allocationSize} and {@code memoryTypeIndex} <b>must</b> match those specified when the payload being imported was created</li>
 * <li>If the parameters define an import operation and the external handle type is {@link VK11#VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT}, {@code allocationSize} <b>must</b> match the size specified when creating the Direct3D 12 heap from which the payload was extracted</li>
 * <li>If the parameters define an import operation and the external handle is a POSIX file descriptor created outside of the Vulkan API, the value of {@code memoryTypeIndex} <b>must</b> be one of those returned by {@link KHRExternalMemoryFd#vkGetMemoryFdPropertiesKHR GetMemoryFdPropertiesKHR}</li>
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-protectedMemory">{@code protectedMemory}</a> feature is not enabled, the {@link VkMemoryAllocateInfo}{@code ::memoryTypeIndex} <b>must</b> not indicate a memory type that reports {@link VK11#VK_MEMORY_PROPERTY_PROTECTED_BIT MEMORY_PROPERTY_PROTECTED_BIT}</li>
 * <li>If the parameters define an import operation and the external handle is a host pointer, the value of {@code memoryTypeIndex} <b>must</b> be one of those returned by {@link EXTExternalMemoryHost#vkGetMemoryHostPointerPropertiesEXT GetMemoryHostPointerPropertiesEXT}</li>
 * <li>If the parameters define an import operation and the external handle is a host pointer, {@code allocationSize} <b>must</b> be an integer multiple of {@link VkPhysicalDeviceExternalMemoryHostPropertiesEXT}{@code ::minImportedHostPointerAlignment}</li>
 * <li>If the parameters define an import operation and the external handle is a host pointer, the {@code pNext} chain <b>must</b> not include a {@link VkDedicatedAllocationMemoryAllocateInfoNV} structure with either its {@code image} or {@code buffer} field set to a value other than {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
 * <li>If the parameters define an import operation and the external handle is a host pointer, the {@code pNext} chain <b>must</b> not include a {@link VkMemoryDedicatedAllocateInfo} structure with either its {@code image} or {@code buffer} field set to a value other than {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
 * <li>If the parameters define an import operation and the external handle type is {@link ANDROIDExternalMemoryAndroidHardwareBuffer#VK_EXTERNAL_MEMORY_HANDLE_TYPE_ANDROID_HARDWARE_BUFFER_BIT_ANDROID EXTERNAL_MEMORY_HANDLE_TYPE_ANDROID_HARDWARE_BUFFER_BIT_ANDROID}, {@code allocationSize} <b>must</b> be the size returned by {@link ANDROIDExternalMemoryAndroidHardwareBuffer#vkGetAndroidHardwareBufferPropertiesANDROID GetAndroidHardwareBufferPropertiesANDROID} for the Android hardware buffer</li>
 * <li>If the parameters define an import operation and the external handle type is {@link ANDROIDExternalMemoryAndroidHardwareBuffer#VK_EXTERNAL_MEMORY_HANDLE_TYPE_ANDROID_HARDWARE_BUFFER_BIT_ANDROID EXTERNAL_MEMORY_HANDLE_TYPE_ANDROID_HARDWARE_BUFFER_BIT_ANDROID}, and the {@code pNext} chain does not include a {@link VkMemoryDedicatedAllocateInfo} structure or {@link VkMemoryDedicatedAllocateInfo}{@code ::image} is {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the Android hardware buffer <b>must</b> have a {@code AHardwareBuffer_Desc}{@code ::format} of {@code AHARDWAREBUFFER_FORMAT_BLOB} and a {@code AHardwareBuffer_Desc}{@code ::usage} that includes {@code AHARDWAREBUFFER_USAGE_GPU_DATA_BUFFER}</li>
 * <li>If the parameters define an import operation and the external handle type is {@link ANDROIDExternalMemoryAndroidHardwareBuffer#VK_EXTERNAL_MEMORY_HANDLE_TYPE_ANDROID_HARDWARE_BUFFER_BIT_ANDROID EXTERNAL_MEMORY_HANDLE_TYPE_ANDROID_HARDWARE_BUFFER_BIT_ANDROID}, {@code memoryTypeIndex} <b>must</b> be one of those returned by {@link ANDROIDExternalMemoryAndroidHardwareBuffer#vkGetAndroidHardwareBufferPropertiesANDROID GetAndroidHardwareBufferPropertiesANDROID} for the Android hardware buffer</li>
 * <li>If the parameters do not define an import operation, and the {@code pNext} chain includes a {@link VkExportMemoryAllocateInfo} structure with {@link ANDROIDExternalMemoryAndroidHardwareBuffer#VK_EXTERNAL_MEMORY_HANDLE_TYPE_ANDROID_HARDWARE_BUFFER_BIT_ANDROID EXTERNAL_MEMORY_HANDLE_TYPE_ANDROID_HARDWARE_BUFFER_BIT_ANDROID} included in its {@code handleTypes} member, and the {@code pNext} chain includes a {@link VkMemoryDedicatedAllocateInfo} structure with {@code image} not equal to {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, then {@code allocationSize} <b>must</b> be 0</li>
 * <li>If the parameters define an export operation, the handle type is {@link ANDROIDExternalMemoryAndroidHardwareBuffer#VK_EXTERNAL_MEMORY_HANDLE_TYPE_ANDROID_HARDWARE_BUFFER_BIT_ANDROID EXTERNAL_MEMORY_HANDLE_TYPE_ANDROID_HARDWARE_BUFFER_BIT_ANDROID}, and the {@code pNext} does not include a {@link VkMemoryDedicatedAllocateInfo} structure, {@code allocationSize} <b>must</b> be greater than 0</li>
 * <li>If the parameters define an export operation, the handle type is {@link ANDROIDExternalMemoryAndroidHardwareBuffer#VK_EXTERNAL_MEMORY_HANDLE_TYPE_ANDROID_HARDWARE_BUFFER_BIT_ANDROID EXTERNAL_MEMORY_HANDLE_TYPE_ANDROID_HARDWARE_BUFFER_BIT_ANDROID}, and the {@code pNext} chain includes a {@link VkMemoryDedicatedAllocateInfo} structure with {@code buffer} set to a valid {@code VkBuffer} object, {@code allocationSize} <b>must</b> be greater than 0</li>
 * <li>If the parameters define an import operation, the external handle is an Android hardware buffer, and the {@code pNext} chain includes a {@link VkMemoryDedicatedAllocateInfo} with {@code image} that is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the Android hardware buffer’s {@code AHardwareBuffer}{@code ::usage} <b>must</b> include at least one of {@code AHARDWAREBUFFER_USAGE_GPU_FRAMEBUFFER}, {@code AHARDWAREBUFFER_USAGE_GPU_SAMPLED_IMAGE} or {@code AHARDWAREBUFFER_USAGE_GPU_DATA_BUFFER}</li>
 * <li>If the parameters define an import operation, the external handle is an Android hardware buffer, and the {@code pNext} chain includes a {@link VkMemoryDedicatedAllocateInfo} with {@code image} that is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the format of {@code image} <b>must</b> be {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED} or the format returned by {@link ANDROIDExternalMemoryAndroidHardwareBuffer#vkGetAndroidHardwareBufferPropertiesANDROID GetAndroidHardwareBufferPropertiesANDROID} in {@link VkAndroidHardwareBufferFormatPropertiesANDROID}{@code ::format} for the Android hardware buffer</li>
 * <li>If the parameters define an import operation, the external handle is an Android hardware buffer, and the {@code pNext} chain includes a {@link VkMemoryDedicatedAllocateInfo} structure with {@code image} that is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the width, height, and array layer dimensions of {@code image} and the Android hardware buffer’s {@code AHardwareBuffer_Desc} <b>must</b> be identical</li>
 * <li>If the parameters define an import operation, the external handle is an Android hardware buffer, and the {@code pNext} chain includes a {@link VkMemoryDedicatedAllocateInfo} structure with {@code image} that is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, and the Android hardware buffer’s {@code AHardwareBuffer}{@code ::usage} includes {@code AHARDWAREBUFFER_USAGE_GPU_MIPMAP_COMPLETE}, the {@code image} <b>must</b> have a complete mipmap chain</li>
 * <li>If the parameters define an import operation, the external handle is an Android hardware buffer, and the {@code pNext} chain includes a {@link VkMemoryDedicatedAllocateInfo} structure with {@code image} that is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, and the Android hardware buffer’s {@code AHardwareBuffer}{@code ::usage} does not include {@code AHARDWAREBUFFER_USAGE_GPU_MIPMAP_COMPLETE}, the {@code image} <b>must</b> have exactly one mipmap level</li>
 * <li>If the parameters define an import operation, the external handle is an Android hardware buffer, and the {@code pNext} chain includes a {@link VkMemoryDedicatedAllocateInfo} structure with {@code image} that is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, each bit set in the usage of {@code image} <b>must</b> be listed in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#memory-external-android-hardware-buffer-usage">AHardwareBuffer Usage Equivalence</a>, and if there is a corresponding {@code AHARDWAREBUFFER_USAGE} bit listed that bit <b>must</b> be included in the Android hardware buffer’s {@code AHardwareBuffer_Desc}{@code ::usage}</li>
 * <li>If {@link VkMemoryOpaqueCaptureAddressAllocateInfo}{@code ::opaqueCaptureAddress} is not zero, {@link VkMemoryAllocateFlagsInfo}{@code ::flags} <b>must</b> include {@link VK12#VK_MEMORY_ALLOCATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT MEMORY_ALLOCATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT}</li>
 * <li>If {@link VkMemoryAllocateFlagsInfo}{@code ::flags} includes {@link VK12#VK_MEMORY_ALLOCATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT MEMORY_ALLOCATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT}, the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-bufferDeviceAddressCaptureReplay">{@code bufferDeviceAddressCaptureReplay}</a> feature <b>must</b> be enabled</li>
 * <li>If {@link VkMemoryAllocateFlagsInfo}{@code ::flags} includes {@link VK12#VK_MEMORY_ALLOCATE_DEVICE_ADDRESS_BIT MEMORY_ALLOCATE_DEVICE_ADDRESS_BIT}, the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-bufferDeviceAddress">{@code bufferDeviceAddress}</a> feature <b>must</b> be enabled</li>
 * <li>If the {@code pNext} chain includes a {@link VkImportMemoryHostPointerInfoEXT} structure, {@link VkMemoryOpaqueCaptureAddressAllocateInfo}{@code ::opaqueCaptureAddress} <b>must</b> be zero</li>
 * <li>If the parameters define an import operation, {@link VkMemoryOpaqueCaptureAddressAllocateInfo}{@code ::opaqueCaptureAddress} <b>must</b> be zero</li>
 * <li>If the {@code pNext} chain includes a {@link VkExportMetalObjectCreateInfoEXT} structure, its {@code exportObjectType} member <b>must</b> be {@link EXTMetalObjects#VK_EXPORT_METAL_OBJECT_TYPE_METAL_BUFFER_BIT_EXT EXPORT_METAL_OBJECT_TYPE_METAL_BUFFER_BIT_EXT}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_INFO STRUCTURE_TYPE_MEMORY_ALLOCATE_INFO}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkDedicatedAllocationMemoryAllocateInfoNV}, {@link VkExportMemoryAllocateInfo}, {@link VkExportMemoryAllocateInfoNV}, {@link VkExportMemoryWin32HandleInfoKHR}, {@link VkExportMemoryWin32HandleInfoNV}, {@link VkExportMetalObjectCreateInfoEXT}, {@link VkImportAndroidHardwareBufferInfoANDROID}, {@link VkImportMemoryFdInfoKHR}, {@link VkImportMemoryHostPointerInfoEXT}, {@link VkImportMemoryWin32HandleInfoKHR}, {@link VkImportMemoryWin32HandleInfoNV}, {@link VkImportMetalBufferInfoEXT}, {@link VkMemoryAllocateFlagsInfo}, {@link VkMemoryDedicatedAllocateInfo}, {@link VkMemoryOpaqueCaptureAddressAllocateInfo}, or {@link VkMemoryPriorityAllocateInfoEXT}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique, with the exception of structures of type {@link VkExportMetalObjectCreateInfoEXT}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VK10#vkAllocateMemory AllocateMemory}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkMemoryAllocateInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkDeviceSize {@link #allocationSize};
 *     uint32_t {@link #memoryTypeIndex};
 * }</code></pre>
 */
public class VkMemoryAllocateInfo extends Struct<VkMemoryAllocateInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        ALLOCATIONSIZE,
        MEMORYTYPEINDEX;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ALLOCATIONSIZE = layout.offsetof(2);
        MEMORYTYPEINDEX = layout.offsetof(3);
    }

    protected VkMemoryAllocateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkMemoryAllocateInfo create(long address, @Nullable ByteBuffer container) {
        return new VkMemoryAllocateInfo(address, container);
    }

    /**
     * Creates a {@code VkMemoryAllocateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMemoryAllocateInfo(ByteBuffer container) {
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
    /** the size of the allocation in bytes. */
    @NativeType("VkDeviceSize")
    public long allocationSize() { return nallocationSize(address()); }
    /** an index identifying a memory type from the {@code memoryTypes} array of the {@link VkPhysicalDeviceMemoryProperties} structure. */
    @NativeType("uint32_t")
    public int memoryTypeIndex() { return nmemoryTypeIndex(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkMemoryAllocateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK10#VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_INFO STRUCTURE_TYPE_MEMORY_ALLOCATE_INFO} value to the {@link #sType} field. */
    public VkMemoryAllocateInfo sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkMemoryAllocateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkDedicatedAllocationMemoryAllocateInfoNV} value to the {@code pNext} chain. */
    public VkMemoryAllocateInfo pNext(VkDedicatedAllocationMemoryAllocateInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkExportMemoryAllocateInfo} value to the {@code pNext} chain. */
    public VkMemoryAllocateInfo pNext(VkExportMemoryAllocateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkExportMemoryAllocateInfoKHR} value to the {@code pNext} chain. */
    public VkMemoryAllocateInfo pNext(VkExportMemoryAllocateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkExportMemoryAllocateInfoNV} value to the {@code pNext} chain. */
    public VkMemoryAllocateInfo pNext(VkExportMemoryAllocateInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkExportMemoryWin32HandleInfoKHR} value to the {@code pNext} chain. */
    public VkMemoryAllocateInfo pNext(VkExportMemoryWin32HandleInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkExportMemoryWin32HandleInfoNV} value to the {@code pNext} chain. */
    public VkMemoryAllocateInfo pNext(VkExportMemoryWin32HandleInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkExportMetalObjectCreateInfoEXT} value to the {@code pNext} chain. */
    public VkMemoryAllocateInfo pNext(VkExportMetalObjectCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkImportAndroidHardwareBufferInfoANDROID} value to the {@code pNext} chain. */
    public VkMemoryAllocateInfo pNext(VkImportAndroidHardwareBufferInfoANDROID value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkImportMemoryFdInfoKHR} value to the {@code pNext} chain. */
    public VkMemoryAllocateInfo pNext(VkImportMemoryFdInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkImportMemoryHostPointerInfoEXT} value to the {@code pNext} chain. */
    public VkMemoryAllocateInfo pNext(VkImportMemoryHostPointerInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkImportMemoryWin32HandleInfoKHR} value to the {@code pNext} chain. */
    public VkMemoryAllocateInfo pNext(VkImportMemoryWin32HandleInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkImportMemoryWin32HandleInfoNV} value to the {@code pNext} chain. */
    public VkMemoryAllocateInfo pNext(VkImportMemoryWin32HandleInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkImportMetalBufferInfoEXT} value to the {@code pNext} chain. */
    public VkMemoryAllocateInfo pNext(VkImportMetalBufferInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkMemoryAllocateFlagsInfo} value to the {@code pNext} chain. */
    public VkMemoryAllocateInfo pNext(VkMemoryAllocateFlagsInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkMemoryAllocateFlagsInfoKHR} value to the {@code pNext} chain. */
    public VkMemoryAllocateInfo pNext(VkMemoryAllocateFlagsInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkMemoryDedicatedAllocateInfo} value to the {@code pNext} chain. */
    public VkMemoryAllocateInfo pNext(VkMemoryDedicatedAllocateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkMemoryDedicatedAllocateInfoKHR} value to the {@code pNext} chain. */
    public VkMemoryAllocateInfo pNext(VkMemoryDedicatedAllocateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkMemoryOpaqueCaptureAddressAllocateInfo} value to the {@code pNext} chain. */
    public VkMemoryAllocateInfo pNext(VkMemoryOpaqueCaptureAddressAllocateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkMemoryOpaqueCaptureAddressAllocateInfoKHR} value to the {@code pNext} chain. */
    public VkMemoryAllocateInfo pNext(VkMemoryOpaqueCaptureAddressAllocateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkMemoryPriorityAllocateInfoEXT} value to the {@code pNext} chain. */
    public VkMemoryAllocateInfo pNext(VkMemoryPriorityAllocateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@link #allocationSize} field. */
    public VkMemoryAllocateInfo allocationSize(@NativeType("VkDeviceSize") long value) { nallocationSize(address(), value); return this; }
    /** Sets the specified value to the {@link #memoryTypeIndex} field. */
    public VkMemoryAllocateInfo memoryTypeIndex(@NativeType("uint32_t") int value) { nmemoryTypeIndex(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkMemoryAllocateInfo set(
        int sType,
        long pNext,
        long allocationSize,
        int memoryTypeIndex
    ) {
        sType(sType);
        pNext(pNext);
        allocationSize(allocationSize);
        memoryTypeIndex(memoryTypeIndex);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkMemoryAllocateInfo set(VkMemoryAllocateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkMemoryAllocateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkMemoryAllocateInfo malloc() {
        return new VkMemoryAllocateInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkMemoryAllocateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkMemoryAllocateInfo calloc() {
        return new VkMemoryAllocateInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkMemoryAllocateInfo} instance allocated with {@link BufferUtils}. */
    public static VkMemoryAllocateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMemoryAllocateInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkMemoryAllocateInfo} instance for the specified memory address. */
    public static VkMemoryAllocateInfo create(long address) {
        return new VkMemoryAllocateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMemoryAllocateInfo createSafe(long address) {
        return address == NULL ? null : new VkMemoryAllocateInfo(address, null);
    }

    /**
     * Returns a new {@link VkMemoryAllocateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryAllocateInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkMemoryAllocateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryAllocateInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryAllocateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryAllocateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkMemoryAllocateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkMemoryAllocateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMemoryAllocateInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkMemoryAllocateInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkMemoryAllocateInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkMemoryAllocateInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkMemoryAllocateInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkMemoryAllocateInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkMemoryAllocateInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkMemoryAllocateInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkMemoryAllocateInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkMemoryAllocateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryAllocateInfo malloc(MemoryStack stack) {
        return new VkMemoryAllocateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkMemoryAllocateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryAllocateInfo calloc(MemoryStack stack) {
        return new VkMemoryAllocateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkMemoryAllocateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryAllocateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryAllocateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryAllocateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkMemoryAllocateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkMemoryAllocateInfo.PNEXT); }
    /** Unsafe version of {@link #allocationSize}. */
    public static long nallocationSize(long struct) { return UNSAFE.getLong(null, struct + VkMemoryAllocateInfo.ALLOCATIONSIZE); }
    /** Unsafe version of {@link #memoryTypeIndex}. */
    public static int nmemoryTypeIndex(long struct) { return UNSAFE.getInt(null, struct + VkMemoryAllocateInfo.MEMORYTYPEINDEX); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkMemoryAllocateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkMemoryAllocateInfo.PNEXT, value); }
    /** Unsafe version of {@link #allocationSize(long) allocationSize}. */
    public static void nallocationSize(long struct, long value) { UNSAFE.putLong(null, struct + VkMemoryAllocateInfo.ALLOCATIONSIZE, value); }
    /** Unsafe version of {@link #memoryTypeIndex(int) memoryTypeIndex}. */
    public static void nmemoryTypeIndex(long struct, int value) { UNSAFE.putInt(null, struct + VkMemoryAllocateInfo.MEMORYTYPEINDEX, value); }

    // -----------------------------------

    /** An array of {@link VkMemoryAllocateInfo} structs. */
    public static class Buffer extends StructBuffer<VkMemoryAllocateInfo, Buffer> implements NativeResource {

        private static final VkMemoryAllocateInfo ELEMENT_FACTORY = VkMemoryAllocateInfo.create(-1L);

        /**
         * Creates a new {@code VkMemoryAllocateInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMemoryAllocateInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkMemoryAllocateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkMemoryAllocateInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkMemoryAllocateInfo.nsType(address()); }
        /** @return the value of the {@link VkMemoryAllocateInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkMemoryAllocateInfo.npNext(address()); }
        /** @return the value of the {@link VkMemoryAllocateInfo#allocationSize} field. */
        @NativeType("VkDeviceSize")
        public long allocationSize() { return VkMemoryAllocateInfo.nallocationSize(address()); }
        /** @return the value of the {@link VkMemoryAllocateInfo#memoryTypeIndex} field. */
        @NativeType("uint32_t")
        public int memoryTypeIndex() { return VkMemoryAllocateInfo.nmemoryTypeIndex(address()); }

        /** Sets the specified value to the {@link VkMemoryAllocateInfo#sType} field. */
        public VkMemoryAllocateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkMemoryAllocateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK10#VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_INFO STRUCTURE_TYPE_MEMORY_ALLOCATE_INFO} value to the {@link VkMemoryAllocateInfo#sType} field. */
        public VkMemoryAllocateInfo.Buffer sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_INFO); }
        /** Sets the specified value to the {@link VkMemoryAllocateInfo#pNext} field. */
        public VkMemoryAllocateInfo.Buffer pNext(@NativeType("void const *") long value) { VkMemoryAllocateInfo.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkDedicatedAllocationMemoryAllocateInfoNV} value to the {@code pNext} chain. */
        public VkMemoryAllocateInfo.Buffer pNext(VkDedicatedAllocationMemoryAllocateInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkExportMemoryAllocateInfo} value to the {@code pNext} chain. */
        public VkMemoryAllocateInfo.Buffer pNext(VkExportMemoryAllocateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkExportMemoryAllocateInfoKHR} value to the {@code pNext} chain. */
        public VkMemoryAllocateInfo.Buffer pNext(VkExportMemoryAllocateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkExportMemoryAllocateInfoNV} value to the {@code pNext} chain. */
        public VkMemoryAllocateInfo.Buffer pNext(VkExportMemoryAllocateInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkExportMemoryWin32HandleInfoKHR} value to the {@code pNext} chain. */
        public VkMemoryAllocateInfo.Buffer pNext(VkExportMemoryWin32HandleInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkExportMemoryWin32HandleInfoNV} value to the {@code pNext} chain. */
        public VkMemoryAllocateInfo.Buffer pNext(VkExportMemoryWin32HandleInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkExportMetalObjectCreateInfoEXT} value to the {@code pNext} chain. */
        public VkMemoryAllocateInfo.Buffer pNext(VkExportMetalObjectCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkImportAndroidHardwareBufferInfoANDROID} value to the {@code pNext} chain. */
        public VkMemoryAllocateInfo.Buffer pNext(VkImportAndroidHardwareBufferInfoANDROID value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkImportMemoryFdInfoKHR} value to the {@code pNext} chain. */
        public VkMemoryAllocateInfo.Buffer pNext(VkImportMemoryFdInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkImportMemoryHostPointerInfoEXT} value to the {@code pNext} chain. */
        public VkMemoryAllocateInfo.Buffer pNext(VkImportMemoryHostPointerInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkImportMemoryWin32HandleInfoKHR} value to the {@code pNext} chain. */
        public VkMemoryAllocateInfo.Buffer pNext(VkImportMemoryWin32HandleInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkImportMemoryWin32HandleInfoNV} value to the {@code pNext} chain. */
        public VkMemoryAllocateInfo.Buffer pNext(VkImportMemoryWin32HandleInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkImportMetalBufferInfoEXT} value to the {@code pNext} chain. */
        public VkMemoryAllocateInfo.Buffer pNext(VkImportMetalBufferInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkMemoryAllocateFlagsInfo} value to the {@code pNext} chain. */
        public VkMemoryAllocateInfo.Buffer pNext(VkMemoryAllocateFlagsInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkMemoryAllocateFlagsInfoKHR} value to the {@code pNext} chain. */
        public VkMemoryAllocateInfo.Buffer pNext(VkMemoryAllocateFlagsInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkMemoryDedicatedAllocateInfo} value to the {@code pNext} chain. */
        public VkMemoryAllocateInfo.Buffer pNext(VkMemoryDedicatedAllocateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkMemoryDedicatedAllocateInfoKHR} value to the {@code pNext} chain. */
        public VkMemoryAllocateInfo.Buffer pNext(VkMemoryDedicatedAllocateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkMemoryOpaqueCaptureAddressAllocateInfo} value to the {@code pNext} chain. */
        public VkMemoryAllocateInfo.Buffer pNext(VkMemoryOpaqueCaptureAddressAllocateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkMemoryOpaqueCaptureAddressAllocateInfoKHR} value to the {@code pNext} chain. */
        public VkMemoryAllocateInfo.Buffer pNext(VkMemoryOpaqueCaptureAddressAllocateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkMemoryPriorityAllocateInfoEXT} value to the {@code pNext} chain. */
        public VkMemoryAllocateInfo.Buffer pNext(VkMemoryPriorityAllocateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@link VkMemoryAllocateInfo#allocationSize} field. */
        public VkMemoryAllocateInfo.Buffer allocationSize(@NativeType("VkDeviceSize") long value) { VkMemoryAllocateInfo.nallocationSize(address(), value); return this; }
        /** Sets the specified value to the {@link VkMemoryAllocateInfo#memoryTypeIndex} field. */
        public VkMemoryAllocateInfo.Buffer memoryTypeIndex(@NativeType("uint32_t") int value) { VkMemoryAllocateInfo.nmemoryTypeIndex(address(), value); return this; }

    }

}