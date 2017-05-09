package net.jplugin.core.kernel;

import net.jplugin.core.kernel.api.AbstractPlugin;
import net.jplugin.core.kernel.api.CoreServicePriority;
import net.jplugin.core.kernel.api.ExtensionPoint;
import net.jplugin.core.kernel.api.IAnnoForAttrHandler;
import net.jplugin.core.kernel.api.IStartup;

/**
 *
 * @author: LiuHang
 * @version 创建时间：2015-2-15 下午01:07:22
 **/

public class Plugin extends AbstractPlugin{

	public static final String EP_STARTUP = "EP_STARTUP";
	public static final String EP_ANNO_FOR_ATTR = "EP_ANNO_FOR_ATTR";

	public Plugin(){
		addExtensionPoint(ExtensionPoint.create(EP_STARTUP, IStartup.class));
		addExtensionPoint(ExtensionPoint.create(EP_ANNO_FOR_ATTR, IAnnoForAttrHandler.class));
	}
	/* (non-Javadoc)
	 * @see net.luis.common.kernel.api.AbstractPlugin#getPrivority()
	 */
	@Override
	public int getPrivority() {
		return CoreServicePriority.KERNEL;
	}

	/* (non-Javadoc)
	 * @see net.luis.common.kernel.api.IPlugin#init()
	 */
	public void onCreateServices() {
		
	}
	
	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

}
