package org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic;

import activitydiagram.ActivityEdge;
import activitydiagram.ActivityNode;
import activitydiagram.ActivitydiagramFactory;
import activitydiagram.BooleanValue;
import activitydiagram.BooleanVariable;
import activitydiagram.ControlFlow;
import activitydiagram.Offer;
import activitydiagram.Token;
import activitydiagram.Value;
import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityEdgeAspectActivityEdgeAspectProperties;
import org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityNodeAspect;
import org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.BooleanVariableAspect;
import org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.NamedElementAspect;

@Aspect(className = ActivityEdge.class)
@SuppressWarnings("all")
public class ActivityEdgeAspect extends NamedElementAspect {
  public static void sendOffer(final ActivityEdge _self) {
    org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityEdgeAspectActivityEdgeAspectProperties _self_ = org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityEdgeAspectActivityEdgeAspectContext.getSelf(_self);
    _privk3_sendOffer(_self_, _self);
  }
  
  public static void clearOffer(final ActivityEdge _self) {
    org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityEdgeAspectActivityEdgeAspectProperties _self_ = org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityEdgeAspectActivityEdgeAspectContext.getSelf(_self);
    _privk3_clearOffer(_self_, _self);
  }
  
  public static void takeOfferedTokens(final ActivityEdge _self) {
    org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityEdgeAspectActivityEdgeAspectProperties _self_ = org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityEdgeAspectActivityEdgeAspectContext.getSelf(_self);
    _privk3_takeOfferedTokens(_self_, _self);
  }
  
  public static void transferTokens(final ActivityEdge _self) {
    org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityEdgeAspectActivityEdgeAspectProperties _self_ = org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityEdgeAspectActivityEdgeAspectContext.getSelf(_self);
    _privk3_transferTokens(_self_, _self);
  }
  
  public static boolean evaluateGuard(final ActivityEdge _self) {
    org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityEdgeAspectActivityEdgeAspectProperties _self_ = org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityEdgeAspectActivityEdgeAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_evaluateGuard(_self_, _self);
    return (boolean)result;
  }
  
  public static List<Offer> offers(final ActivityEdge _self) {
    org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityEdgeAspectActivityEdgeAspectProperties _self_ = org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityEdgeAspectActivityEdgeAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_offers(_self_, _self);
    return (java.util.List<activitydiagram.Offer>)result;
  }
  
  public static void offers(final ActivityEdge _self, final List<Offer> offers) {
    org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityEdgeAspectActivityEdgeAspectProperties _self_ = org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityEdgeAspectActivityEdgeAspectContext.getSelf(_self);
    _privk3_offers(_self_, _self,offers);
  }
  
  protected static void _privk3_sendOffer(final ActivityEdgeAspectActivityEdgeAspectProperties _self_, final ActivityEdge _self) {
    final Offer offer = ActivitydiagramFactory.eINSTANCE.createOffer();
    EList<Token> _offeredTokens = offer.getOfferedTokens();
    ActivityNode _source = _self.getSource();
    EList<Token> _heldTokens = _source.getHeldTokens();
    _offeredTokens.addAll(_heldTokens);
    EList<Offer> _offers = _self.getOffers();
    _offers.add(offer);
  }
  
  protected static void _privk3_clearOffer(final ActivityEdgeAspectActivityEdgeAspectProperties _self_, final ActivityEdge _self) {
    EList<Offer> _offers = _self.getOffers();
    _offers.clear();
  }
  
  protected static void _privk3_takeOfferedTokens(final ActivityEdgeAspectActivityEdgeAspectProperties _self_, final ActivityEdge _self) {
    final ArrayList<Token> tokens = new ArrayList<Token>();
    EList<Offer> _offers = _self.getOffers();
    final Consumer<Offer> _function = new Consumer<Offer>() {
      public void accept(final Offer o) {
        EList<Token> _offeredTokens = o.getOfferedTokens();
        tokens.addAll(_offeredTokens);
      }
    };
    _offers.forEach(_function);
    EList<Offer> _offers_1 = _self.getOffers();
    _offers_1.clear();
    ActivityNode _source = _self.getSource();
    EList<Token> _heldTokens = _source.getHeldTokens();
    int _size = _heldTokens.size();
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      ActivityNode _source_1 = _self.getSource();
      EList<Token> _heldTokens_1 = _source_1.getHeldTokens();
      _heldTokens_1.remove(0);
    }
    ActivityNode _target = _self.getTarget();
    ActivityNodeAspect.addTokens(_target, tokens);
    return;
  }
  
  protected static void _privk3_transferTokens(final ActivityEdgeAspectActivityEdgeAspectProperties _self_, final ActivityEdge _self) {
    ActivityEdgeAspect.sendOffer(_self);
    ActivityEdgeAspect.takeOfferedTokens(_self);
    return;
  }
  
  protected static boolean _privk3_evaluateGuard(final ActivityEdgeAspectActivityEdgeAspectProperties _self_, final ActivityEdge _self) {
    boolean _and = false;
    if (!(_self instanceof ControlFlow)) {
      _and = false;
    } else {
      BooleanVariable _guard = ((ControlFlow) _self).getGuard();
      boolean _notEquals = (!Objects.equal(_guard, null));
      _and = _notEquals;
    }
    boolean _not = (!_and);
    if (_not) {
      return true;
    }
    BooleanVariable _guard_1 = ((ControlFlow) _self).getGuard();
    BooleanVariableAspect.execute(_guard_1);
    BooleanVariable _guard_2 = ((ControlFlow) _self).getGuard();
    Value _currentValue = _guard_2.getCurrentValue();
    return ((BooleanValue) _currentValue).isValue();
  }
  
  protected static List<Offer> _privk3_offers(final ActivityEdgeAspectActivityEdgeAspectProperties _self_, final ActivityEdge _self) {
     return _self_.offers; 
  }
  
  protected static void _privk3_offers(final ActivityEdgeAspectActivityEdgeAspectProperties _self_, final ActivityEdge _self, final List<Offer> offers) {
    _self_.offers = offers; try {
    
    			for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    				if (m.getName().equals("set" + "Offers")
    						&& m.getParameterTypes().length == 1) {
    					m.invoke(_self, offers);
    
    				}
    			}
    		} catch (Exception e) {
    			// Chut !
    		} 
  }
}