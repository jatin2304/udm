def mt = ec.entity.makeValue("moquitraining.MoquiTraining")
mt.setAll(context)
if (!mt.trainingName) ec.message.addError("Training name is required")
mt.create()
context.response="Training ${context.trainingName} created successfully"