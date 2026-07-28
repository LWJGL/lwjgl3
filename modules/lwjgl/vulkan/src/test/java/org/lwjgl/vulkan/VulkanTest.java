/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;
import org.testng.annotations.*;

import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.testng.Assert.*;

@Test
public class VulkanTest {

    public void testParse() {
        try (MemoryStack stack = stackPush()) {
            VkAccelerationStructureInstanceKHR struct = VkAccelerationStructureInstanceKHR.calloc(stack);

            // first bitfield
            assertEquals(VkAccelerationStructureInstanceKHR.nbitfield0(struct.address()), 0);

            assertEquals(struct.instanceCustomIndex(), 0);
            assertEquals(struct.mask(), 0);

            struct.instanceCustomIndex(0x99FFFFFF); // test masking
            assertEquals(struct.instanceCustomIndex(), 0xFFFFFF);
            assertEquals(struct.mask(), 0);

            struct.mask(0x999999FF); // test masking
            assertEquals(struct.instanceCustomIndex(), 0xFFFFFF);
            assertEquals(struct.mask(), 0xFF);

            // second bitfield
            assertEquals(VkAccelerationStructureInstanceKHR.nbitfield1(struct.address()), 0);

            assertEquals(struct.instanceShaderBindingTableRecordOffset(), 0);
            assertEquals(struct.flags(), 0);

            struct.instanceShaderBindingTableRecordOffset(0x99FFFFFF); // test masking
            assertEquals(struct.instanceShaderBindingTableRecordOffset(), 0xFFFFFF);
            assertEquals(struct.flags(), 0);

            struct.flags(0x999999FF); // test masking
            assertEquals(struct.instanceShaderBindingTableRecordOffset(), 0xFFFFFF);
            assertEquals(struct.flags(), 0xFF);
        }
    }

    public void testPNext() {
        try (MemoryStack stack = stackPush()) {
            VkDeviceCreateInfo base = VkDeviceCreateInfo.calloc(stack);

            VkPhysicalDeviceDescriptorIndexingFeatures a = VkPhysicalDeviceDescriptorIndexingFeatures.calloc(stack);
            VkPhysicalDevice8BitStorageFeatures        b = VkPhysicalDevice8BitStorageFeatures.calloc(stack);
            VkPhysicalDevice16BitStorageFeatures       c = VkPhysicalDevice16BitStorageFeatures.calloc(stack);
            VkPhysicalDeviceDynamicRenderingFeatures   d = VkPhysicalDeviceDynamicRenderingFeatures.calloc(stack);

            // Approach 1: call pNext in reverse order, final order is base -> a -> b -> c -> d
            // This is the LWJGL-recommended/idiomatic approach.

            base
                .pNext(d)
                .pNext(c)
                .pNext(b)
                .pNext(a);

            assertEquals(base.pNext(), a.address());
            assertEquals(a.pNext(), b.address());
            assertEquals(b.pNext(), c.address());
            assertEquals(c.pNext(), d.address());
            assertEquals(d.pNext(), NULL);

            base.pNext(NULL);
            a.pNext(NULL);
            b.pNext(NULL);
            c.pNext(NULL);
            d.pNext(NULL);

            // Approach 2: call pNext in normal order, final order is base -> d -> c -> b -> a
            // This should work in practice, but leads to reversed order of pNext pointers,

            base
                .pNext(a)
                .pNext(b)
                .pNext(c)
                .pNext(d);

            assertEquals(base.pNext(), d.address());
            assertEquals(d.pNext(), c.address());
            assertEquals(c.pNext(), b.address());
            assertEquals(b.pNext(), a.address());
            assertEquals(a.pNext(), NULL);

            base.pNext(NULL);
            a.pNext(NULL);
            b.pNext(NULL);
            c.pNext(NULL);
            d.pNext(NULL);

            // Approach 3: use unsafe pNext calls, final order is base -> a -> b -> c -> d
            // This is the WYSIWYG approach, but is more verbose.

            a.pNext(b.address());
            b.pNext(c.address());
            c.pNext(d.address());
            base.pNext(a.address());

            assertEquals(base.pNext(), a.address());
            assertEquals(a.pNext(), b.address());
            assertEquals(b.pNext(), c.address());
            assertEquals(c.pNext(), d.address());
            assertEquals(d.pNext(), NULL);

            base.pNext(NULL);
            a.pNext(NULL);
            b.pNext(NULL);
            c.pNext(NULL);
            d.pNext(NULL);

            // Approach 4: use next unsafe pNext calls, final order is base -> a -> b -> c -> d
            // This is another WYSIWYG approach, but is more verbose and ugly.

            base
                .pNext(a
                    .pNext(b
                        .pNext(c
                            .pNext(d.address())
                            .address())
                        .address())
                    .address()
                );

            assertEquals(base.pNext(), a.address());
            assertEquals(a.pNext(), b.address());
            assertEquals(b.pNext(), c.address());
            assertEquals(c.pNext(), d.address());
            assertEquals(d.pNext(), NULL);

            base.pNext(NULL);
            a.pNext(NULL);
            b.pNext(NULL);
            c.pNext(NULL);
            d.pNext(NULL);
        }
    }

}
