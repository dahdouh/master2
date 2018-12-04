/*
 * generated by Xtext 2.14.0
 */
package org.example.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.example.domainmodel.Domainmodel;
import org.example.domainmodel.DomainmodelPackage;
import org.example.domainmodel.Entity;
import org.example.domainmodel.InstructionMove;
import org.example.domainmodel.InstructionWait;
import org.example.domainmodel.StartPoint;
import org.example.services.DomainmodelGrammarAccess;

@SuppressWarnings("all")
public class DomainmodelSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DomainmodelGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == DomainmodelPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case DomainmodelPackage.DOMAINMODEL:
				sequence_Domainmodel(context, (Domainmodel) semanticObject); 
				return; 
			case DomainmodelPackage.ENTITY:
				sequence_Entity(context, (Entity) semanticObject); 
				return; 
			case DomainmodelPackage.INSTRUCTION_MOVE:
				sequence_InstructionMove(context, (InstructionMove) semanticObject); 
				return; 
			case DomainmodelPackage.INSTRUCTION_WAIT:
				sequence_InstructionWait(context, (InstructionWait) semanticObject); 
				return; 
			case DomainmodelPackage.START_POINT:
				sequence_StartPoint(context, (StartPoint) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Domainmodel returns Domainmodel
	 *
	 * Constraint:
	 *     elements+=Type+
	 */
	protected void sequence_Domainmodel(ISerializationContext context, Domainmodel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type returns Entity
	 *     Entity returns Entity
	 *
	 * Constraint:
	 *     (name=ID superType=[Entity|ID]? startPoint=StartPoint)
	 */
	protected void sequence_Entity(ISerializationContext context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Instruction returns InstructionMove
	 *     InstructionMove returns InstructionMove
	 *
	 * Constraint:
	 *     (from=INT to=INT qty=INT filter=INT?)
	 */
	protected void sequence_InstructionMove(ISerializationContext context, InstructionMove semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Instruction returns InstructionWait
	 *     InstructionWait returns InstructionWait
	 *
	 * Constraint:
	 *     tps=INT
	 */
	protected void sequence_InstructionWait(ISerializationContext context, InstructionWait semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DomainmodelPackage.Literals.INSTRUCTION_WAIT__TPS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainmodelPackage.Literals.INSTRUCTION_WAIT__TPS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getInstructionWaitAccess().getTpsINTTerminalRuleCall_1_0(), semanticObject.getTps());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     StartPoint returns StartPoint
	 *
	 * Constraint:
	 *     instructions+=Instruction*
	 */
	protected void sequence_StartPoint(ISerializationContext context, StartPoint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
