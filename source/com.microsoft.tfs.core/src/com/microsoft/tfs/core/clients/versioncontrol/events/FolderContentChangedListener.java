// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

package com.microsoft.tfs.core.clients.versioncontrol.events;

import java.util.EventListener;

/**
 * Defines an interface for listeners of the {@link FolderContentChangedEvent}.
 *
 * @since TEE-SDK-11.0
 */
public interface FolderContentChangedListener extends EventListener {
    public void onFolderContentChanged(FolderContentChangedEvent e);
}
