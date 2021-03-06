/*
 * generated by Xtext
 */
package org.modelexecution.operationalsemantics.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.modelexecution.operationalsemantics.ui.internal.ActivityDiagramActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class ActivityDiagramExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return ActivityDiagramActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return ActivityDiagramActivator.getInstance().getInjector(ActivityDiagramActivator.ORG_MODELEXECUTION_OPERATIONALSEMANTICS_ACTIVITYDIAGRAM);
	}
	
}
